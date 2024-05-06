import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();

                int sum = num1 + num2;
                System.out.println(STR."Sum: \{sum}");

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
