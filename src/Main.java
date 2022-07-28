import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IPC12S2022-Practica1_202003654");
        Scanner Scanner = new Scanner(System.in);
        int selectedMenu = -1;
        while(selectedMenu < 1 || selectedMenu > 3) {
            System.out.println("===MENU===");
            System.out.println("1. Aritmeticas");
            System.out.println("2. Trigonometricas");
            System.out.println("3. Estadisticas");
            System.out.println("4. Calculo");
            System.out.println("5. Salir");
            if(Scanner.hasNextInt())
                selectedMenu = Scanner.nextInt();
        }

        switch(selectedMenu) {
            case 1:
                //do logic
                break;
            case 2:
                //do logic
                break;
            case 3:
                //do logic
                break;
            default:
                selectedMenu = -1;
        }
    }
}