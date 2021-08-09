public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        if (number < 10) {
            return 2 * number;
        }
        int digit = number % 10;
        int sum = digit;
        number /= 10;
        do {
            digit = number % 10;
            number /= 10;
        } while (number > 0);
        sum += digit;
        return sum;
    }
}
//    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(123));
//        System.out.println(sumFirstAndLastDigit(10));
//        System.out.println(sumFirstAndLastDigit(-10));
//    }
//}
//
