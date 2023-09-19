public class UniqueCharacters {

    public static boolean hasUniqueCharacters(String str) {
        // Assuming the string contains ASCII characters (0-127)
        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                return false; // Character already seen
            }

            charSet[val] = true;
        }

        return true; // All characters are unique
    }

    public static void main(String[] args) {
        String str1 = "abcdefg"; // All unique characters
        String str2 = "hello";   // Contains duplicate characters

        System.out.println("String \"" + str1 + "\" has all unique characters: " + hasUniqueCharacters(str1));
        System.out.println("String \"" + str2 + "\" has all unique characters: " + hasUniqueCharacters(str2));
    }
}
