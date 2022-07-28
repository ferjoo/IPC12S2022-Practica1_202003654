import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int menuOption;
        Menu menu = new Menu();
        do{
            menu.mainMenu();
            try {
                menuOption = sn.nextInt();
                switch (menuOption) {
                    case 1:
                        menu.aritmeticasMenu();
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
                sn.next();
            }
        }
        while (!exit) ;
    }

}