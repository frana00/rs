package miniMando;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<Boton> botones;


    private Calefaccion calefaccion;
    private Alarma alarma;


    public Cliente() {

        // Crear los dispositivos (receptores)

        System.out.println("========= CREACIÓN DE DISPOSITIVOS ==========");
        calefaccion = new Calefaccion();
        alarma = new Alarma();
        System.out.println("=============================================");


        botones = new ArrayList<Boton>();

    }


    public void configurar_1() {

        botones.clear();

        Orden encenderCalefaccion = new EncenderCalefaccion(calefaccion);    // Crear la orden pasándole el receptor
        botones.add(new Boton(encenderCalefaccion));    //  Crear el invocador y asociarlo con su orden

        Orden subirCalefaccion = new SubirCalefaccion(calefaccion);
        botones.add(new Boton(subirCalefaccion));


        Orden activarAlarma = new ActivarAlarma(alarma);
        botones.add(new Boton(activarAlarma));

    }

    public void configurar_2() {

        botones.clear();

        Orden apagarCalefaccion = new ApagarCalefaccion(calefaccion);    // Crear la orden pasándole el receptor
        botones.add(new Boton(apagarCalefaccion));    //  Crear el invocador y asociarlo con su orden


        Orden desactivarAlarma = new DesactivarAlarma(alarma);
        botones.add(new Boton(desactivarAlarma));

    }

    public void configurar_3() {

        botones.clear();

        Orden encenderCalefaccion = new EncenderCalefaccion(calefaccion);    // Crear la orden pasándole el receptor
        botones.add(new Boton(encenderCalefaccion));    //  Crear el invocador y asociarlo con su orden

        Orden ponerCalefaccionA = new PonerCalefaccionA(calefaccion);
        botones.add(new Boton(ponerCalefaccionA));

    }


    public void operar() {

        for (Boton boton : botones)
            boton.ejecutarOrden();

    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("====> Inicio configuración 1");
        cliente.configurar_1();
        cliente.operar();
        System.out.println("====> Inicio configuración 2");
        cliente.configurar_2();
        cliente.operar();
        System.out.println("====> Inicio configuración 3");
        cliente.configurar_3();
        cliente.operar();

        System.out.println("====> Fin de sistema");


    }
}
