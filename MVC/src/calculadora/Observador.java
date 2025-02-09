package calculadora;

public interface Observador {
    public void actualizarResultado(double dato);

    // EN ESTE CASO TENEMOS DOS TIPOS DE INFORMACIÓN QUE
    // PUEDE SER ACTUALIZADA: RESULTADO O INDICACIÓN DE ERROR.
    public void actualizarError(String mensaje);
}
