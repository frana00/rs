package miniMando;

public class Calefaccion {

    private int temperaturaActual;

    public Calefaccion() {

        System.out.println("Creado el objeto calefacción");

    }

    public void encender() {

        System.out.println("Encender calefacción");

    }

    public void apagar() {

        System.out.println("Apagar calefacción");

    }

    public void bajar() {

        System.out.println("Bajar calefacción");

    }

    public void subir() {

        System.out.println("Subir calefacción");

    }

    public void fijarTemperatura(int temp) {
        temperaturaActual = temp;
        System.out.println("Se fija la temperatura de la calefacción a " + temp);
    }

    public int temperaturaActual() {
        return temperaturaActual;
    }

}
