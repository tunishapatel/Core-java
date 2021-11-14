// Create String method
public class StringMethod {
    public static void main(String arg[]) {
        String targetString = "Learn Java is fun";
        String s1 = "JAVA";
        String s2 = "Java";
        String s3 = "Hello Java";

        System.out.println("Char at index 2(third position: " + targetString.charAt(2));
        System.out.println("Concat: " + targetString.concat("-JAVA-"));
        System.out.println("Checking equals ignoring case: " + s2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " + s2.equals(s1));
        System.out.println("Checking length: " + targetString.length());
        System.out.println("Replacing function: " + targetString.replace("fun", "easy"));
        System.out.println("Substring: " + targetString.substring(8));
        System.out.println("Substring: " + targetString.substring(8, 12));
        System.out.println("Converting to lowercase: " + targetString.toLowerCase());
        System.out.println("Converting to Uppercase: " + targetString.toUpperCase());
        System.out.println("Trimming string: " + s3.trim());
        System.out.println("Searching s1 in targetString: " + targetString.contains(s1));
        System.out.println("Searching s2 in targetString: " + targetString.contains(s2));
    }
}
