public class RemoveDuplicatesfromSortedArray {
     public static int removeDuplicates(int[] nums) {
        int j = 0;
         for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2,3};

        int k = removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
