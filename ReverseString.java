import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String input){
        String value = input;
        String rev = "";
        
        for( int i = value.length() - 1; i>= 0; i--){
            rev += value.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseString(input));
        sc.close();
    }
}