import java.util.Scanner;

public class EculideanHcfandLcm {
    
    public static int hcf(int a , int b){
        while (b != 0) {
            int temp = b; 
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF: " + hcf(a, b));
        System.out.println("LCM: " + lcm(a, b));
        sc.close();

    }
}
