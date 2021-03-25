public class SingleThreadExam {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("실행");
        for(int i = 0; i<10; i++){
            System.out.print(1);
        }
        for (int i =0; i<10; i++){
            System.out.print(2);
        }
        System.out.println();
        System.out.println("종료");
        System.out.println("소요시간" + (System.currentTimeMillis()-startTime));
    }
}
