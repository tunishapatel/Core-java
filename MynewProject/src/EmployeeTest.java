package Compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class EmployeeTest {

    public static void main (String args[]) {
        ArrayList < Employee > eal = new ArrayList < Employee > ();
        eal.add(new Employee(1, "Jason Cucullu", 25));
        eal.add (new Employee(2, "Emma Stone", 30));
        eal.add(new Employee(3, "Minnie Gardener", 28));

        //Sorting elements on the basis of name
        Comparator < Employee > cm1 = Comparator.comparing(Employee::getEmp_name,Comparator.nullsFirst(String::compareTo));
        Collections.sort(eal, cm1);
        System.out.println("Considers null to be less than non-null");
        for (Employee em: eal) {
            System.out.println(em.emp_id + " " + em.emp_name + " " + em.age);
        }

        //Sorting elements on the basis of age
        Comparator < Employee > cm2 = Comparator.comparing(Employee::getAge,Comparator.nullsFirst(Integer::compareTo));
        Collections.sort(eal, cm2);
        System.out.println("Considering null be less than null");
        for (Employee em: eal) {
            System.out.println(em.emp_id + " " + em.emp_name + " " + em.age);
        }
    }
}
