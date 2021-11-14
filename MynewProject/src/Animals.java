package Polymorphism;

public class Animals {
    void eat() {
        System.out.println("Example of Run time polymorphism.");
        System.out.println("Animals");
    }
}
// Create a sub class herbivores 

class herbivores extends Animals {
    void eat() {
        System.out.println("herbivores eat plants");
    }
}
// Create a sub class omnivores

class omnivores extends Animals {
    void eat() {
        System.out.println("omnivores eat plants and meat");
    }
}
// Create a sub class carnivores

class carnivores extends Animals {
    void eat() {
        System.out.println("carnivores eat meat");
    }
}
// Create a class main

class main {
    public static void main(String args[]) {
        Animals A = new Animals();
        Animals h = new herbivores();
        Animals o = new omnivores();
        Animals c = new carnivores();

        A.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}
