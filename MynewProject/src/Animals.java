package Polymorphism;

public class Animals {
    void eat() {
        System.out.println("Example of Run time polymorphism.");
        System.out.println("Animals");
    }
}

class herbivores extends Animals {
    void eat() {
        System.out.println("herbivores eat plants");
    }
}

class omnivores extends Animals {
    void eat() {
        System.out.println("omnivores eat plants and meat");
    }
}

class carnivores extends Animals {
    void eat() {
        System.out.println("carnivores eat meat");
    }
}

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
