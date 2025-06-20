import java.util.Scanner;

public class FahrenheitToCelsius {
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit -32) * 5 /9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsius = fahrenheitToCelsius(fahrenheit);
        // Display the result   
        // The format specifier %.2f means to format the number as a floating-point number with 2 decimal places and 
        // then %n is for new line
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);

        sc.close();
    }
}
