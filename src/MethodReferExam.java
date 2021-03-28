import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferExam {

    public static void main(String[] args) {
        Function<String,Integer> func = (s)->Integer.parseInt(s);
        Integer apply = func.apply("123");
        System.out.println(apply);
        Function<String,Integer> func2 = Integer::parseInt;
        Integer apply1 = func2.apply("1234");
        System.out.println(apply1);

        // 파라미터가 없는 생성자를 람다식으로
        Supplier<MyClass> c = ()->new MyClass();
        // 파라미터가 없는 생성자를 메서드 참조로 표현
        Supplier<MyClass> c2 = MyClass::new;
        // 파라미터가 있는 생성자를 메서드 참조로 표현
        Function<Integer,MyClass> c4 = MyClass::new;

        //객체를 반환해 준다.
        MyClass myClass = c.get();

        //int q=4 라는 멤버를 갖은 MyClass객체를 리턴한다
        MyClass myClass2 = c4.apply(4);
        int q = myClass2.getQ();
        //4
        System.out.println(q);

        //배열의 메서드 참조
        Function<Integer,int[]> f = int[]::new;
        int[] apply2 = f.apply(5);
        System.out.println(apply2.length);
    }
}
class MyClass {
    private int q;

    public int getQ() {
        return q;
    }

    public MyClass(){};

    public MyClass(int q) {
        this.q = q;
    }
}