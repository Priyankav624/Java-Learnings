import java.util.Scanner;

public class Palindrome {
    public static int palindrome(int n){
        int number = n;
        int rev = 0;
        while ( number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }

    public static String palindrome(String input){
        String value = input;
        String rev = "";
        int charValue = value.length() -1;

        while (charValue >= 0) {
            rev += value.charAt(charValue);
            charValue--;
        }
        // System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();
        if(n == palindrome(n)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        if(input.equalsIgnoreCase(palindrome(input))) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        sc.close();
    }
}
