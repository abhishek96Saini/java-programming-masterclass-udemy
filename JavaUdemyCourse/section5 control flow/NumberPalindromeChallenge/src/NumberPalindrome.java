public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (((number < 0) && (number * (-1) < 11)) || (number > 0 && number < 11))
            return false;
        if (number < 0) {
            number = number * (-1);
        }
        int reverse = 0;
        int numcopy = number;
        do {
            int digit = numcopy % 10; //extract right most digit
            reverse = (reverse * 10) + digit; // add extract number to reverse
            numcopy = numcopy / 10;
        } while (numcopy > 0);

        return (reverse) == (number);
    }
}
//
//    public static void main(String[] args) {
//        System.out.println(isPalindrome(-222));
//        System.out.println(isPalindrome(11212));
//        System.out.println(isPalindrome(707));
//    }
//}
