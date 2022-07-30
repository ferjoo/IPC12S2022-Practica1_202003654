import java.util.Scanner;

public class Trigonometricas {
    static Scanner scanner = new Scanner(System.in);
    public static void selectTrigonometricas(int selectedOption) {
        switch (selectedOption) {
            case 1:
                sinWithMaclaurinSeries();
                break;
            case 2:
                //  coseno();
                break;
            case 3:
                //  tangente();
                break;
            default:
                break;
        }
    }

    private static void sinWithMaclaurinSeries() {
        System.out.println("Ingresa el valor de x");
        double x = scanner.nextDouble();
        double result = 0;
        double term = 0;
        double n = 0;
        double sign = 1;
        while (Math.abs(term) > 1e-15) {
            term = Math.pow(x, n) / factorial((int) n);
            result += term * sign;
            n++;
            sign *= -1;
        }
        System.out.println("El resultado es: " + result);
    }



    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
