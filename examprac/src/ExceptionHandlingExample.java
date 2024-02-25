public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            // Catch block to handle ArithmeticException
            System.out.println("Exception caught: " + ex.getMessage());
        } finally {
            // Finally block to execute cleanup or finalization code
            System.out.println("Finally block executed");
        }

        // Code continues to execute after exception handling
        System.out.println("Program continues after exception handling");
    }

    // Method that may throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
