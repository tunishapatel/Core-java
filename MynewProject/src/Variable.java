public class Variable
{

    int var = 8;

}

class Number extends Variable {

    int var = 10;
    void display(){

        System.out.println(super.var);
    }
    public static void main (String args[]){

        Number num = new Number();
        num.display();

    }
}