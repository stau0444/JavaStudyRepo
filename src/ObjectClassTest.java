
import java.util.ArrayList;

class Phone implements Cloneable{

    private String phoneName;
    private ArrayList<String> owners = new ArrayList<>();

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

    public void setOwners(String owner) {
        this.owners.add(owner);
    }

    //부모 클래스의 clone을 호출하여 오버라이딩하고 있다.
    public Object clone(){
        try {
            Phone clonedPhone = (Phone)super.clone();
            //clonedPhone.owners = (ArrayList<String>) owners.clone();
            return clonedPhone;
        }catch (CloneNotSupportedException ex){
            return null;
        }
    }
}

public class ObjectClassTest {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.setPhoneName("iphone");
        phone1.setOwners("UGO");
        System.out.println("Phone1=="+phone1.getPhoneName()+",owner=="+phone1.getOwners());

        Phone phone2 = (Phone)phone1.clone();
        phone2.setOwners("HONG");
        System.out.println("Phone1=="+phone1.getPhoneName()+",owner=="+phone1.getOwners());
        System.out.println("Phone2=="+phone1.getPhoneName()+",owner=="+phone2.getOwners());

    }

}
