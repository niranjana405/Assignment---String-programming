import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

    public static void printDuplicates(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Print characters with frequency > 1
        Set<Map.Entry<Character, Integer>> entrySet = charFrequency.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "aaabbbcccdddeee";
        System.out.println("Original String: " + inputString);

        System.out.println("Duplicate characters:");
        printDuplicates(inputString);
    }
}
