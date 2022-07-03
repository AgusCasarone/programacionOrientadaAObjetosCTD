public class auto extends Vehiculo {
    private boolean esAGas;
    private int cilindrada;

    public auto(boolean esAGas, int cilindrada) {
        this.esAGas = esAGas;
        this.cilindrada = cilindrada;
    }

    public auto(String fechaDeAdquisicion, Double cotizacionUSD, String marca, String patente, boolean esNacional, boolean esAGas, int cilindrada) {
        super(fechaDeAdquisicion, cotizacionUSD, marca, patente, esNacional);
        this.esAGas = esAGas;
        this.cilindrada = cilindrada;
    }

    public boolean isEsAGas() {
        return esAGas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setEsAGas(boolean esAGas) {
        this.esAGas = esAGas;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean esEconomico(){
        return esAGas==true && cilindrada<1200;
    }

}

