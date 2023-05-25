import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();

        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed = reversed.reverse();

        return str.equals(reversed.toString());
    }
}
