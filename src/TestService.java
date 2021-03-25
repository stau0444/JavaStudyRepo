public class TestService {
    static void TestMethod(int i) throws TestException{
        System.out.println("테스트 메서드 시작");
        if(i<0){
            throw new TestException("입력값은 0보다 커야한다.");
        }
        System.out.println("테스트 메서드 종료");
    }
}

class TestExam{
    public static void main(String[] args) {

        //RuntimeException이기 때문에 컴파일상 에러는 발생하지 않는다
        TestService.TestMethod(-1);
    }
}
