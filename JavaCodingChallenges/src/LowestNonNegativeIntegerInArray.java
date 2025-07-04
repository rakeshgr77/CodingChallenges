public class LowestNonNegativeIntegerInArray {
    public static void main(String[] args) {
        Integer[] numbers = {-11,2,-3,0,1,33,98};
        System.out.println(lowestNonNegativeIntegerInArray(numbers));
    }


    public static int lowestNonNegativeIntegerInArray(Integer[] numbers) {
        int low = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>=0 && numbers[i] < low) {
                low = numbers[i];
            }
        }

        return low;
    }
}
