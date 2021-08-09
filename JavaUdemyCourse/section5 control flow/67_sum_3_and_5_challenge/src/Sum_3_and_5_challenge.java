public class Sum_3_and_5_challenge {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
            }
            if(count==5) {
                break;
            }
        }
        System.out.println("Count of divisible numbers:" + count);
        System.out.println("Sum of divisible numbers:" + sum);
    }
}
