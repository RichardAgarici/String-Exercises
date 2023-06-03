package challenges.challenge3;
//Remove special characters from a string
//Remove extra spaces from string
//Find number of words in a String.

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scanner.nextLine();
        System.out.println(removeExtraSpaces(str));
        System.out.println(removeSpecialCharacters(str));
        System.out.println(findNumbersOfWords(str));
        System.out.println(removeAllSpaces(str));
    }

    public static String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }

    public static String removeAllSpaces(String str){
        return str.replaceAll("\\s", "");
    }

    public static String removeSpecialCharacters(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
//    ^ in regex is not.

    public static int findNumbersOfWords(String str) {
        var i = str.split("\\s+").length;
        return i;

    }
}
