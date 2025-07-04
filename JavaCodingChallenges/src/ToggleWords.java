public class ToggleWords {

    public static void main(String[] args) {
        String input = "Hello World 123!";
        String toggled = toggleCase(input);

        System.out.println("Original : " + input);
        System.out.println("Toggled  : " + toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // keep digits, spaces, punctuation unchanged
            }
        }

        return result.toString();
    }
}
