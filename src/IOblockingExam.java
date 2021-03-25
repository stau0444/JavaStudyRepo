import java.util.Random;
import java.util.Scanner;

class CountTime extends Thread{
    @Override
    public void run() {
        for(int j = 1;  j<11; j++){
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class IOblockingExam {
    public static void main(String[] args) {


        Thread thread = new CountTime();
        Scanner scanner = new Scanner(System.in);
        Double firstNum =  Math.random()*10;
        Double secondNum = Math.random()*10;
        System.out.println(firstNum.intValue()+"+"+secondNum.intValue()+"=");

        thread.start();

        int i = scanner.nextInt();

        if(i == firstNum.intValue()+secondNum.intValue()){
            System.out.println("맞았다");
        }else{
            System.out.println("틀렸다");
        }
    }
}
