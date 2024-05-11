import java.util.*;

public class WordCollectionApp {
    private Map<Character, List<String>> wordsMap;

    public WordCollectionApp() {
        wordsMap = new HashMap<>();
    }

    public void addWord(String word) {
        char firstLetter = Character.toLowerCase(word.charAt(0));
        if (!wordsMap.containsKey(firstLetter)) {
            wordsMap.put(firstLetter, new ArrayList<>());
        }
        wordsMap.get(firstLetter).add(word);
    }

    public void printAllLettersAndWords() {
        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printWordsOfLetter(char letter) {
        char lowerCaseLetter = Character.toLowerCase(letter);
        if (wordsMap.containsKey(lowerCaseLetter)) {
            List<String> words = wordsMap.get(lowerCaseLetter);
            System.out.println("Words starting with '" + lowerCaseLetter + "': " + words);
        } else {
            System.out.println("No words found for letter '" + lowerCaseLetter + "'.");
        }
    }

    public static void main(String[] args) {
        WordCollectionApp app = new WordCollectionApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Collection App!");

        while (true) {
            System.out.print("Enter a word (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (!input.isEmpty()) {
                app.addWord(input);
                System.out.println("Word added to collection.");
            } else {
                System.out.println("Invalid input. Please enter a word.");
            }
        }

        System.out.println("\nAll letters and corresponding words:");
        app.printAllLettersAndWords();

        System.out.print("\nEnter a letter to print words (or type 'exit' to quit): ");
        String letterInput = scanner.nextLine().trim();
        if (!letterInput.equalsIgnoreCase("exit")) {
            if (letterInput.length() == 1 && Character.isLetter(letterInput.charAt(0))) {
                app.printWordsOfLetter(letterInput.charAt(0));
            } else {
                System.out.println("Invalid input. Please enter a single letter.");
            }
        }

        scanner.close();
        System.out.println("\nThank you for using the Word Collection App!");
    }
}
