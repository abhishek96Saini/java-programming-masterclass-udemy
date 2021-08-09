public class EventDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;
        if (number < 10) {
            return 2 * number;
        }
        int digit;
        int sum = 0;
        do {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        } while (number > 0);

        return sum;
    }
//}

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }
}
