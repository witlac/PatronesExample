public class Persona {
    private String identifiacion;
    private String nombre;
    private String telefono;

    public Persona(String identifiacion, String nombre, String telefono) {
        this.identifiacion = identifiacion;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
