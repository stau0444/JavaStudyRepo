
//A1, A2는 A클래스를 extend 했다.
//A1, A2는 A클래스의 printHi를 overriding 했다.
class A{
    void printHi(){
        System.out.println("hi i am A");
    }
}

class A1 extends A{
    @Override
    void printHi() {
        System.out.println("hi i am A1");
    }
}

class A2 extends A{
    @Override
    void printHi() {
        System.out.println("hi i am A2");
    }
}

public class DynamicDispatchTest {

    public static void main(String[] args) {
        A a = new A();
        a.printHi();
        a = new A1();
        a.printHi();
        a = new A2();
        a.printHi();
    }
}
