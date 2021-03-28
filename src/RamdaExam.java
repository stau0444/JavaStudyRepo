public class RamdaExam {
    public static void main(String[] args) {
        //Object object = (a , b) -> a>b ? a:b

        //위의 람다식은 아래의 익명 객체로 구현된다.

        Object obj = new Object(){
            int max(int a , int b){
                return a>b? a:b;
            }
        };

        //obj.max()를 사용할 수 없다.
        //사용을 위해선 함수형 인터페이스를 정의해야한다.
        //int value = obj.max(3,5);
    }
}
