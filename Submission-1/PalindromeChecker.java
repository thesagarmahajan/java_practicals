// Practical No. 6
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is NOT palindrome");
        }
    }
}