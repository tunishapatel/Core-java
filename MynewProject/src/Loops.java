public class Loops {
    public static void main(String args[]) {
// Create for loop
        int i, j, row = 6;
        for (i = 0; i < row; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
