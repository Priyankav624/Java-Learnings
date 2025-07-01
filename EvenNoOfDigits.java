//leetcode 1295

public class EvenNoOfDigits {

    public static int evenNoOfDigits(int[] arr){
        
        int result = 0;
        for(int i =0; i<arr.length; i++){

            // if (String.valueOf(arr[i]).length() % 2 == 0) result ++;  //O(n)
            // if( (int) (Math.log(arr[i]) + 1) % 2 == 0) result++;   // O(1)
            
            int count = 0;
            int val = arr[i];

            if(val == 0) count = 1;
            if(val < 0) val *= -1;
            while (val > 0) {
                count++;
                val /= 10;
            }
            if (count % 2 == 0) result++;
            else count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,34,23,34544,2324,-22, 0};
        System.out.println(evenNoOfDigits(arr));
    }
}