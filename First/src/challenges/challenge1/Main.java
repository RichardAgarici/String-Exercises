package challenges.challenge1;
import java.util.Scanner;

//Find if the email id is on gmail
//Find username and domain name form email
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String str ="programmer@gmail.com" ;
        String input = scanner.nextLine();
        System.out.println(findUserNameAndDomainName(input));

    }

    public static Boolean findIfGmail(String s) {
        return s.endsWith("@gmail.com");
    }
    public static String findUserNameAndDomainName(String s){
        String[] solution = s.split("@");
        String userName = solution[0].toLowerCase().trim();
        String email = solution[1].trim().toLowerCase();
        if(email.equals("gmail.com"))
         return "Username is : " + userName.trim().toLowerCase()+"\nEmail is : "+email +"\nThe email ends with @gmail.com";
        return "Username is : " + userName.trim().toLowerCase()+" and Email is : "+email;
    }
}
