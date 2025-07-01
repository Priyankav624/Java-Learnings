import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    
    public static int ls(int arr[], int target, int start, int end){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for(int i =start; i< end; i++){
            int element = arr[i];
            if(target == element) return i;     
        }
        return Integer.MAX_VALUE;
    }

    public static int[] ls2d(int[][] arr, int target){
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(target == arr[i][j]) return new int[]{i,j};  
            }   
        }
        return new int[]{-1,-1};
    }

    public static int[] maxandMin(int[][] arr){

        if (arr.length == 0) {
            return new int[]{};
        }
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] > max) max = arr[i][j];  
                if (arr[i][j] < min) min = arr[i][j];  
            }   
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4 ,5 ,6};
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        int start = 0;
        int end = 5;
        System.out.println(ls(arr, target,start,end));

        int[][] arr2d = { {1,2,3}, {5, 4,6}};
        System.out.println(Arrays.toString(ls2d(arr2d, target)));

        System.out.println(Arrays.toString(maxandMin(arr2d)));

        sc.close();
    }
}
