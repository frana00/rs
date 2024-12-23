package aventuras;

//UNA DE LAS COMPONENTES CONCRETAS
public class Tirolinas implements Aventura {
    public Tirolinas() {

    }
    @Override
    public double precio() {

        // SÓLO TIENE QUE GENERAR SU PRECIO
        System.out.println("precio() en Rafting -> 1000");
        return 1000;
    }
}
