package aventuras;

//UNA DE LAS COMPONENTES CONCRETAS
public class Espeleologia implements Aventura {
    public Espeleologia() {

    }
    @Override
    public double precio() {
        // SÓLO TIENE QUE GENERAR SU PRECIO
        System.out.println("precio() en Espeleología -> 1400");
        return 1400;
    }
}
