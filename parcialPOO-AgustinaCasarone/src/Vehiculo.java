public abstract class Vehiculo {

    private String fechaDeAdquisicion;
    private double cotizacionUSD;
    private String marca;
    private String patente;
    private boolean esNacional;

    public Vehiculo() {
    }

    public String getFechaDeAdquisicion() {
        return fechaDeAdquisicion;
    }

    public double getCotizacionUSD() {
        return cotizacionUSD;
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public boolean isEsNacional() {
        return esNacional;
    }

    public void setFechaDeAdquisicion(String fechaDeAdquisicion) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
    }

    public void setCotizacionUSD(double cotizacionUSD) {
        this.cotizacionUSD = cotizacionUSD;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setEsNacional(boolean esNacional) {
        this.esNacional = esNacional;
    }

    public Vehiculo(String fechaDeAdquisicion, Double cotizacionUSD, String marca, String patente, boolean esNacional) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
        this.cotizacionUSD = cotizacionUSD;
        this.marca = marca;
        this.patente = patente;
        this.esNacional = esNacional;
    }

    public boolean saberSiEsNacional(){
        return esNacional==true;
    }

}
