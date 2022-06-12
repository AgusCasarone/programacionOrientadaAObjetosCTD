public class C1Aestructuras {
    public static void main (String[] args) {
        // Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
        //divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
        //NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
        //decimales.

        int num1, num2;
        num1 = 12;
        num2 = 5;

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es divisible por " + num2);
        } else {
            System.out.println(num1 + " no es divisible por " + num2);
        }
    }
}
