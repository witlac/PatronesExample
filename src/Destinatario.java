public class Destinatario extends Persona {

    private String compañia;
    private Direccion direccion;

    public Destinatario(String identifiacion, String nombre, String telefono, String compañia, Direccion direccion) {
        super(identifiacion, nombre, telefono);
        this.compañia = compañia;
        this.direccion = direccion;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
