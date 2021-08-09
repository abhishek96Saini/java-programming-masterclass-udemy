public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal % 5 == 0 && (goal / 5) <= bigCount) {
            return true;
        } else if (goal <= smallCount) {
            return true;
        } else {
            if(bigCount*5>goal){
                bigCount = goal/5; // goal = 6, bigCount = 7
             }
            goal -= (bigCount * 5); // subtract bigCount from goal;


            return (goal<= smallCount);
        }
    }

    public static void main(String[] args) {
        System.out.println("canPack(0,5,4): " + canPack(0, 5, 4));
        System.out.println("canPack(1,0,4): " + canPack(1, 0, 4));
        System.out.println("canPack(1,0,5): " + canPack(1, 0, 5));
        System.out.println("canPack(2,2,11): " + canPack(2, 2, 11));
        System.out.println("canPack(-3,2,12): " + canPack(-3, 2, 12));
        System.out.println("canPack(-3,2,2): " + canPack(-3, 2, 2));

        System.out.println("canPack(7, 0, 31): "+ canPack(7, 0, 31));
    }
}
