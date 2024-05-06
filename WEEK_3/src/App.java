public class App {
    public static void main(String[] args) throws Exception {

        /**==================Task 1 Start ============================ */
        int[] arr= {2, 5, 8, 5, 3, 7, 9, 5, 4, 1};
        
        int target = 5;
        
        boolean skipFirstOccurrence = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i < 5) {
                    skipFirstOccurrence = true;
                    continue; 
                } else {
                    System.out.println("First occurrence of " + target + " found at position " + i);
                    break; 
                }
            }
        }
        
        if (skipFirstOccurrence) {
            System.out.println("First occurrence of " + target + " is less than position 5. Skipping...");
        }   
        /**==================Task 1 End ============================ */

        /**==================Task 2 Start============================ */
        int[] arr2 = {5, 10, 15, 20, 25};

        int sum = calculateSum(arr2);
        double average = calculateAverage(arr2);

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        /**==================Task 2 End ============================ */




     }


     public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
}
