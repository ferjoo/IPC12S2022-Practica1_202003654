import java.util.Scanner;
public class Estadistica {
    static Scanner scanner = new Scanner(System.in);
    static String[] data;
    static int totalData = 0;
    static int dataCounter = 0;
    static double average = 0;
    static double variance = 0;
    public static void estadistica(int selectedOption) {

        switch (selectedOption) {
            case 1:
                ingresarDatos();
                separateData();
                System.out.println("El promedio es: " + average);
                break;
            case 2:
                ingresarDatos();
                separateData();
                System.out.println("La media es: " + average);
                break;
            case 3:
                ingresarDatos();
                 moda();
                 break;
            case 4:
                ingresarDatos();
                separateData();
                calcVariance();
                System.out.println("La varianza es: " + String.format("%.2f", variance));
                break;
            case 5:
                ingresarDatos();
                separateData();
                calcVariance();
                System.out.println("La desviacion estandar es: " + String.format("%.2f", Helpers.sqrt(variance)));
                break;
            default:
                break;
        }
    }
    private static void ingresarDatos() {
        System.out.println("Ingrese la cantidad de datos que desea ingresar");
        totalData = scanner.nextInt();
        data = new String[totalData];
        for (int i = 0; i < totalData; i++) {
            // set all the values in the same line
            System.out.println("Ingrese el dato " + (i + 1));
            data[i] = scanner.next();
        }
    }

    private static void  separateData() {
        // Separate the data by comma with the split
        dataCounter=0;
        totalData=0;
        for (int i = 0; i < data.length; i++) {
            int num = Integer.parseInt(data[i]);
            totalData += num;
            dataCounter++;
        }
        average = (double) totalData/dataCounter;
    }

    private static void moda() {
        int higherNumber=-1;
        int totalHigherNumer=0;
        for (int i = 0; i < data.length; i++) {
            int num = Integer.parseInt(data[i]);
            int sumNumberTotal = 0;
            // for each number, count the number of times it appears in the data
            for (int j = 0; j < data.length; j++) {
                int numLoop = Integer.parseInt(data[j]);
                if (num == numLoop && num != higherNumber) {
                    sumNumberTotal++;
                }
            }
            // check the temporary number of times it appears in the data and compare it with the higher number of times it appears in the data
            if(sumNumberTotal > totalHigherNumer) {
                totalHigherNumer = sumNumberTotal;
                higherNumber=num;
            }
        }
        System.out.println("La moda es: " + higherNumber);
    }
    private static void calcVariance() {
        double sumVariance=0;
        for (int i = 0; i < data.length; i++) {
            int num = Integer.parseInt(data[i]);
            double subVariance = ((double) num - average);
            sumVariance += subVariance * subVariance;
        }
        variance = sumVariance/dataCounter;
    }
}
