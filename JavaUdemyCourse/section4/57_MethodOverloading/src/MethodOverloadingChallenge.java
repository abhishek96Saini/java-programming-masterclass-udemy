public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentiMeters(0,1) + " cm");
        System.out.println(" " + calcFeetAndInchesToCentiMeters(13) + " cm");
        System.out.println(" "+ calcFeetAndInchesToCentiMeters(157) + " cm");
    }

    static double calcFeetAndInchesToCentiMeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (feet * 12 * 2.54) + (inches * 2.54);
        }
        return -1;
    }

    static double calcFeetAndInchesToCentiMeters(double inches) {
        if (inches >= 0) {
            // convert inches to feet and inches
            double feet = (int) inches/12;
            inches = inches >= 12 ? inches % 12 : inches;
            System.out.print(feet + " feet, " + inches + " inches");
            return calcFeetAndInchesToCentiMeters(feet, inches);
        }
        return -1;
    }
}
