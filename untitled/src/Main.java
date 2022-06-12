public class Main {
    public static void main(String[] args) {
        Integer numero1, numero2;
        numero1 = 65;
        numero2 = 54;

        numero1.compareTo(numero2);
        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que el número " + numero2 + ".");
        } else if (numero1 == numero2) {
            System.out.println("El número " + numero1 + " es igual al número " + numero2 + ".");
        } else {
            System.out.println("El número " + numero1 + " es menor que el número " + numero2 + ".");
        }
    }
}