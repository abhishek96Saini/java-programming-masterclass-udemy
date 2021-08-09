public class NumberToWords {

    public static void numberToWords(int num) {
        if(num<0){
            System.out.println("Invalid Value");
        }
        int x=reverse(num);
        int count = getDigitCount(num);
        while (count>0) {
           num = x % 10;

            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            x /= 10;
            count--;
        }
    }

    public static int getDigitCount(int num){
        int count=0;
        if(num==0) {
            return 1;
        }
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

    public static int reverse(int num){
        int x=0;

        while(num!=0){
            x= x*10 + num%10 ;
            num/=10;
        }
        return x;
    }

    public static void main(String[] args) {
        numberToWords(1230040);
    }

}
