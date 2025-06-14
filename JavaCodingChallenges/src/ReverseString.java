public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefg";

        String reverseStr = reverseString(str);
        System.out.println(reverseStr);

        System.out.println(reverseStringUsingForLoop(str));

    }

    public static String reverseString(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return reverseStr;
        /* you can directly print or choose to return it*/
    }

    public static String reverseStringUsingForLoop(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();

        /* you can directly print or choose to return it*/
    }
}
