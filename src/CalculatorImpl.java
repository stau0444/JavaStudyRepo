public class CalculatorImpl implements Calculator{
    @Override
    public int plus(int i, int j) {
        return i+j;
    }

    @Override
    public int multiple(int i, int j) {
        return i*j;
    }
}

class Test{
    public static void main(String[] args) {
        Calculator cal = new CalculatorImpl();
        cal.plus(3,4);
        cal.multiple(4,5);
        //인터페이스에서 직접구현한 default 메서드를 바로 사용할 수 있다.
        cal.exec(4, 3);
        Calculator.exe2(3,4);
    }
}
