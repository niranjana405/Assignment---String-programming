public class PangramCheck {

    public static boolean isPangram(String str) {
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is an uppercase or lowercase letter
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue; // Skip non-alphabetic characters
            }

            mark[index] = true;
        }

        // Check if all letters are marked
        for (boolean b : mark) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "my mother is a very angry woman";
        System.out.println("Input String: " + inputString);

        if (isPangram(inputString)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
