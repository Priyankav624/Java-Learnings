import java.util.Scanner;

public class Caluculator {

    public static int caluculator(int num1, int num2 , char operator){
        int answer = 0;

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                if (num2 == 0) throw new IllegalArgumentException("Number cant be divided by zero");
                answer = num1 / num2;
                break;
            case '%':
                if (num2 == 0) throw new IllegalArgumentException("Number cant be divided by zero");
                answer = num1 % num2;
                break;
            default:
                System.err.println("Enter valid operation");
                break;
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        char operator = sc.next().trim().charAt(0);

        System.out.println(caluculator(number1, number2, operator));
        sc.close();
    }
}
