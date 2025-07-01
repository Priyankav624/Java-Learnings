/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 //leetcode 1095

interface MountainArray {
    public int get(int index);
    public int length();
}

class TestMountainArray implements MountainArray {
    private int[] arr;

    public TestMountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}
 
public class FindMountainArray {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        return search(mountainArr, target);
    }

    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() -1;
        while(start < end){
            int mid = start + (end - start) /2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public static int search(MountainArray mountainArr, int target){
        int peek = peakIndexInMountainArray(mountainArr);
        int firstTry = binarySearch(mountainArr, target, 0, peek, true);
        if(firstTry != -1) return firstTry;
        return binarySearch(mountainArr, target, peek+1 ,mountainArr.length() -1, false);
    }

     public static int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAsc){

         while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;

            if (isAsc) {
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (val > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 5, 3, 1};
        int target = 3;

        MountainArray mountain = new TestMountainArray(testArray);
        int result = findInMountainArray(target, mountain);

        System.out.println("Target found at index: " + result); 
    }
}