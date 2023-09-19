public class CharacterCounter {

    public static void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int specialCharacters = 0;

        str = str.toLowerCase(); // Convert the string to lowercase for easier comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of special characters: " + specialCharacters);
    }

    public static void main(String[] args) {
        String inputString = "Hello World!123";
        System.out.println("Input String: " + inputString);

        countCharacters(inputString);
    }
}
