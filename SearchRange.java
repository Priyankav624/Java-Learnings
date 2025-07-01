import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] arr, int target){
        int first = findfirst(arr , target);
        int last = findlast(arr , target);
        return new int[]{first , last};
    }

    public static int findfirst(int arr[], int target){
        int start = 0 , first = -1;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2 ;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                first = mid;
                end = mid - 1;
            }
        }
        return first;
    }

    public static int findlast(int arr[], int target){{
        int start = 0 , last= -1;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2 ;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                last = mid;
                start = mid  +1;
            }
        }
        return last;
    }}
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
