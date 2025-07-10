//88 leetcode
import java.util.Arrays;

public class MergeSortedArray {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1 ;
        int j = n - 1;
        int k = m+n-1;

        while( i >= 0 && j>= 0){
            if( nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j>= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int m = 4, n = 5;
        int[] nums1 = new int[m + n];  
        int[] initialNums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 6, 7};

        for (int i = 0; i < m; i++) {
            nums1[i] = initialNums1[i];
        }

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}
