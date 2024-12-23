package aventuras;

// UNA DE LAS COMPONENTES CONCRETAS
public class Rafting implements Aventura {
    public Rafting() {

    }
    @Override
    public double precio() {

        // SÓLO TIENE QUE GENERAR SU PRECIO
        System.out.println("precio() en Rafting -> 1200");
        return 1200;
    }
}
