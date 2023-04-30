package exemple4;

public class Main {
    public static void main(String[] args) {
        String str1="Java Program";
        System.out.println(str1);

        String str2=new String("JAVA");
        System.out.println(str2);

        char c[]= {'H','e','l','l','o'};
        String str3 = new String(c);
        String str5 = new String(c,2,3);
        System.out.println(str5);
        System.out.println(str3);

        byte d[]= {65,66,67,68} ;
        String str4= new String(d,2);
        System.out.println(str4);
        str3.substring(1);
    }
}
