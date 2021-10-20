public class Hierarchical1 {
    void eat (){System.out.println("eating...");}
}
class Cat extends Hierarchical1{
    void play(){System.out.println("playing...");}
}
class Kitten extends Hierarchical1{
    void walk(){System.out.println("walking...");}
}
class Test2{
    public static void main(String args[]){
        Kitten c = new Kitten();
        c.eat();
        c.walk();
    }
}
