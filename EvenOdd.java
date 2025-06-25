import java.util.Scanner;

public class EvenOdd {
    public static String evenOdd(int n){
        if( n % 2 == 0) return "even";
        return "odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(evenOdd(input));
        sc.close();
    }
}
