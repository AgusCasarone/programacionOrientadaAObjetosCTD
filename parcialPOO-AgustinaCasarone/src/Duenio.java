public class Duenio {
    private String nombre;
    private String apellido;
    private String CUIL;

    public Duenio(String nombre, String apellido, String CUIL) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CUIL = CUIL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }
}
