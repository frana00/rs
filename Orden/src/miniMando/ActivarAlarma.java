package miniMando;

public class ActivarAlarma implements Orden {

    private Alarma alarma;

    public ActivarAlarma(Alarma alarma) {
        this.alarma = alarma;

    }

    @Override
    public void ejecutar() {
        alarma.activar();
    }
}
