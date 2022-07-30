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
                switch (menuOption) {
                    case 1:
                        int selectedOption;
                        do {
                            menu.aritmeticasMenu();
                            selectedOption = scanner.nextInt();
                            Aritmeticas aritmeticas = new Aritmeticas();
                            aritmeticas.aritmeticas(selectedOption);
                        } while (selectedOption != 6);
                        break;
                    case 2:
                        menu.trigonometricasMenu();
                        break;
                    case 3:
                        menu.estadisticaMenu();
                        break;
                    case 4:
                        menu.calculoMenu();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Unicamente son validos los números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido, ingresa un numero");
                scanner.next();
            }
        }
        while (!exit) ;
    }

}