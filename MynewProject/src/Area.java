public class Area {

    int length;
    int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);

    }
}
// create a main class

class Main {
    public static void main(String[] args) {
        Area rectangle = new Area(7, 9);
        rectangle.getArea();
    }
}

