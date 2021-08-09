public class Main {

    public static void main(String[] args) {
        byte byteVariable = 69;
        short shortVariable = 432;
        int intVariable = 4444;
        long longVariable = 50000 + 10 *(byteVariable + shortVariable + intVariable);
        System.out.println( "long variable: " + longVariable);

    }
}
