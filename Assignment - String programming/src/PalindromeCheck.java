public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int length = str.length();

        // Compare characters from start and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "2552";
        System.out.println("Input String: " + inputString);

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
