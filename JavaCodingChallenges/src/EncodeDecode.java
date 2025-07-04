import java.util.Base64;

public class EncodeDecode {

    public static void main(String[] args) {
        String originalText = "JavaRocks123!";

        // === Base64 Encoding & Decoding ===
        String encodedBase64 = base64Encode(originalText);
        String decodedBase64 = base64Decode(encodedBase64);

        System.out.println("Original Text     : " + originalText);
        System.out.println("Base64 Encoded    : " + encodedBase64);
        System.out.println("Base64 Decoded    : " + decodedBase64);

        // === Custom Caesar Cipher Encoding & Decoding ===
        int shift = 3; // Shift each character by 3 positions
        String encodedCaesar = caesarEncode(originalText, shift);
        String decodedCaesar = caesarDecode(encodedCaesar, shift);

        System.out.println("\nCaesar Encoded    : " + encodedCaesar);
        System.out.println("Caesar Decoded    : " + decodedCaesar);
    }

    // Base64 Encoding
    public static String base64Encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    // Base64 Decoding
    public static String base64Decode(String encoded) {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        return new String(decodedBytes);
    }

    // Caesar Cipher Encoding
    public static String caesarEncode(String input, int shift) {
        StringBuilder encoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            encoded.append((char) (c + shift));
        }
        return encoded.toString();
    }

    // Caesar Cipher Decoding
    public static String caesarDecode(String encoded, int shift) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encoded.toCharArray()) {
            decoded.append((char) (c - shift));
        }
        return decoded.toString();
    }
}
