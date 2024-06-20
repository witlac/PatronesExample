public class ServicioDocumento extends Servicio {
    public ServicioDocumento(double peso, double cantidad, double valorDeclarado, boolean internacional) {
        super(peso, cantidad, valorDeclarado, internacional);
    }

    @Override
    public double calculoCostoEntrega() {
        return this.getVALORBASE() + 10000;
    }
}
