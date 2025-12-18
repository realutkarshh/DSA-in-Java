import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Number is Palindrome: "+ isPalindrome(number));
    }
}
