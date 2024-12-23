package documentos;

public class ConstructorDocumentoJSON implements ConstructorDocumento {

    private Documento documento;

    public ConstructorDocumentoJSON() {

    }

    public void iniciarDocumento() {

        documento = new Documento();
    }

    @Override
    public void construirCabecera(String texto) {

        StringBuilder sb = new StringBuilder();
        sb.append("{ cabecera: ");
        sb.append("\"" + texto + "\"");
        sb.append(",");
        documento.setCabecera(sb.toString());
    }

    @Override
    public void construirCuerpo(String texto) {

        StringBuilder sb = new StringBuilder();
        sb.append("cuerpo: ");
        sb.append("\"" + texto + "\"");
        sb.append(",");
        documento.setCuerpo(sb.toString());
    }

    @Override
    public void construirPie(String texto) {

        StringBuilder sb = new StringBuilder();
        sb.append("pie: ");
        sb.append("\"" + texto + "\"");
        sb.append("}");
        documento.setPie(sb.toString());
    }

    public Documento obtenerDocumento() {

        return documento;
    }


}
