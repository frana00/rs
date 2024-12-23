package documentos;
public interface ConstructorDocumento {

    public void iniciarDocumento();
    public void construirCabecera(String texto);
    public void construirCuerpo(String texto);
    public void construirPie(String texto);
}
