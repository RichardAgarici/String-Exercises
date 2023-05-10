package exemples.exemple7;

public class Main {
    public static void main(String[] args) {

        String str1="JAVA";
        String str2="java";
        String str3="python";
        String str4="python";

        str3.equals(str4);
        str1.equals(str2);

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str2));






    }
}
