import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int nums){
        int rev = 0;
        int num = nums;
        
        while(num > 0 ){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int number = sc.nextInt();
        System.out.println("Reveresed number: " + reverseNumber(number));
        sc.close();
    }
}
