public class AnimalInheritance {

    void eat() {
        System.out.println("eating...");
    }
}
// Create a sub class Dog
class Dog extends AnimalInheritance {
    void bark() {
        System.out.println("barking...");
    }
}
// Create a class called TestInheritance 
class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

