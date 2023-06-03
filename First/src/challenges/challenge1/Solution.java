package challenges.challenge1;

public class Solution {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String userName = str.substring(0,i);
        String domain = str.substring(i+1);
        System.out.println("User name :"+userName+"\nDomain name :"+domain);

        System.out.println(domain.startsWith("gmail"));
    }
}
