package myclass;
//같은 패키지 상속 관계에서 사용가능
public class Second extends First{
     String name = "Second";
     String parentName = super.name;
}
//같은 패키지 일반클래스에서 사용가능
class third{
     public static void main(String[] args) {
          First first = new First();
          System.out.println(first.name);
     }
}
