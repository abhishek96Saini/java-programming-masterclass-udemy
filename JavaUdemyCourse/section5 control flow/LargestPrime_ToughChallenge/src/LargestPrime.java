public class LargestPrime {
    public static int getLargestPrime(int num) {
        if (num < 2) {
            return -1;
        }
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                num /= i;
                i--; // decrement to find if the divided number is further divisible by the same factor.
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(42));
    }
}
