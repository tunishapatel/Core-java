package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest{

    public static void main(String args[]) {

        System.out.println("Example of comparable: ");

        // Create ArrayList
        ArrayList < Student > al = new ArrayList < Student > ();
        al.add(new Student(1, "Tylor", 12));
        al.add(new Student(2, "Draco", 11));
        al.add(new Student(3, "Ron", 12));

        // Sorting of elements on the basis of age
        Collections.sort(al);

        for(Student st:al) {

            System.out.println(st.rollno+ " " +st.name+ " " +st.age);

        }

    }

}