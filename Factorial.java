import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int fact = 1;
        if(input == 0) fact = 1; 
        else {
            for(int i =1; i<= input; i++){
                fact *= i;
            }
        }
        System.out.println(fact);
        System.out.println(fact(input));
        sc.close();
    }
}
