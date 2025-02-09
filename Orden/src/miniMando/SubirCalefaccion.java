package miniMando;

public class SubirCalefaccion implements Orden {

    private Calefaccion calefaccion;

    public SubirCalefaccion(Calefaccion calefaccion) {
        this.calefaccion = calefaccion;
    }

    @Override
    public void ejecutar() {
        calefaccion.subir();
    }
}
