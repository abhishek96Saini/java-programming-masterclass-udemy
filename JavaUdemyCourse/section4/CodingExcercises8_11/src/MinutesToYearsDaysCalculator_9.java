public class MinutesToYearsDaysCalculator_9 {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        days = days % 365;
        System.out.println(minutes + " min = " + years + " y " + days + " d");
    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
        printYearsAndDays(525600);
    }
}
