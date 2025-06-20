import java.util.Scanner;

public class MaxAndMin {

    public static int findMax(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }

    public static int findMin(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }

    public static int[] findMaxAndMin(int[] nums){
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }else {
            int max = nums[0];
            int min = nums[0];
            for(int i =0; i< nums.length; i++) {
                if(nums[i] > max){
                    max = nums[i];
                }
                if(nums[i] < min){
                    min = nums[i];
                }
            }
            return new int[]{max, min};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] elements = new int[n];
        for(int i =0 ; i< n; i++) {
            elements[i] = sc.nextInt();
        }

        int[] result = findMaxAndMin(elements);
        System.out.println("Maximum: " + result[0]);
        System.out.println("Minimum: " + result[1]);

        // Finding maximum of three integers

        System.out.println();
        System.out.println("Enter three integers to find the maximum:");
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = findMax(a, b, c);
        System.out.println("Maximum of the three integers: " + max);
        sc.close();
    }
}
