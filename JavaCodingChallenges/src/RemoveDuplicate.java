import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    //This Question can be asked in two ways
    //1. Remove Duplicates from array
    //2. Display duplicates from array

    public static void main(String[] args) {
        int num[] = {1,45,6,78,1,45,9};

        removeDuplicateFromNumArray(num);

        String str = " RakeshRa";
        removeDuplicateFromString(str.toLowerCase().replaceAll("\\s+",""));

        //Simple way to just diplay distinct is using stream
        //If you want impress interviwer use below
        //use sorted() to dispaly in sorted order
        Arrays.stream(num).distinct().sorted().forEach(System.out::println);
    }

    public static void removeDuplicateFromNumArray(int nums[]){
        //we can remove duplicate using Set as set only allows unique values
        Set<Integer> newSet = new HashSet<>();
        //Use simple for loop for(int i = 0; i < nums.length; i++){} or ForEach
        for(int n:nums){
            newSet.add(n);
        }
        System.out.println(newSet);
    }

    public static void removeDuplicateFromString(String str){
        //we can remove duplicate using Set as set only allows unique values
        Set<Character> newSet = new HashSet<>();

        //Convert String to Character array
        char[] ch = str.toCharArray();

        for(Character c : ch){
            newSet.add(c);
        }
        System.out.println(newSet);

    }
}
