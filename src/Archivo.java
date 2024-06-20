public class Archivo implements IPersistencia {

    private IPersistencia persistencia;

    public Archivo(IPersistencia persistencia) {
        this.persistencia = persistencia;
    }

    @Override
    public String agregarGuia(Guia guia) {
        return this.persistencia.agregarGuia(guia);
    }

    @Override
    public String mostrarTodasLasGuias() {
        return this.persistencia.mostrarTodasLasGuias();
    }

    @Override
    public Guia consultarGuiaPorNumero(String numGuia) {
        return this.persistencia.consultarGuiaPorNumero(numGuia);
    }

    @Override
    public Guia consultarGuiaPorEstado(Estado estado) {
        return this.persistencia.consultarGuiaPorEstado(estado);
    }

    @Override
    public Guia consultarGuiaPorDestinatario(String identificacion) {
        return this.persistencia.consultarGuiaPorDestinatario(identificacion);
    }

    @Override
    public String finalizarGuia(String numGuia) {
        return this.persistencia.finalizarGuia(numGuia);
    }
}
