import java.util.Scanner;

public class GreatestLetter {
    public static char nextGreatestLetter(char[] arr, char x) {
            int start = 0;
            int end = arr.length -1;

            while(start <= end){
                int mid = start + (end - start)/2 ;
                if( x < arr[mid]) 
                    end = mid - 1;
                else 
                    start = mid + 1;
            }
            return arr[start % arr.length];
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letters = {'c', 'f', 'j'};  
        char target = 'c';

        char result = nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter: " + result);

        sc.close();
    }
    
}
