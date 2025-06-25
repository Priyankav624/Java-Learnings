import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n){
        int firstNo = 0;
        int secondNo = 1;

        for(int i = 0; i< n; i++){
            System.out.print(firstNo + " " );
            int result = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = result;
        }  

        //or
        // int result = 2;
        // while (result <= n){
        //     int temp = secondNo;
        //     secondNo = firstNo + secondNo;
        //     firstNo = temp;
        //     result++;
        // }

        // System.out.println(secondNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
