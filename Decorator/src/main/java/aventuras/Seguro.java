package aventuras;

public class Seguro extends Complemento {
    public Seguro(Aventura aventura) {
        super(aventura);
    }

    public double precio() {

        System.out.println("precio() en Seguro -> llamada a super y suma 350");
        return super.precio() + 350;

        // REALMENTE ES COMO SI HICIERA LO SIGUIENTE (ES LO QUE HACE super QUE ES COMPLEMENTO
        // return aventura.precio()+350;
    }
}