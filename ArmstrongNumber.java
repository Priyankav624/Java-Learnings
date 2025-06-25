import java.util.Scanner;

public class ArmstrongNumber {
    public static int armstrongNumber(int n){
        int result = 0;
        int number = n;
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        int value = n;
        while (value > 0) {
            int digit = value % 10;
            result += Math.pow(digit, count);
            value /= 10;
        }

        return result;
    }

    public static boolean armstrongNumbers(int n){
        if (n == armstrongNumber(n)) return true;
        else return false; 
    }

    public static void armstrongNumberInRange(){
        
        for(int i = 1001; i <2000; i++){
            if(armstrongNumbers(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int result = armstrongNumber(number);
        if (number == result) System.out.println("Armstrong number");
        else System.out.println("Not a armstrong number");
        armstrongNumberInRange();
        sc.close();
    }
}
