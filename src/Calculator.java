public interface Calculator {

    default int addEvneNums(int ... nums){
        return add(n -> n%2 == 0, nums);
    }

    default int addOddNums(int ... nums){
        return add(n -> n%2 !=0, nums);
    }

    private
}
