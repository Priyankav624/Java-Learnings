public class BinarySearch {

    public static int bs(int arr[], int target){
        int start = 0; 
        int end = arr.length -1;

        boolean isAsc = arr[0] < arr[1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,3 , 4, 5, 6,7,67,90};
        int target = 67;
        System.out.println(bs(arr, target));
    }
}
