public class loop {
    public static void main(String args[]) {
        System.out.println("for loop");
// Create for loop for integer x        
        for (int x = 1; x < 11; x++) {
            System.out.println(x);
        }
// Create while loop for integer y
        System.out.println("while loop");
        int y = 1;
        while (y < 20) {
            System.out.println(y);
            y++;
        }
// Create do while loop for integer y
        System.out.println("do wile loop");

        do {
            System.out.println(y);
            y++;
        } while (y < 30);
    }
}
