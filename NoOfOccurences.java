import java.util.Scanner;

public class NoOfOccurences {

    public static int[] countOccurences(int arr[],int nums, int target) {
        
        int count = 0 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        } 

        int number = nums;
        int countNo = 0;

        while (number > 0) {
            int digit = number%10;
            if(digit == target) countNo++;
            number /= 10;
        }
        return new int[]{count, countNo};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,3,23,1,2,3,1,1,0,0,1,1,1};
        int nums = 11454021; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the number of occurences");
        int target = sc.nextInt();
        int[] ans = countOccurences(arr, nums, target);
        System.out.println(ans[0]+ " " + ans[1]);
        sc.close();
    }
}
