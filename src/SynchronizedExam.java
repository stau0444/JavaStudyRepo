import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Customer implements Runnable{
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();

            if(eatFood()){
                System.out.println(name+" ate a "+ food);
            }else {
                System.out.println(name+" failed to eat.:(");
            }
        }
    }
    boolean eatFood(){
        return table.remove(food);
    }
}

class Cook implements Runnable{
    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true){
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
        }
    }
}

class Table{
    String[] dishNames = {"donut", "donut","burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized  void add(String dish){
        while (dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting");

            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        dishes.add(dish);
        notify();
        System.out.println("Dishes:" + dishes.toString());
    }


    public boolean remove(String dishName){
        synchronized (this){
            String name = Thread.currentThread().getName();
            while(dishes.size() == 0){
                System.out.println(name+"is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                }catch (InterruptedException e){

                }
            }
            while(true){
                for(int i = 0; i<dishes.size(); i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
                        notify();
                        return true;
                    }
                }
                try {
                    System.out.println(name + " is waiting. ");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int dishNum(){return dishNames.length;}
}

class ThreadWait{
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cook(table),"COOK1").start();
        new Thread(new Customer(table,"donut"),"cust1").start();
        new Thread(new Customer(table,"burger"),"cust2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}