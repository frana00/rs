package documentos;

public class ConstructorDocumentoHTML implements ConstructorDocumento {


    // ESTE ES EL DOCUMENTO QUE CREA ESTE CONSTRUCTOR
    private Documento documento;

    public ConstructorDocumentoHTML() {
    }

    public void iniciarDocumento() {

        // LA INICIALIZACIÓN CREA EL NUEVO DOCUMENTO SUPERCLASE
        documento = new Documento();
    }

    @Override
    public void construirCabecera(String texto) {

        // CONSTRUCCIÓN DE CABECERA
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>");
        sb.append(texto);
        sb.append("</h1>");
        // QUE SE ASIGNA AL DOCUMENTO
        documento.setCabecera(sb.toString());
    }

    @Override
    public void construirCuerpo(String texto) {

        // CONSTRUCCION DEL CUERPO
        StringBuilder sb = new StringBuilder();
        sb.append("<p>");
        sb.append(texto);
        sb.append("</p>");
        // QUE SE AÑADE AL DOCUMENTO
        documento.setCuerpo(sb.toString());
    }

    @Override
    public void construirPie(String texto) {

        // CONSTRUCCIÓN DEL PIE
        StringBuilder sb = new StringBuilder();
        sb.append("<h5>");
        sb.append(texto);
        sb.append("<h5>");
        // QUE SE AÑADE AL DOCUMENTO
        documento.setPie(sb.toString());
    }

    public Documento obtenerDocumento() {

        // OBTENCIÓN DEL DOCUMENTO. SE MANTIENE FUERA POR COHERENCIA PARA CUANDO LOS OBJETOS NO SON DE LA MISMA JERARQUIA
        return documento;
    }


}
