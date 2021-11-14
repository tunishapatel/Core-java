package Polymorphism;

public class Arithmetic {
    System.out.println("Example of compile-time polymorphism");
// sum three integers
    
    void sum(int i, int j) {
        int a = i + j;
        System.out.println("Sum of two integers: " + a);
    }
// sum three integers
    
    void sum(int i, int j, int k) {
        int b = i + j / k;
        System.out.println("Sum of three integers: " + b);
    }

    public static void main(String args[]) {
        Arithmetic Obj = new Arithmetic();
        Obj.sum(34, 45);
        Obj.sum(23, 20, 5);
    }
}

