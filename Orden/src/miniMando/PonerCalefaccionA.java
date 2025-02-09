package miniMando;

import java.util.Scanner;

public class PonerCalefaccionA implements Orden {

    private Calefaccion calefaccion;

    public PonerCalefaccionA(Calefaccion calefaccion) {
        this.calefaccion = calefaccion;

    }

    @Override
    public void ejecutar() {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Temperatura del agua deseada: ");
        int temp = lectura.nextInt();
        calefaccion.fijarTemperatura(temp);
    }

}
