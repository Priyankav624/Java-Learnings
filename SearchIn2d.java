import java.util.Arrays;

public class SearchIn2d {

    public static int[] searchIn2d(int[][] arr, int target){

        int row = 0;
        int col = arr.length -1;

        while (row < arr.length && col >= 0) {
            if(arr[row][col] == target) return new int[]{row,col};
            if(arr[row][col] < target) row++;
            else col--;
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[][] = {
            { 1,2,3,4 },
            {5,6,7,8 },
            {9,10,11,12},
            {15,16,17,18}};
        int target = 17;
        System.out.println(Arrays.toString(searchIn2d(arr, target)));
    }
}
