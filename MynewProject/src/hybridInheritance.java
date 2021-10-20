public class hybridInheritance {
    public void show() {
        System.out.println("HybridInheritance");
    }
}
    class GrandFather extends hybridInheritance {
        public void show() {
            System.out.println("I am a GrandFather.");
        }
    }

    class Father extends GrandFather {
        public void show() {
            System.out.println("I am a Father.");
        }
    }

    class Son extends Father {
        public void show() {
            System.out.println("I am a Son.");
        }
    }

    class Daughter extends Father {
        public void show() {
            System.out.println("I am Daughter.");
        }
    }
    class TestHybrid {
    public static void main(String args[]){

        Daughter obj = new Daughter();
        obj.show();

    }
    }


