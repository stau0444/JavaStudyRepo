public class ThrowsTest {
    static void handlingException() throws Exception{

            throw new Exception();
    }

    public static void main(String[] args) {
        try {
            handlingException();
        }catch (Exception e){
            System.out.println("메인 메서드에서 예외 처리");
        }

    }
}
//출력값 :메인 메서드에서 예외 처리