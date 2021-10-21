public class Arrays {
    public static void main(String[] args){
        double[] myFirstArray = {0.0, 1.2, 2.4, 3.6, 8.8};
        System.out.println(myFirstArray.length);

        for(int i=0; i<myFirstArray.length; i++) {
            System.out.println(myFirstArray[i]);
        }

        double sum = 0;
        for(int i=0; i<myFirstArray.length; i++) {
            sum = sum + myFirstArray[i];
        }

        double min = myFirstArray[0];
        for(int i=0; i<myFirstArray.length; i++) {
            if (myFirstArray[i] < min)
                min = myFirstArray[i];
        }
        System.out.println("The sum is" + sum);
        System.out.println("The min value is" + min);
    }
}
