import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Duplicate {

    public static void main (String args[]) {
        System.out.println("Java find and remove duplicates: ");
        // create arraylist
        List < String > l = Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E");
        System.out.println(l.toString());
        Set < String > s = new LinkedHashSet < String > (l) ;
        System.out.println(s);
    }
}