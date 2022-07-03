import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int numero = scanner.nextInt();
        int divisor = scanner.nextInt();

        public boolean esDivisible(int numero,int divisor) {
            if (numero % divisor == 0) {
                return true;
            } else {
                return false;
            }
        }
        esDivisible(numero, divisor);
    }
}