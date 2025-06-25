import java.util.Scanner;

public class Leapyear {
    public static boolean leapyear(int num){
        
        if (num % 4 ==0 ) {
            if(num % 100 == 0){
                if (num % 400 == 0) {
                    return true;
                } return false;
            } return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(leapyear(number)) System.out.println(number + " is a leap year");
        else System.out.println(number+ " is not a leap year");
    }
}
