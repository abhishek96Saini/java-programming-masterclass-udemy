public class MinutesAndSecondsClass {

    public static void main(String[] args) {

//        getDurationString(61, 0);
//        getDurationString(3945L);
        getDurationString(65L,45L);
    }

    public static void getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println(String.format("%02d", hours) + "h " + String.format("%02d", minutes) + "m " +
                String.format("%02d", seconds) + "s");
    }

    public static void getDurationString(long seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long minutes = seconds / 60;
        seconds = seconds % 60;
        getDurationString(minutes, seconds);
    }
}
