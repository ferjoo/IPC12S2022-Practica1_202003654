import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int menuOption;
        Menu menu = new Menu();
        // loop for main menu until exit is selected
        do{
            // invoke menu to show options
            menu.mainMenu();
            // try catch for invalid characters in selections and operations
            try {
                menuOption = scanner.nextInt();
                int selectedOption;
                switch (menuOption) {
                    case 1:
                        // internal loop for submenu until exit option is selected
                        do {
                            // invoke menu to show options
                            menu.aritmeticasMenu();
                            // input for menu option
                            selectedOption = scanner.nextInt();
                            // invoke method to the internal class operation options
                            Aritmeticas aritmeticas = new Aritmeticas();
                            // send selected option to internal class
                            aritmeticas.aritmeticas(selectedOption);
                            // break loop if exit option is selected
                        } while (selectedOption != 6);
                        break;
                    case 2:
                        do {
                            menu.trigonometricasMenu();
                            selectedOption = scanner.nextInt();
                            Trigonometricas trigonometricas = new Trigonometricas();
                            trigonometricas.selectTrigonometricas(selectedOption);
                        } while (selectedOption != 4);
                        break;
                    case 3:
                        do {
                            menu.estadisticaMenu();
                            selectedOption = scanner.nextInt();
                            Estadistica estadistica = new Estadistica();
                            estadistica.estadistica(selectedOption);
                        } while (selectedOption != 6);
                        break;
                    case 4:
                        do {
                            menu.calculoMenu();
                            selectedOption = scanner.nextInt();
                            Calculo calculo = new Calculo();
                            calculo.calculo(selectedOption);
                        } while (selectedOption != 2);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Unicamente son validos los números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                // InputMismatchException is thrown when the user enters a character instead of a number
                throw new InputMismatchException("Unicamente son validos valores numericos");
            }
        }
        // break loop if exit option is selected
        while (!exit) ;
    }

}