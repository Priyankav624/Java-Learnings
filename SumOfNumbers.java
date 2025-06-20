import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");  
        float secondNumber = sc.nextFloat();
        //Type casting the float to int because the sum is expected to be an integer.
        int sum = (int) (firstNumber + secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        sc.close();
    }
}
