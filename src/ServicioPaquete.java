public class ServicioPaquete extends Servicio {
    public ServicioPaquete(double peso, double cantidad, double valorDeclarado, boolean internacional) {
        super(peso, cantidad, valorDeclarado, internacional);
    }

    @Override
    public double calculoCostoEntrega() {
        return this.getVALORBASE() * this.getCantidad();
    }
}
