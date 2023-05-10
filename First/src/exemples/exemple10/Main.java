package exemples.exemple10;

public class Main {
    public static void main(String[] args) {
        String str1="abBcdef";
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));

        String str2="aabbaaccaabb";
        System.out.println(str2.matches("[abc]*"));

String e3 =str2.intern();
        System.out.println(e3);
    }
}
