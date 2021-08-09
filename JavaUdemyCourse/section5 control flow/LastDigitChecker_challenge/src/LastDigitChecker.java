public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {

        return (isValid(first) && isValid(second) && isValid(third)) &&
                (first % 10 == second % 10 || second % 10 == third % 10 || first % 10 == third % 10);
    }

    public static boolean isValid(int number) {
        return (number > 9 && number < 1001);
    }

}
