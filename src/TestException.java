public class TestException extends RuntimeException{
    public TestException(String msg){
        //super()로 부모생성자를 호출하고 msg 를 전달
        super(msg);
    }
    public TestException(Exception e){
        //super()로 부모생성자를 호출하고 Exception을 전달
        super(e);
    }
}
