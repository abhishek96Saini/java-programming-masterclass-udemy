public class NumberOfDaysInMonth_13 {
    public static boolean isLeapYear(int year){
        return year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }
    public static int getDaysInMonth(int month, int year){
        if((month<1 || month>12) && (year<1 || year >9999)) {
            return -1;
        }
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:return 31;
            case 2: return isLeapYear(year)? 29:  28;
            default: return 30;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2020));
    }
}
