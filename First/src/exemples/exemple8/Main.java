package exemples.exemple8;

public class Main {
    public static void main(String[] args) {

        String str1="china wall";

        String str2=new String("china all");

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        System.out.println(str1.compareTo(str2));

        String str3="the great wall of china";

        System.out.println(str1.contains("wall"));

        String str4="the great wall";
        String str5=" of china";

        System.out.println(str4.contains("wall"));
        System.out.println(str4.concat(str5));
        System.out.println(str4+str5);

        String.valueOf(str4);

    }
}
