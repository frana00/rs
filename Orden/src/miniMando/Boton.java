package miniMando;

public class Boton {
    Orden orden;

    public Boton(Orden orden) {

        this.orden = orden;

    }

    public void setOrden(Orden orden) {

        this.orden = orden;
    }

    public void ejecutarOrden() {

        orden.ejecutar();
    }
}
