public class C1Smascotas {
    public static void main (String[] args) {
        //Para representar cada una de las características de las mascotas, crear una variable y darle
        //el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
        //queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
        //tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
        //como el siguiente ejemplo:
        //“Manchitas tiene 2 años”
        //“Manchitas come un kilo y medio y hace guau guau”

        //mascota1, mascota2, mascota3, mascota4, mascota5;

        //nombres
        String mascota1Nombre, mascota2Nombre, mascota3Nombre, mascota4Nombre, mascota5Nombre;

        //especies
        String mascota1Especie, mascota2Especie, mascota3Especie, mascota4Especie, mascota5Especie;

        //edad
        int mascota1Edad, mascota2Edad, mascota3Edad, mascota4Edad, mascota5Edad;

        //comida diaria en kilos
        double mascota1ComidaDiariaEnKilos, mascota2ComidaDiariaEnKilos, mascota3ComidaDiariaEnKilos, mascota4ComidaDiariaEnKilos, mascota5ComidaDiariaEnKilos;

        //caracteristica
        String mascota1Caracteristica, mascota2Caracteristica, mascota3Caracteristica, mascota4Caracteristica, mascota5Caracteristica;

        //mascota1
        mascota1Especie = "perro";
        mascota1Nombre = "Manchitas";
        mascota1Edad = 2;
        mascota1ComidaDiariaEnKilos = 1.5;
        mascota1Caracteristica = "hace guau guau";
        System.out.println(mascota1Nombre + " es un " + mascota1Especie + " que tiene " + mascota1Edad + " años.");
        System.out.println(mascota1Nombre + " come " + mascota1ComidaDiariaEnKilos + "kilos y " + mascota1Caracteristica + ".");


        //mascota2
        mascota2Especie = "pez";
        mascota2Nombre = "Nemo";
        mascota2Edad = 1;
        mascota2ComidaDiariaEnKilos = 0.140;
        mascota2Caracteristica = "sus burbujas de aire en el agua hacen glup glup";
        System.out.println(mascota2Nombre + " es un " + mascota2Especie + " que tiene " + mascota2Edad + " años.");
        System.out.println(mascota2Nombre + " come " + mascota2ComidaDiariaEnKilos + "kilos y " + mascota2Caracteristica + ".");


        //mascota3
        mascota3Especie = "gato";
        mascota3Nombre = "Silvestre";
        mascota3Edad = 3;
        mascota3ComidaDiariaEnKilos = 0.5;
        mascota3Caracteristica = "hace miauu";
        System.out.println(mascota3Nombre + " es un " + mascota3Especie + " que tiene " + mascota3Edad + " años.");
        System.out.println(mascota3Nombre + " come " + mascota3ComidaDiariaEnKilos + "kilos y " + mascota3Caracteristica + ".");


        //mascota4
        mascota4Especie = "tortuga";
        mascota4Nombre = "Manuelita";
        mascota4Edad = 12;
        mascota4ComidaDiariaEnKilos = 0.300;
        mascota4Caracteristica = "vivía en Pehuajó";
        System.out.println(mascota4Nombre + " es un " + mascota4Especie + " que tiene " + mascota4Edad + " años.");
        System.out.println(mascota4Nombre + " come " + mascota4ComidaDiariaEnKilos + "kilos y " + mascota4Caracteristica + ".");


        //mascota5
        mascota5Especie = "loro";
        mascota5Nombre = "Gardel";
        mascota5Edad = 1;
        mascota5ComidaDiariaEnKilos = 0.350;
        mascota5Caracteristica = "canta la marcha peronista";
        System.out.println(mascota5Nombre + " es un " + mascota5Especie + " que tiene " + mascota5Edad + " años.");
        System.out.println(mascota5Nombre + " come " + mascota5ComidaDiariaEnKilos + "kilos y " + mascota5Caracteristica + ".");
    }
}
