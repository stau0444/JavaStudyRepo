package myclass;

public class First{
    //같은 클래스 내에서 사용 가능
    protected String name = "ugo";
    public void printName(){
        System.out.println(name);
    }
}
//같의 패키지의 자식관계에서도 접근가능
class Test extends First{
    public String parentName = name;
}
