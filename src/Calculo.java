import java.util.Scanner;

public class Calculo {
    static Scanner scanner = new Scanner(System.in);
    public static void calculo(int selectedOption) {
        switch (selectedOption) {
            case 1:
                gaussJordan();
                break;
            default:
                break;
        }
    }
    private static void gaussJordan() {
        int piv = 0;
        System.out.println("Ingresa el numero de filas");
        int n = scanner.nextInt();
        System.out.println("Ingresa el numero de columnas");
        int m = scanner.nextInt();
        if(n==m) {
            m=m+1;
            float[][] matriz = new float[n][m];

            for (int i = 0; i < n; i++) {
                //print a message for the current row
                System.out.println("Ingresa los valores de la fila " + (i + 1));
                for (int j = 0; j < m; j++) {
                    //print a message for the last column
                    if (j == m - 1) {
                        System.out.println("Ingresa el valor del resultado");
                    }
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // return m to the original value
            m=m-1;

            for (int a = 0; a < m; a++) {
                pivotMatrix(matriz, piv, m);
                increaseMatrix(matriz, piv, m);
                piv++;
            }
            for (int x = 0; x < m; x++) {
                //print the value of each row
                System.out.println("X" + (x + 1) + "= " + matriz[x][m]);
            }
        } else {
            System.out.println("Debe tener la misma cantidad de filas y columnas");
        }
    }

    static void pivotMatrix(float matrix[][], int pivot, int var) {
        float temporalMatrix = 0;
        temporalMatrix = matrix[pivot][pivot];
        for (int i = 0; i < (var + 1); i++) {
            // using formula Rx = Rx / Rxx
            matrix[pivot][i] = matrix[pivot][i] / temporalMatrix;
        }
    }

    static void increaseMatrix(float matrix[][], int pivot, int var) {
        for (int x = 0; x < var; x++) {
            if (x != pivot) {
                //setting the diagonal value of the matrix
                float pivMatrixCell = matrix[x][pivot];
                for (int i = 0; i < (var + 1); i++) {
                    // increasing the matrix with the formula Rx = -anchor * Rx + Rx
                    matrix[x][i] = ((-1 * pivMatrixCell) * matrix[pivot][i]) + matrix[x][i];
                }
            }
        }
    }
}
