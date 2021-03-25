class ThreadWithClass extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.print(1);

            }

        }

    }

class ThreadWithRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.print(2); // 현재 실행 중인 스레드의 이름을 반환함.

        }

    }

}



public class MultiThreadExam {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println("메인메서드 실행");
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법

        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법
        thread1.start(); // 스레드1의 실행
        thread2.start(); // 스레드2의 실행

        try {
            thread1.join(); // 스레드1의 실행
            thread2.join(); // 스레드2의 실행
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("메인메서드 종료");
        System.out.println("소요시간:"+(System.currentTimeMillis()-startTime));
    }

}