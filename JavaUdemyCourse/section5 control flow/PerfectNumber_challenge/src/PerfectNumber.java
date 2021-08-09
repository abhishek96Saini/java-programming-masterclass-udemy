public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        if(num<1) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        return (sum-num==0);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }
}
