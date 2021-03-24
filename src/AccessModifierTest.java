import myclass.First;

public class AccessModifierTest {
    public static void main(String[] args) {
        PublicTest pt = new PublicTest();
        System.out.println(pt.getA());
    }
}

class PublicTest{

    private String a="abc";
    //public 메서드를 통해 private a에 접근할 수 있다.
    public String getA() {
        return a;
    }
}