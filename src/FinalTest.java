
public class FinalTest {
    public static void main(String[] args) {
        //1.원시타입 객체
        //final int a = 1 ;
        //a = 3 ; //a는 상수로 선언되어 변경이 불가하다.

        //2. 오브젝트 타입 객체
        //final Person p = new Person("UGO");
        //다른 인스턴스를 대입할 수 없다 .
        //p = new Person("Hong");
        //하지만 immutable 하다는 것은 아니기 떄문에 필드의 변경은 가능하다.
        //p.setName("Hong");
        //System.out.println(p.name);
        //결과 Hong

        //3. 메서드 인자 (parameter)

//        Person p = new Person("UGO");
//        p.setName("asd");

        //4.멤버 변수



    }
}
final class Animal{

}

class Person{
    // static final 변수의 초기화
    //1.스테틱 초기화시 초기화됨
    static final String name;
    static {name = "ugo";}
    //2.스테틱 변수에 값을 직접 할당할 때
    static final int age = 10;

    //instance final 변수의 초기화
    //1.값과 함께 선언 시
    final String nameI = "ugo";
    //2.인스턴스 초기화 시
    final  int ageI;
    {ageI = 10;}
    //3.생성자에서
    public Person(int ageI) {
        //this.ageI = ageI;
    }
}