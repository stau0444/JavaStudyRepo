enum Color{
    RED,GREEN,BLUE;

    Color() {
        System.out.println("생성자 호출됨:"+this.toString());
    }
    public void colorInfo(){
        System.out.println("색깔 상수 이넘");
    }
}

public class EnumExam2 {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1);
        c1.colorInfo();
    }
}
