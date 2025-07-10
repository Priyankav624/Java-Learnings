public class RotatedSortedArray {
    public static int search(int[] arr, int target) {
        return findPosition(arr, target);
    }

     public static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end ){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static int findPosition(int[] arr, int target){
        int pivot = pivotElement(arr);
        int first = binarySearch(arr, target, 0 , pivot- 1);
        if(first != -1) return first;
        return binarySearch(arr, target, pivot, arr.length -1);
    }

    public static int binarySearch(int[] arr, int target, int start ,int end){
        
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        int result = search(arr, target);
        System.out.println("Target found at index: " + result); 
    }
}
