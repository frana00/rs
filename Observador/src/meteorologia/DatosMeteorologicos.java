package meteorologia;

import java.util.ArrayList;
import java.util.List;

public class DatosMeteorologicos implements Sujeto {

    /* ESTE ES EL SUJETO CONCRETO */

    /* OBS.- LA COLECCIÓN DE OBSERVADORES, EN ESTA OCASIÓN, ESTÁ EN EL SUJETO CONCRETO.  */

    private List<Observador> observadores;

    /* EL ESTADO, EN ESTA OCASIÓN, SON INFORMACIONES SEPARADAS */

    private double temperatura;
    private double humedad;
    private double presion;

    public DatosMeteorologicos() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
        System.out.println("Registrado observador");
    }

    @Override
    public void borrarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    /* LA IMPLEMENTACIÓN DEL MÉTODO DE LA INTERFAZ (notificar()) , EN ESTA OCASIÓN, ESTÁ EN EL SUJETO CONCRETO */
    public void notificar() {
        System.out.println("Notificando ...");
        for (Observador o : observadores) {
            o.actualizar(temperatura, humedad, presion);
        }
    }

    /* ÉSTE ES EL MÉTODO DEL SUJETO CONCRETO PARA ESTABLECER EL ESTADO UNA VEZ QUE RECIBE CAMBIOS EN LAS CONDICIONES (SIMULADO) */
    public void establecerEstado(double temperatura, double humedad, double presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        notificar();
    }
}
