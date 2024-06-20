import java.util.HashMap;

public class ArchivoHash implements IPersistencia{

    HashMap<String, Guia> guias = new HashMap<String, Guia>();

    public HashMap<String, Guia> getGuias() {
        return guias;
    }

    public void setGuias(HashMap<String, Guia> guias) {
        this.guias = guias;
    }

    @Override
    public String agregarGuia(Guia guia) {
        guias.put(guia.getNumGuia(), guia);
        return "Guia añadida con exito";
    }

    @Override
    public String mostrarTodasLasGuias() {
        StringBuilder guiasString = new StringBuilder();
        for (Guia guia : this.guias.values()) {
            guiasString.append(guia).append("\n");
        }
        return guiasString.toString();
    }

    @Override
    public Guia consultarGuiaPorNumero(String numGuia) {
        return guias.get(numGuia);
    }

    @Override
    public Guia consultarGuiaPorEstado(Estado estado) {
        for (Guia guia : this.guias.values()) {
            if (guia.getEstado().equals(estado)) {
                return guia;
            }
        }
        return null;
    }

    @Override
    public Guia consultarGuiaPorDestinatario(String identificacion) {
        for (Guia guia : this.guias.values()) {
            if (guia.getDestinatario().getIdentifiacion().equals(identificacion)) {
                return guia;
            }
        }
        return null;
    }

    @Override
    public String finalizarGuia(String numGuia) {
        for (Guia g : this.guias.values()) {
            if (g.getNumGuia().equals(numGuia)) {
                g.setEstado(Estado.FINALIZADA);
                return "La guía con número " + numGuia + " ha sido finalizada.\n" +
                        "su valor es: " + g.getValorGuia();
            }
        }
        return "No se encontró ninguna guía con el número " + numGuia;
    }
}
