import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String nombre, apellido;
        char inicialNombre, inicialApellido;

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();

        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);

        System.out.println(inicialNombre + " " + inicialApellido);

    }
}