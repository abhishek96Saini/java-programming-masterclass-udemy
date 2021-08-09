public class DiagonalStar {

    public static void printSquareStar(int num) {
        if (num > 4) {
            for (int i = 0; i < num; i++) {
                // print first and last row
                if (i == 0 || i == num - 1) {
                    for (int j = 0; j < num; j++) {
                        System.out.print("* ");
                    }
                } else { // intermediate column
                    for (int j = 0; j < num; j++) {
                        // checking for first or last column
                        if (j == 0 || j == num - 1 || (i == j) || j == num - 1 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            } // end of main loop
        } else
            System.out.println("Invalid Value");
    }

    public static void main(String[] args) {
        printSquareStar(5);
    }
}
