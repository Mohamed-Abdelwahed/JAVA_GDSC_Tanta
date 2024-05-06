import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        /** ==============================Task 1 start ===================================== */
        int age = 25;
        double height = 5.8;
        boolean isRaining = true;
        String cityName = "New York";
        
        
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("City Name: " + cityName);
        /** ==============================Task 1 End===================================== */


        /**=======================================Task 2 start ================================*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;

        System.out.println(STR."Sum: \{sum}");
        System.out.println(STR."Difference: \{difference}");
        System.out.println(STR."Product: \{product}");
        System.out.println(STR."Division: \{division}");

//        scanner.close();
        /**=======================================Task 2 End ================================*/



        /**=======================================Task 3 start ================================*/

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        /**=======================================Task 3 End ================================*/


        /**=======================================Task 4 Start ================================*/
        System.out.print("Enter weekday number (1-7): ");
        int weekdayNumber = scanner.nextInt();

        switch (weekdayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid weekday number.");
        }

        scanner.close();
        /**=======================================Task 4 End ================================*/


    }
}
