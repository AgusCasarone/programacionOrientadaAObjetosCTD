import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner perro;
        double cantidadDeComida;

        double[] paquetes = new double[6];

        System.out.println("Ingrese el nombre del perro: ");
        perro = new Scanner(System.in);

        System.out.println("¿Cuántos kilos de comida diarios come su perro? ");
        cantidadDeComida = new Scanner(System.in).nextDouble();

        System.out.println(perro + " come " + cantidadDeComida + " kg diarios.");

        for (int i = 0; i < paquetes.length; i++) {
            System.out.println("¿Cuántos kg tiene este paquete?");
            paquetes[i] = new Scanner(System.in).nextDouble();
        }

        System.out.println(Arrays.toString(paquetes));

        private static double cuantosPaquetes(double necesidad,double[]sobres){
            double paquetesDiarios = 0;
            double racionCreada = 0;

            while (racionCreada < necesidad) {
                for (int i = 0; i < sobres.length; i++) {
                    racionCreada += sobres[i];
                }
                paquetesDiarios ++;
            }
        }

        double paquetesTotales = cuantosPaquetes(cantidadDeComida, paquetes);
        System.out.println(perro + " necesita " + paquetesTotales + " paquetes.");
    }


}