public class FloorOfAnumber {
    public static int floorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        // while(start <= end){
        //     int mid = start + (end - start) /2;
        //     if(target == arr[mid]) return arr[mid];
        //     else if (target > arr[mid]) start = mid + 1;
        //     else  end = mid - 1;
        // } return (end >= 0) ? arr[end] : -1;

          while (start <= end) {
                int mid = start + (end - start) / 2;
                if(target > arr[mid]) start = mid + 1;  
                else if (target < arr[mid]) end = mid -1;
                else return arr[mid];
        } return (end >= 0) ? arr[end]: -1;

    }

    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(floorOfANumber(arr , target));
    }
    
}
