public class Exercise3 {
    // Overloaded static method to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded static method to sum two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Overloaded static method to concatenate two strings
    public static String sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the sum method with integers
        int intResult = sum(50, 20);
        System.out.println("Sum of two integers: " + intResult);

        // Call the sum method with doubles
        double doubleResult = sum(10.5, 80.3);
        System.out.println("Sum of two doubles: " + doubleResult);

        // Call the sum method with strings
        String stringResult = sum("Hello, ", "World!");
        System.out.println("Sum of two strings: " + stringResult);
    }
}
