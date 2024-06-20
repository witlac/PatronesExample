public class Remitente extends Persona {
    private String departamento;

    public Remitente(String identifiacion, String nombre, String telefono, String departamento) {
        super(identifiacion, nombre, telefono);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
