public abstract class Servicio {

    private double peso;
    private double cantidad;
    private double valorDeclarado;
    private final double VALORBASE = 5000;
    private boolean internacional;

    public Servicio(double peso, double cantidad, double valorDeclarado, boolean internacional) {
        this.peso = peso;
        this.cantidad = cantidad;
        this.valorDeclarado = valorDeclarado;
        this.internacional = internacional;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public double getVALORBASE() {
        return VALORBASE;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public abstract double calculoCostoEntrega();
}
