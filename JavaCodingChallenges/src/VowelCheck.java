public class VowelCheck {
        public static void main(String[] args) {
            String input = "Hello World!";
            int count = countVowels(input);

            System.out.println("Number of vowels in \"" + input + "\": " + count);
        }

        public static int countVowels(String str) {
            int count = 0;
            str = str.toLowerCase();

            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            return count;
        }
    }


