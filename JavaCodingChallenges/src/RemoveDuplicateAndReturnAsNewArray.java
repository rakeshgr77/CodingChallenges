import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateAndReturnAsNewArray  {

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueArray = removeDuplicates(input);

        System.out.println("New array with unique elements: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();  // Preserves order and removes duplicates

        for (int num : arr) {
            set.add(num);
        }

        // Convert Set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}
