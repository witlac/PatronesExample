public class Guia {
    private String numGuia;
    private int cantidad;
    private Servicio servicio;
    private Destinatario destinatario;
    private Remitente remitente;
    private Estado estado;
    private double valorGuia;

    public Guia(String numGuia, int cantidad, Servicio servicio, Destinatario destinatario, Remitente remitente, Estado estado) {
        this.numGuia = numGuia;
        this.cantidad = cantidad;
        this.servicio = servicio;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.estado = estado;
        this.valorGuia = servicio.calculoCostoEntrega();
    }

    public String getNumGuia() {
        return numGuia;
    }

    public void setNumGuia(String numGuia) {
        this.numGuia = numGuia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getValorGuia() {
        return valorGuia;
    }

    public void setValorGuia(double valorGuia) {
        this.valorGuia = valorGuia;
    }

    public void finalizarGuia() {
        this.estado = Estado.FINALIZADA;
    }

    @Override
    public String toString() {
        return "Guia N°: " + this.numGuia+ "\n" +
                "Cantidad: " + this.cantidad + "\n" +
                "Servicio: " + this.servicio.toString() + "\n" +
                "Estado: " + this.estado + "\n" +
                "Valor guia: " + this.valorGuia + "\n";
    }
}
