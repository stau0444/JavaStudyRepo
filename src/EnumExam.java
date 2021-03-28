enum FoodType{
    KOREAN,JAPANESE,AMERICAN,ITALY;

}

public class EnumExam {

    FoodType foodType;

    public EnumExam(FoodType foodType){
        this.foodType = foodType;
    }

    public void EnumWithSwitch(){
        switch (foodType){
            case ITALY:
                System.out.println("이태리음식이다");
                break;
            case KOREAN:
                System.out.println("한국음식이다");
                break;
            case AMERICAN:
                System.out.println("미국음식이다");
                break;
            case JAPANESE:
                System.out.println("일본음식이다");
                break;
            default:
                System.out.println("음식이다");
                break;
        }
    }

    public static void main(String[] args) {


        //switch 문에서 enum 활용


        EnumExam enumExam = new EnumExam(FoodType.AMERICAN);
        enumExam.EnumWithSwitch();
    }
}

