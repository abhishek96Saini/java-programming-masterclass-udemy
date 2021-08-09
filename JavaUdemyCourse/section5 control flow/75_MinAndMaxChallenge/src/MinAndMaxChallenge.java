import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, // check value lesser than max value integer can have.
                max = Integer.MIN_VALUE; // check value greater than min value integer can have.

        boolean isInt = true; // control variable to allow exit of infinite loop.

        while (isInt) {
            System.out.println("Enter number: ");
            isInt = scanner.hasNextInt(); // check whether input is valid number or not.

            if (isInt) {
                int number = scanner.nextInt();
                max = Math.max(number, max);
                min = Math.min(number,min);

            } else {
                System.out.println("Invalid value. Exit program.");
                isInt= false;
            }
            scanner.nextLine();
        }
        System.out.println("Min:" + min + " Max: " + max);
        scanner.close();
    }
}
