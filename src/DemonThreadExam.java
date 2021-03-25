public class DemonThreadExam  implements Runnable{
    //자동저장 실행 여부 boolean
    static boolean autoSave = false;

    //Runnable 구현체
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //autoSave 작동
            if(autoSave){
                autoSave();
            }
        }
    }
    //자동 저장 코드
    public void autoSave(){
        System.out.println("자동저장");
    }

    //메인 스레드
    public static void main(String[] args) {

        //스레드 생성
        Thread thread = new Thread(new DemonThreadExam());
        //데몬스레드 지정
        thread.setDaemon(true);
        //스레드시작
        thread.start();

        //카운트 시작
        for (int i = 1; i<11; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //카운트가 5초가 되면 autoSave가 작동한다.
            if (i == 5){
                autoSave = true;
            }
        }
    }
}
