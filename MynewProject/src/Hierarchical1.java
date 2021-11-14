public class Hierarchical1 {
    void eat() {
        System.out.println("eating...");
    }
}
// create sub class cat of Hierarchical1
class Cat extends Hierarchical1 {
    void play() {
        System.out.println("playing...");
    }
}
// create sub class Kitten of Hierarchical1
class Kitten extends Hierarchical1 {
    void walk() {
        System.out.println("walking...");
    }
}
// Create a test class
class Test2 {
    public static void main(String args[]) {
        Kitten c = new Kitten();
        c.eat();
        c.walk();
    }
}
