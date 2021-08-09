public class SumOddRange {
    public static boolean isOdd(int number) {
        return ((number > 0) && !(number % 2 == 0));
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        if (end >= start) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
//
//    public static void main(String[] args) {
////        System.out.println("(13,13): " + sumOdd(13,13));
//        System.out.println("(10,20): " + sumOdd(10,20));
//    }
//}
