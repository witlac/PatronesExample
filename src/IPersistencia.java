public interface IPersistencia {
    public String agregarGuia(Guia guia);
    public String mostrarTodasLasGuias();
    public Guia consultarGuiaPorNumero(String numGuia);
    public Guia consultarGuiaPorEstado(Estado estado);
    public Guia consultarGuiaPorDestinatario(String identificacion);
    public String finalizarGuia(String numGuia);
}
