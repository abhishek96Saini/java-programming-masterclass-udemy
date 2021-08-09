public class MethodChallengeMain {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Aslam", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Baslam", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Caslam", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Daslam", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Easlam", position);
    }

    static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
        // better solution in terms of readability is below.

        int position = 4; // setting 4 as default if no conditions came out true.
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;

    }

}
