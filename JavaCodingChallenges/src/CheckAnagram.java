import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";
        checkAnagramUsingArraySort(str1,str2);
        checkAnagramUsingMap(str1,str2);

    }

    public static void checkAnagramUsingMap(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Given Strings are not the Anagrams");
            return;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : str1.toLowerCase().toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toLowerCase().toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (map1.equals(map2)) {
            System.out.println("Given Strings are the Anagrams");
        } else {
            System.out.println("Given Strings are not the Anagrams");
        }
    }


    public static void checkAnagramUsingArraySort(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Given Strings are the Anagrams");
        } else {
            System.out.println("Given Strings are not the Anagrams");
        }
    }
}


