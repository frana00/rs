package miniMando;

public class ApagarCalefaccion implements Orden {

    private Calefaccion calefaccion;

    public ApagarCalefaccion(Calefaccion calefaccion) {
        this.calefaccion = calefaccion;
    }

    @Override
    public void ejecutar() {
        calefaccion.apagar();
    }
}
