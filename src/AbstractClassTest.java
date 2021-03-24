abstract class Car{
    //일반 클래스와 같이 필드 , 생성자도 포함이 가능하다.
    public String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    //일반 메서드도 포함할 수 있다.
    public void drive(){
        System.out.println("달린다");
    }
    //하나 이상의 추상메서드를 포함해야 한다.
    abstract void accelerate();
}

// 자식클래스에서는 부모클래스의 추상 메서드를 반드시 오버라이딩해야한다.
class SportsCar extends Car{
   //부모 클래스에 생성자가 있기 떄문에 자식 클래스에서 부모의 생성자를 구현해야한다.
    public SportsCar(String carName) {
        super(carName);
    }

    @Override
    void accelerate() {
        System.out.println("100km/h");
    }
}
class Truck extends Car{
    //부모 클래스에 생성자가 있기 떄문에 자식 클래스에서 부모의 생성자를 구현해야한다.
    public Truck(String carName) {
        super(carName);
    }

    @Override
    void accelerate() {
        System.out.println("50km/h");
    }
}


public class AbstractClassTest {
    public static void main(String[] args) {
        //추상 클래스는 인스턴스화 할 수 없다 .
        //Car car =new Car();

        SportsCar sportsCar = new SportsCar("포르쉐");
        System.out.println(sportsCar.carName);
        sportsCar.drive();
        sportsCar.accelerate();
        Truck truck = new Truck("포터");
        System.out.println(truck.carName);
        truck.drive();
        truck.accelerate();
    }
}
