public class Helpers {
    // Helper function for common operations in the whole project
    public static double sqrt(double number) {
        double result;
        double root = number / 2;
        do {
            result = root;
            root = (result + (number / result)) / 2;
        } while ((result - root) != 0);
        return root;
    }
    public static double pow(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
