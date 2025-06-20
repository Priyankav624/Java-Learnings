public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting (widening conversion)
        byte byteValue = 10;
        short shortValue = byteValue; // byte to short
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        // Explicit type casting (narrowing conversion)
        double anotherDouble = 500.45;
        float anotherFloat = (float) anotherDouble; // double to float
        long anotherLong = (long) anotherFloat; // float to long
        int anotherInt = (int) anotherLong; // long to int
        // Note: The following line will cause a loss of precision
        byte anotherByte = (byte) anotherInt; // long to byte (commented out to avoid loss of precision)

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Byte value: " + anotherByte); // Displaying byte value safely
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Float value: " + anotherFloat);
        System.out.println("Long value: " + anotherLong);
        System.out.println("Int value: " + anotherInt);
    }
}
