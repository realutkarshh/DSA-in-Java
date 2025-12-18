import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int n){
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}
