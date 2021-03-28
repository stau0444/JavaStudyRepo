import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaWithCollectionExam {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i ++){
            list.add(i);
        }
        //list의 모든 요소를 , 과 함께 출력한다.
        list.forEach(i-> System.out.print(i+","));

        System.out.println();

        //list에서 2 또는 3의 배수를 제거
        list.removeIf(i->i%2==0 || i%3==0);
        list.forEach(i-> System.out.print(i+","));

        System.out.println();

        //list의 모든 요소에 10을 곱한다.
        list.replaceAll(i->i*10);
        System.out.println(list);

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((k,v)-> System.out.println("{"+k+","+v+"}"));
    }
}
