import java.util.ArrayList;
import java.util.List;

public class ArchivoLista implements IPersistencia{

    private List<Guia> guias;

    public ArchivoLista() {
        this.guias = new ArrayList<>();
    }

    @Override
    public String agregarGuia(Guia guia) {
        for (Guia g : guias) {
            if (g.getNumGuia().equals(guia.getNumGuia())) {
                return "Error al agreagar guia, ya existe una guia con el mismo numero";
            }
        }
        this.guias.add(guia);
        return "Guia añadida con exito";
    }

    @Override
    public String mostrarTodasLasGuias() {
        StringBuilder guiasString = new StringBuilder();
        for (Guia guia : guias) {
           guiasString.append(guia).append("\n");
        }
        return guiasString.toString();
    }

    @Override
    public Guia consultarGuiaPorNumero(String numGuia) {
        for (Guia guia : guias) {
            if (guia.getNumGuia().equals(numGuia)) {
                return guia;
            }
        }
        return null;
    }

    @Override
    public Guia consultarGuiaPorEstado(Estado estado) {
        for (Guia guia : guias) {
            if (guia.getEstado().equals(estado)) {
                return guia;
            }
        }
        return null;
    }

    @Override
    public Guia consultarGuiaPorDestinatario(String identificacion) {
        for (Guia guia : guias) {
            if (guia.getDestinatario().getIdentifiacion().equals(identificacion)) {
                return guia;
            }
        }
        return null;
    }

    @Override
    public String finalizarGuia(String numGuia) {
        for (Guia g : guias) {
            if (g.getNumGuia().equals(numGuia)) {
                g.setEstado(Estado.FINALIZADA);
                return "La guía con número " + numGuia + " ha sido finalizada.\n" +
                        "su valor es: " + g.getValorGuia();
            }
        }
        return "No se encontró ninguna guía con el número " + numGuia;
    }
}
