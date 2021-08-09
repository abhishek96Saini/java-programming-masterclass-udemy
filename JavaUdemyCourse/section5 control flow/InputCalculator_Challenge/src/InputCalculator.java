import java.util.Scanner;

public class InputCalculator {

    //     public static void inputThenPrintSumAndAverage(){
    public static void main(String[] args) {
        int sum = 0;
//        long average = 0;
        int inputCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum += scanner.nextInt();
                inputCount++;
//                average = Math.round((double) sum / (++inputCount));
            } else {
                break;
            }
            scanner.nextLine();
        }
        // this is better as no unnecessary calculation of average in loop above.
         System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/inputCount));

//        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
