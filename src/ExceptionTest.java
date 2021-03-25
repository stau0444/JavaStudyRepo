import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            int inputNum = scan.nextInt();
            if(inputNum == 10){
                System.out.println("10이다");
            }
            // 예외를 처리하길 원하는 실행코드를 try안에 정의
        }catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("숫자아님 예외터짐");
            //예상되는 예외 타입을 catch에 정의하고 그 예외가 일어날 시에
            //파라미터로 전달 받은 예외를 활용하여
            // 여기서 예외를 처리할 수 있다.
        }catch(NullPointerException e){
            //여러개의 catch 문을 통해
            // 여러 가지 예외를 받아낼 수 있다.
        }finally {
            //finally에는 예외 발생과 상관없이 무조건 실행 되는 코드를 정의
        }


        //Runtime Exception에 속하지 않는 예외는 심각한 오류를 발생시키기에
        //자바에서 반드시 예외처리하도록 강제한다.
        //write는 IOException의 처리를 강제하기 때문에  1번은 오류가 난다.
        //2번처럼 예외를 처리 해줘야한다

        //---1----
        byte[] list = {'a','b','c'};
        //System.out.write(list);
        //---2----
        byte[] list2 = {'a','b','c'};
        try {
            System.out.write(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

