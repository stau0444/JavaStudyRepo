


class Test1{

    public Object printHi() throws NullPointerException{
        return "hi i am test 1";
    }
}

class Test2 extends Test1{
    @Override                       //부모클래스 메서드의 접근제어자보다 좁은 범위의 접근제어자 사용 불가
    public String printHi(){ //부모클래스보다 더 큰 범위의 예외를 터뜨릴 수 없다
                                    //메소드 선언부는 기존 메소드와 같다
        return "hi i am test 1";    //반환 타입은 부모클래스 메소드의 반환타입
                                    //보다 작은 범위의 타입일 경우 변경가능 Object>String
    }
    public Object printHi(String hi){
        return hi;
    }
}

public class OverridingTest {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        test1.printHi();
        test2.printHi();
    }
}
