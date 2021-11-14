public abstract class A2 {
    abstract int getRateOfInterest();
}
// Create a class called SBI 
class SBI extends A2 {
    int getRateOfInterest() {
        return 7;
    }
}
// Create a class called PNB 
class PNB extends A2 {
    int getRateOfInterest() {
        return 8;
    }
}
// Create a class called TestBank
class TestBank {
    public static void main(String args[]) {
        A2 b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}. 
