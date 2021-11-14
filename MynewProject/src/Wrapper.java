public class Wrapper {
    public static void main(String[] args)
    {
        Integer i = 2;
        Double d = 3.5;
        System.out.println( i.intValue() );
        System.out.println( d.doubleValue() );

        String age = "20p";
        System.out.println("Age " + age + " in 10 years is " + (Integer.parseInt(age) + 10) );
        System.out.println("Note that + with strings does concatenation, not addition: " + (age + 10));
    }
}
public class Wrapper {
    public static void main (String args[]) {
        Integer i = 10;
        Integer j = 10;
        Integer k = 30;

// Comparing integers using compareTo
        System.out.println("Comparing using compareTo i and j: " + i.compareTo(j));
        System.out.println("Comparing using compareTo i and k: " + i.compareTo(k));

// Comparing integers using equal
        System.out.println("Comparing i and j using equals: " + i.equals(j));
        System.out.println("Comparing j and k using equals: " + j.equals(k));

// Comparing float using compare
        Float a = 2.22f;
        Float b = 3.2f;
        Float c = 3.2f;

        System.out.println("Comparing a and b using compare: " + Float.compare(a, b));
        System.out.println("Comparing b and c using compare: " + Float.compare(b, c));
    }
}
