import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b){
        // System.out.println("Swaped: " + b + " " + a);

        int temp = b;
        b = a;
        a = temp;
        System.out.println(a + " " + b); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }
}
