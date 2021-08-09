public class DigitSumChallenge {
    static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            System.out.println("Single digit number");
            return number;
        }
        // All conditions valid to process:
        int digit;
        int sum = 0;
        while (number > 0) {
            digit = number % 10; // Extract right most digit
            sum += digit; // add digit to sum
            number = number / 10; // drop least significant digit as it is added to sum.
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("999: " + sumDigits(999) );
        System.out.println("43: " + sumDigits(43) );
        System.out.println("-141: " + sumDigits(-141) );
    }
}
