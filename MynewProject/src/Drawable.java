interface Drawable {

    void Draw();
}
class A6 implements Drawable{
    public void Draw(){System.out.println("Draw a Triangle.");}

    public static void main(String args[]){
        A6 obj = new A6();
        obj.Draw();
    }
}

