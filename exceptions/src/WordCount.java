

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    
    public static void main(String[] args) {
        try {
            File file = new File("Lincoln.txt");
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            scanner.close();

            System.out.println("Number of words in the file: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
