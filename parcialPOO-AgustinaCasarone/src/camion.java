public class camion extends Vehiculo {

    private int cantidadEjes;
    private double capacidadDeCarga;

    public camion(String fechaDeAdquisicion, Double cotizacionUSD, String marca, String patente, boolean esNacional, int cantidadEjes, double capacidadDeCarga) {
        super(fechaDeAdquisicion, cotizacionUSD, marca, patente, esNacional);
        this.cantidadEjes = cantidadEjes;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int compareTo(camion o) {
        if (capacidadDeCarga>o.capacidadDeCarga){
            return 1;
        } else if (capacidadDeCarga<o.capacidadDeCarga) {
            return -1;
        } else {
            return 0;
        }
    }
}

