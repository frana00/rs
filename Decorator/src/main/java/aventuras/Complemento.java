package aventuras;

public class Complemento implements Aventura {

    Aventura aventura;
    // EN EL CONSTRUCTOR DEL DECORADOR (Complemento) SE PROPORCIONA LA COMPONENTE (Aventura) A LA QUE DECORA
    public Complemento(Aventura aventura) {
        this.aventura = aventura;
    }
    @Override
    public double precio() {

        System.out.println("precio() en Complemento -> delega el el objeto envuelto");
        // Y ES A ESA COMPONENTE (Aventura) ES A LA QUE SE DELEGA LA REALIZACIÓN DE LAS OPERACIOENS (precio) EN ESTE CASO
        return aventura.precio();
    }
}
