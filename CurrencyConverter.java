import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double exchangeRate = 83.0; // 1 usd = 83 INR

        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();

        double usd = rupee / exchangeRate;

        System.out.printf("Amount in usd :$%.2f%n" , usd);
        sc.close();

    }
}
