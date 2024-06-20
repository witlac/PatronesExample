public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("calle 13a #12-3", "xd", "Valledupar", "Cesar", "Colombia", "200004");
        System.out.println(direccion.toString());

        Remitente remitente = new Remitente("001", "Jaider", "3006646478", "Cundinamarca");
        Destinatario destinatario = new Destinatario("002", "Cristian", "3005673412", "UPC", direccion);

        Archivo archivoLista = new Archivo(new ArchivoLista());
        Servicio servicioDocumento = new ServicioDocumento(0,1,5000, false);
        Servicio servicioCaja = new ServicioCaja(12,1,20000,false);
        Guia guia1 = new Guia("001", 1, servicioDocumento,destinatario,remitente, Estado.DESPACHO);
        Guia guia2 = new Guia("002", 1, servicioCaja,destinatario,remitente, Estado.DESPACHO);

        archivoLista.agregarGuia(guia1);
        archivoLista.agregarGuia(guia2);

        System.out.println("***Guias con archivo Lista***");
        System.out.println(archivoLista.mostrarTodasLasGuias());
        System.out.println("Guia 002\n" + archivoLista.consultarGuiaPorNumero("002"));
        System.out.println(archivoLista.finalizarGuia("002")+"\n");
        System.out.println("Guias en finalizada\n" + archivoLista.consultarGuiaPorEstado(Estado.FINALIZADA));

        Archivo archivoHash = new Archivo(new ArchivoHash());
        archivoHash.agregarGuia(guia1);
        archivoHash.agregarGuia(guia2);

        System.out.println("***Guias con archivo Hash***");
        System.out.println(archivoHash.mostrarTodasLasGuias());
        Guia guiaHashAfinalizar = archivoHash.consultarGuiaPorNumero("002");
        System.out.println("Guia 002\n" + guiaHashAfinalizar);
    }
}