
    import java.util.EnumSet;
    enum example
    {
        one, two, three, four, five
    };
    public class EnumSetExam
    {
        public static void main(String[] args)
        {
            // Creating a set
            EnumSet<example> set1, set2, set3, set4;

            // 지정한 enum 요소를 사용하여 enumSet을 만들어낸다.
            set1 = EnumSet.of(example.four, example.three,
                    example.two, example.one);
            //지정된 enumSet에서 포함되지 않은 요소를 사용하여 enumSet을 만든다.
            set2 = EnumSet.complementOf(set1);
            //enum의 모든 요소를 사용하여 enumSet을 만들어낸다
            set3 = EnumSet.allOf(example.class);
            //enum의 범위를 지정하여 enumSet을 만들어낸다
            set4 = EnumSet.range(example.one, example.three);
            System.out.println("Set 1: " + set1);
            System.out.println("Set 2: " + set2);
            System.out.println("Set 3: " + set3);
            System.out.println("Set 4: " + set4);
        }
    }

