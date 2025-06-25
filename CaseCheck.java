import java.util.Scanner;

public class CaseCheck {
    public static String caseCheck(char c){
        if( c == ' '){
            throw new IllegalArgumentException("String must not be null or empty");
        } else {
            if ( Character.isUpperCase(c) ) {
                return "Uppercase";
            } else if ( Character.isLowerCase(c) ) {
                return "Lowercase";
            } else {
                return "Neither uppercase nor lowercase";
            }
        }
    }

    // public static String caseCheck(char c){
    //     if(c == ' ') return "String must not be null or empty";
    //     else if(c >= 'a' && c <= 'z') return "Lowercase";
    //     else if(c >= 'A' && c <= 'Z') return "Uppercase";
    //     else return "Neither uppercase nor lowercase";
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char c = sc.next().trim().charAt(0);

        System.out.println(caseCheck(c));
        sc.close();
    }
}