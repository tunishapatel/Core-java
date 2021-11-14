class Handle {

    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
// throw an arithmaticexception            
            throw new ArithmeticException();
        } else {
            int c;
            c = a / b;
            System.out.println(c);
        }
    }

    public static void main(String args[]) {
        Handle h = new Handle();
//try, catch and final on arithmatic exception
        try {
            h.div(20, 0);
        } catch (ArithmeticException a) {
            System.out.println("Can't divide");
            int x = 11, y = 0, z;
            z = x * y;
            System.out.println(z);
        } finally {
            int p = 3, q = 1, r;
            r = p + q;
            System.out.println(r);
            System.out.println("Result");
        }

        System.out.println("Operation ended");
    }
}
