public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
//        if(hourOfDay<8 || hourOfDay>22)
//            return true;
        if (hourOfDay < 0 || hourOfDay > 23)  {

            return false;
        } else return isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
