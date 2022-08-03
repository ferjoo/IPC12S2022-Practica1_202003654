import java.util.Scanner;

public class Trigonometricas {
    static Scanner scanner = new Scanner(System.in);
    static double x;
    static int n;
    public static void selectTrigonometricas(int selectedOption) {
        switch (selectedOption) {
            case 1:
                getNAndX();
                System.out.println("sin con math = " + Math.sin(x));
                System.out.println("sin(x) = " +  sinWithMaclaurinSeries(x, n));
                break;
            case 2:
                getNAndX();
                System.out.println("cos con math = " + Math.cos(x));
                System.out.println("cos(x) = " + cosWithMaclaurinSeries(x, n));
                break;
            case 3:
                getNAndX();
                System.out.println("Tangente con math" + Math.tan(x));
                System.out.println("tan(x) = " + tangent(sinWithMaclaurinSeries(x, n), cosWithMaclaurinSeries(x, n)));
                break;
            default:
                break;
        }
    }

    private static void getNAndX() {
        System.out.println("Ingrese el valor de x: ");
        x = scanner.nextDouble();
        System.out.println("Ingrese el valor de n: ");
        n = scanner.nextInt();
    }

    private static double sinWithMaclaurinSeries(double x, int n) {
        double Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += (Helpers.pow(-1, i) * Helpers.pow(x, 2 * i + 1)) / factorial(2 * i + 1);
        }
        return Sum;
    }

    private static double cosWithMaclaurinSeries(double x, int n) {
        double Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += (Helpers.pow(-1, i) * Helpers.pow(x, 2 * i)) / factorial(2 * i);
        }
        return Sum;
    }

    private static double tangent(double sin, double cos) {
        double result = (sin / cos);
        return result;
    }

    static double factorial(int n) {
        double fact=1;
        for(int i=2;i<=n;i++)  {
            fact = fact*i;
        }
        return fact;
    }
}
