package exemples.exemple9;

public class Main {
    public static void main(String[] args) {
        String str1="f";
        String str2="8";
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        String str3="sss";
        System.out.println(str3.matches("."));

        String str4="p";
        System.out.println(str4.matches("[^abc]"));

        String str5="b";
        System.out.println(str5.matches("[abc]"));

        String str6="p";
        System.out.println(str6.matches("[a-z]"));

        String str7="A";
        System.out.println(str7.matches("[a-z0-9]"));

        String str8="a7";
        System.out.println(str8.matches("[a-z][0-9]"));

        String str9="a";
        System.out.println(str9.matches("a|b"));

        String str10="a";
        System.out.println(str10.matches("\\w "));

        



    }
}
