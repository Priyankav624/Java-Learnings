import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];

        for(int row = 0; row < arr.length; row++){
                System.out.println("Enter the size of row " + row);
                arr[row] = new int[sc.nextInt()];
        }
         for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++){
                System.out.println("Enter the value " + row + " " + col);
                arr[row][col] = sc.nextInt();
            }
        }
          for(int row = 0; row < arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));
        }
        sc.close();
    }
}
