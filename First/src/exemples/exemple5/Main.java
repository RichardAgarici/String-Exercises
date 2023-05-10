package exemples.exemple5;

public class Main {
    public static void main(String[] args) {
        String str =new String("netbeans");
        System.out.println(str.length());
        int lent = str.length();

        String str2=str.toUpperCase();
        System.out.println(str);
        System.out.println(str2);

        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str2);

        str="    neatbeans    ";
        str2=str.trim();
        System.out.println(str);
        System.out.println(str2);

        str=str2.substring(4);
//        str=str2.substring(4,4);
        System.out.println(str);
        System.out.println(str.replace('e','2'));
    }
}
