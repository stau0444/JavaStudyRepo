package test;

import myclass.First;
//다른 패키지 일반관계에서 사용불가
public class Forth {
    public static void main(String[] args) {
        First first = new First();
    }
}
//다른 패키지 상속관계에서 접근가능
class Fifth extends First{
    String parentName =  super.name;
}
