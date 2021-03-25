import java.io.IOException;

public class ExceptionHierarchyTest {
    public static void main(String[] args) {
        byte [] list = {'a','b','c'};

        try {
            System.out.write(list);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
