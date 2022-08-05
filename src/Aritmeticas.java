import java.util.Scanner;

public class Aritmeticas {
    static Scanner scanner = new Scanner(System.in);
    public static void aritmeticas(int selectedOption) {
        switch (selectedOption) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 5:
                potencia();
                break;
            default:
                break;
        }
    }

    private static void potencia() {
        System.out.println("=== POTENCIA ===");
        System.out.println("Ingrese la base");
        double value1  = scanner.nextDouble();
        System.out.println("Ingrese el exponente");
        double value2  = scanner.nextDouble();
        if(value2 != 0) {
            double result = Helpers.pow(value1, value2);
            System.out.println("El resultado es: " + result);

        } else {
            System.out.println("El exponente debe ser mayor a 0");
        }
    }

    private static void division() {
        System.out.println("=== DIVISION ===");
        System.out.println("Ingrese el dividendo");
        int value1  = scanner.nextInt();
        System.out.println("Ingrese el divisor");
        int value2  = scanner.nextInt();
        if(value1 != 0 || value2 != 0) {
            int result = value1 / value2;
            System.out.println("El resultado es: " + result);

        } else {
            System.out.println("No es posible dividir entre 0");
        }
    }

    private static void multiplicacion() {
        System.out.println("=== MULTIPLICACION ===");
        System.out.println("Ingrese el primer valor");
        int value1  = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int value2  = scanner.nextInt();
        int result = value1 * value2;
        System.out.println("El resultado es: " + result);
    }

    private static void resta() {
        System.out.println("=== RESTA ===");
        System.out.println("Ingrese el primer valor");
        int value1  = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int value2  = scanner.nextInt();
        int result = value1 - value2;
        System.out.println("El resultado es: " + result);
    }

    private static void suma() {
        System.out.println("=== SUMA ===");
        System.out.println("Ingrese el primer valor");
        int value1  = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int value2  = scanner.nextInt();
        int result = value1 + value2;
        System.out.println("El resultado es: " + result);
    }
}
