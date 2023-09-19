import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Create a LinkedHashSet to maintain the order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : chars) {
            set.add(c);
        }

        // Convert the LinkedHashSet back to a string
        StringBuilder result = new StringBuilder();
        for (Character c : set) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "aaabbbcccdddeee";
        System.out.println("Original String: " + inputString);

        String stringWithoutDuplicates = removeDuplicates(inputString);
        System.out.println("String without Duplicates: " + stringWithoutDuplicates);
    }
}
