public class FindNoOfArrayRotation {

    public static int findNoOfArrayRotation(int[] arr ){
        return findSmallElement(arr);
    }

    public static int findSmallElement(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 4,3,2,0,1};
        System.out.println(findNoOfArrayRotation(arr));
    }
}
