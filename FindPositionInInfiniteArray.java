public class FindPositionInInfiniteArray {
     public static int findpositioninInfiniteArray(int arr[], int target){
        int start = 0; 
        int end = 1;

        while (target > arr[end]) {
            end *= 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) start = mid + 1;  
            else if(target < arr[mid]) end = mid -1;
            else return mid;
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,3 , 4, 5, 6,7,67,90};
        int target = 67;
        System.out.println(findpositioninInfiniteArray(arr, target));
    }
}
