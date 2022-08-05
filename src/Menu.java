import java.util.Scanner;

public class Menu {
    // public methods for each different menu option
    public static void mainMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Aritmeticas");
        System.out.println("2. Trigonometricas");
        System.out.println("3. Estadisiticas");
        System.out.println("4. Calculo");
        System.out.println("5. Salir");
    }
    public static void aritmeticasMenu() {
        System.out.println("=== ARITMETICAS ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
    }

    public static void trigonometricasMenu() {
        System.out.println("=== TRIGONOMETRICAS ===");
        System.out.println("1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        System.out.println("4. Salir");
    }

    public static void estadisticaMenu() {
        System.out.println("=== Estadistica ===");
        System.out.println("1. Promedio");
        System.out.println("2. Media");
        System.out.println("3. Moda");
        System.out.println("4. Varianza");
        System.out.println("5. Desviacion Estandar");
        System.out.println("6. Salir");
    }

    public static void calculoMenu() {
        System.out.println("=== CALCULO ===");
        System.out.println("1. Resolver sistema de ecuaciones lineales NxN con Gauss-Jordan");
        System.out.println("2. Salir");
    }
}

