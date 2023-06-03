package challenges.challenge2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int b = 100800111;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        System.out.println(str.matches("[0-9A-F]+"));



    }
}
