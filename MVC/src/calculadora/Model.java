package calculadora;

import java.util.*;

public class Model implements Sujeto {
    private int x, y;
    private double resultado;
    private List<Observador> observadores;

    // CONSTRUCTOR Y SETTERS

    public Model() {

        // CREACIÓN DE LA COLECCIÓN DE OBSERVADORES
        this.observadores = new ArrayList<Observador>();
    }


    // SETTERS PARA x E y  YA QUE resultado SE ASIGNA
    // EN LOS MÉTODOS DE LAS OPERACIONES.
    public void setX(int v) {
        this.x = v;
    }

    public void setY(int v) {
        this.y = v;
    }


    // MÉTODOS PROPIOS DE LA APLICACIÓN:
    // OPERACIONES Y CAMBIO EN LA INFORMACIÓN DE ESTADO
    // DEL RESULTADO

    public void suma() {
        this.resultado = this.x + this.y;
        notificarResultado();
    }

    public void resta() {
        this.resultado = this.x - this.y;
        notificarResultado();
    }

    public void multiplicacion() {
        this.resultado = this.x * this.y;
        notificarResultado();
    }

    public void division() {
        if (this.y == 0)
            // AQUÍ SE GENERA LA NOTIFICACIÓN DEL ERROR
            notificarError();
        else {
            this.resultado = this.x / this.y;
            notificarResultado();
        }
    }

    // MÉTODOS PARA NOTIFICAR A LOS OBSERVADORES
    @Override
    public void notificarResultado() {
        for (Observador o : observadores) o.actualizarResultado(this.resultado);
    }

    @Override
    public void notificarError() {
        for (Observador o : observadores) o.actualizarError("ERROR: Division by zero");

    }

    // MÉTODOS PARA LA GESTIÓN DE LA LISTA DE OBSERVADORES

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void borrarObservador(Observador o) {
        observadores.remove(o);
    }


}
