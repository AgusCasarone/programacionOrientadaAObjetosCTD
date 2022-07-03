public class Main { public static void main(String[] args) {
    Duenio duenio1 = new Duenio("Agustina", "Casarone", "27-39341924-0");
    auto auto1 = new auto(true, 150);
    System.out.println(auto1.esEconomico());

    System.out.println(auto1.saberSiEsNacional());

    camion camion1 = new camion("28/02/2022", 528.5, "Volvo", "ABC123", true, 6, 5);
    camion camion2 = new camion("05/01/1996", 320.1, "BMW", "AGC923", false, 4, 3);
    System.out.println(camion1.saberSiEsNacional());
    System.out.println(camion2.saberSiEsNacional());

    if (camion1.compareTo(camion2)==1)
        System.out.println("El camión 1 es mayor que el camión 2");
    else if (camion1.compareTo(camion2)==-1)
        System.out.println("El camión 2 es menor que el camión 1");
    else
        System.out.println("Son iguales");


}
}