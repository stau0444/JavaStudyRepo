
interface Animals{
    public void eat();
    public void sleep();
}

interface Dog{
    public void bark();
}
//인터페이스는 인터페이스 끼리만 상속 가능하다.
interface Human  extends Dog,Animals{
    public void work();
}

class Monkey {
    public void eatBanana(){
        System.out.println("바나나를 먹는다");
    };
}

//Monkey 클래스를 상속받으면서 Human 인터페이스를 구현하였다.
class Ugo extends Monkey implements Human{
    @Override
    public void eat() {
        System.out.println("먹어요");
    }

    @Override
    public void sleep() {
        System.out.println("자요");
    }

    @Override
    public void bark() {
        System.out.println("짖어요");
    }

    @Override
    public void work() {
        System.out.println("일해요");
    }
}


public class InterfaceTest{
    public static void main(String[] args) {
        //Human 클래스는 dog 와 animal을 상속받았고
        //ugo는 Human 인터페이스를 구현 하였다.
        //타입에 따른 변수접근 가능을 확인해보자
        //아래와 같이 레퍼런스에 따라 사용할 수 있는 구현체가 다르다
        Animals ugo = new Ugo();
        ugo.eat();
        ugo.sleep();

        Dog dogUgo = new Ugo();
        dogUgo.bark();

        Human humanUgo = new Ugo();
        humanUgo.work();
        humanUgo.bark();
        humanUgo.sleep();
        humanUgo.eat();

        //아래와 같이 Mokey 타입으로도 레퍼런스를 사용할 수 있다.
        Monkey monkeyUgo = new Ugo();
        monkeyUgo.eatBanana();
    }
}
