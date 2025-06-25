import java.util.Scanner;

public class LcmAndHcf {

    public static int hcf(int n1, int n2) {
        int result = 0;
        for(int i =1; i<100; i++){
            if( n1  % i == 0 && n2 % i == 0) 
                result = i;
        }
        return result;

    }
    public static int lcm(int n1, int n2){
        for(int i =1; i<100; i++){
            if( i  % n1 == 0 && i % n2 == 0) return i;
        }
        return - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(lcm(n1, n2));
        System.out.println(hcf(n1, n2));
    }
}
