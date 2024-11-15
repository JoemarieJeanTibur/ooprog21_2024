import java.util.Scanner;

public class PalindoromeChecker {
    
    private static Scanner tibur = new Scanner (System.in);

    public static void main(String[] a) {

        String inputString = getInputString("Enter a String: ");

        String cleanedString = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean isPalindrome = true;
        for (int i = 0, j = cleanedString.length() - 1; i < j; i++, j--) {
            if (cleanedString.charAt(i) != cleanedString.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This is a palindrome. ");
        } else {
            System.out.println("Incorrect!This is not a palindrome");
        }

        tibur.close();

    }

    private static String getInputString(String prompt) {
        System.out.println(prompt);
        return tibur.nextLine();
    }
}