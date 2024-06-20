public class Direccion {
    private String calle;
    private String col;
    private String ciudad;
    private String estado;
    private String pais;
    private String codigoPostal;

    public Direccion(String calle, String col, String ciudad, String estado, String pais, String codigoPostal) {
        this.calle = calle;
        this.col = col;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return this.getCalle() + ", " + this.getCiudad() + "/" + this.getEstado() + ", " + this.getPais() + ", " + this.getCodigoPostal() + ", " + this.getCol();
    }
}
