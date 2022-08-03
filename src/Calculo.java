import java.util.Scanner;

public class Calculo {
    static Scanner scanner = new Scanner(System.in);
    public static void calculo(int selectedOption) {
    // convert string separated by commas to array of strings
    String[] array = scanner.nextLine().split(",");
        switch (selectedOption) {
            case 1:
                gaussJordan();
                break;
            default:
                break;
        }
    }
    private static void gaussJordan() {
        int n;
        System.out.println("Ingresa el numero de filas");
        n = scanner.nextInt();
        System.out.println("Ingresa el numero de columnas");
        int m = scanner.nextInt();
        m=m+1;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            //print a message for the current row
            System.out.println("Ingresa los valores de la fila " + (i + 1));
            for (int j = 0; j < m; j++) {
                //print a message for the last column
                if (j == m - 1) {
                    System.out.println("Ingresa el valor del resultado");
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matriz es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
