import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean exitSubmenu = false;
        int menuOption;
        Menu menu = new Menu();
        do{
            menu.mainMenu();
            try {
                menuOption = scanner.nextInt();
                int selectedOption;
                switch (menuOption) {
                    case 1:
                        do {
                            menu.aritmeticasMenu();
                            selectedOption = scanner.nextInt();
                            Aritmeticas aritmeticas = new Aritmeticas();
                            aritmeticas.aritmeticas(selectedOption);
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
                throw new InputMismatchException("Unicamente son validos valores numericos");
            }
        }
        while (!exit) ;
    }

}