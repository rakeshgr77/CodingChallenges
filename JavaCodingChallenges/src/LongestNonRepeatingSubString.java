import java.util.HashMap;

public class LongestNonRepeatingSubString {

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest Non-Repeating Substring: " + result);
        System.out.println("Length: " + result.length());
    }

    public static String longestUniqueSubstring(String s) {
        int left = 0, maxLength = 0, start = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already in the window, move `left` past its last occurrence
            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left; // store the start index of max window
            }
        }

        return s.substring(start, start + maxLength);
    }
}
