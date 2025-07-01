import java.util.Scanner;

public class MultiplicationTable {
    public static void multiply(int n){

        for(int i = 1; i <= n; i++){
            System.out.println( n + " * " + i + " = " + n * i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        multiply(n);
        sc.close();

    }
}
