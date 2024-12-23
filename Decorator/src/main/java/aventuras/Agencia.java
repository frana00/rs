package aventuras;

public class Agencia {
    public Agencia() {

    }
    public static void main(String[] args) {


        Aventura aventura = new Rafting();
        aventura = new Seguro(aventura);
        aventura = new Alquiler(aventura);
        aventura = new Reportaje(aventura);

        System.out.println(aventura.precio());


        aventura = new Seguro(new Seguro (new Reportaje (new Reportaje (new Alquiler(new Espeleologia())))));
        System.out.println(aventura.precio());

        aventura = new Alquiler(new Seguro(new Seguro (new Reportaje  (new Alquiler(new Tirolinas())))));
        System.out.println(aventura.precio());


    }
}
