package calculadora;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        Model modelo = new Model(); // SE CREA EL MODELO

        Controlador controlador = new Controlador(modelo); // SE CREA EL CONTROLADOR
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VistaVentana(controlador);    // SE CREA LA VISTA

            }
        });

        new VistaConsola(controlador);    // SEGUNDA VISTA
    }
}
