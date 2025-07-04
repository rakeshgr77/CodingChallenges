public class PalendromeCheck {
    public static void main(String[] args) {
        int number = 1221;

        if (isPalindromeUsingString(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is NOT a Palindrome.");
        }
    }

    public static boolean isPalindromeUsingString(int num) {
        if (num < 0) return false;

        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
