package miniMando;

public class DesactivarAlarma implements Orden {

    private Alarma alarma;

    public DesactivarAlarma(Alarma alarma) {
        this.alarma = alarma;

    }

    @Override
    public void ejecutar() {
        alarma.desactivar();
    }
}
