package miniMando;

public class EncenderCalefaccion implements Orden {

    private Calefaccion calefaccion;

    public EncenderCalefaccion(Calefaccion calefaccion) {
        this.calefaccion = calefaccion;
    }

    @Override
    public void ejecutar() {
        calefaccion.encender();
    }
}
