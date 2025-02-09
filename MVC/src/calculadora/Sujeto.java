package calculadora;

public interface Sujeto {
    public void registrarObservador(Observador o);

    public void borrarObservador(Observador o);

    public void notificarResultado();

    public void notificarError();
}
