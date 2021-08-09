public class Main {
    public static void main(String[] args) {
        double pound = 6;
        double kilogram = pound * 0.45359237; // Java assumes literal to be double as default
        System.out.printf("%.3f%n", kilogram); // display 3 decimal points

        double doubleVariable = 4_123_54.432_43_34; // using underscore to improve readability of literal.


        // 39 operator challenge
        double firstVariable = 20;
        double secondVariable = 80;
        System.out.println(firstVariable + "\n" + secondVariable);
        double thirdVariable = (firstVariable + secondVariable) *100;
        double remainder = thirdVariable % 40.0;
        System.out.println(remainder);
        boolean isRemainderZero = remainder == 0;
        if(!isRemainderZero)
        {
            System.out.println("Got some remainder");
        }


    }
}
