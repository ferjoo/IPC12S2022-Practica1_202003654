import java.util.Scanner;
public class Estadistica {
    static Scanner scanner = new Scanner(System.in);
    static String data;
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
        System.out.println("Ingresa los datos a analizar sin espacio y separados por una coma");
        data = scanner.nextLine();
    }

    private static void  separateData() {
        dataCounter=0;
        totalData=0;
        for (String number : data.split(",")) {
            int num = Integer.parseInt(number);
            totalData += num;
            dataCounter++;
        }
        average = (double) totalData/dataCounter;
    }

    private static void moda() {
        int higherNumber=-1;
        int totalHigherNumer=0;
        for (String number : data.split(",")) {
            int num = Integer.parseInt(number);
            int sumNumberTotal = 0;
            for (String numberLoop : data.split(",")) {
                int numLoop = Integer.parseInt(numberLoop);
                if (num == numLoop && num != higherNumber) {
                    sumNumberTotal++;
                }
            }
            if(sumNumberTotal > totalHigherNumer) {
                totalHigherNumer = sumNumberTotal;
                higherNumber=num;
            }
        }
        System.out.println("La moda es: " + higherNumber);
    }
    private static void calcVariance() {
        double sumVariance=0;
        for (String number : data.split(",")) {
            int num = Integer.parseInt(number);
            double subVariance = ((double) num - average);
            sumVariance += subVariance * subVariance;
        }
        variance = sumVariance/dataCounter;
    }
}
