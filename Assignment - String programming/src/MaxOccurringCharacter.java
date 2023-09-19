public class MaxOccurringCharacter {

    public static char findMaxOccurringCharacter(String str) {
        int[] charCount = new int[128]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        int maxCount = -1;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] > maxCount) {
                maxCount = charCount[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char maxChar = findMaxOccurringCharacter(str);

        System.out.println("The maximum occurring character in the string is: " + maxChar);
    }
}
