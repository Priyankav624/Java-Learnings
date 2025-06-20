import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
       
        boolean isPrime = isPrime(input);

        if(isPrime) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
        
        sc.close();
    }

    public static boolean isPrime(int n) {
        int num = 2;
         if(n <= 1){
            return false;
        } else {
            // Check for factors from 2 to the square root of n because 
            // after that, factors will repeat.
            // for eg 2 is a prime no or not . 2 * 2 = 4 and its already greater than 2
            // so we can stop checking after 2 and then print it is a prime number.
            while(num * num <= n) {
                if(n % num == 0) return false;
                num++;
            }
        }

        return true;
    }
}
