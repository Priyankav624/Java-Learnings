public class CelsiusToFahrenheit {
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        // Convert Celsius to Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);
        // Display the result   
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        sc.close();
    }
}
