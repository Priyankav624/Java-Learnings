import java.util.Scanner;

public class LinearSearchString {

    public static boolean lss(String value, char target){
        if (value.equals("")) {
            return false;
        }
        // for(int i =0; i< value.length(); i++){
        //     int element = value.charAt(i);
        //     if(target == element) return i;     
        // }

        for(char letter: value.toCharArray()){
            if (letter == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = "Hello";
        System.out.println("Enter the character to be found: ");
        char target = sc.next().trim().charAt(0);
        System.out.println(lss(value, target));
        sc.close();
    }

}
