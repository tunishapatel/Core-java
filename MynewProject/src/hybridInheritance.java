public class hybridInheritance {
    public void show() {
        System.out.println("HybridInheritance");
    }
}
// Create a subclass GrandFather of hybridInheritance
class GrandFather extends hybridInheritance {
    public void show() {
        System.out.println("I am a GrandFather.");
    }
}
// Create a subclass Father of GrandFather
class Father extends GrandFather {
    public void show() {
        System.out.println("I am a Father.");
    }
}
// Create a subclass Son of Father
class Son extends Father {
    public void show() {
        System.out.println("I am a Son.");
    }
}
// Create a subclass Daughter of Father
class Daughter extends Father {
    public void show() {
        System.out.println("I am Daughter.");
    }
}
//Create a test class
class TestHybrid {
    public static void main(String args[]) {

        Daughter obj = new Daughter();
        obj.show();

    }
}


