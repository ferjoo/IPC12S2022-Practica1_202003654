public class Helpers {
    public static double sqrt(int number) {
        double result;
        double root = number / 2;
        do {
            result = root;
            root = (result + (number / result)) / 2;
        } while ((result - root) != 0);
        return root;
    }
    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
