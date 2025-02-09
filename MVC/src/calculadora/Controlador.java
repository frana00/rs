package calculadora;

import javax.swing.JOptionPane;

public class Controlador {

    private Model model;    // EL CONTROLADOR MANTIENE UNA REFERENCIA AL MODELO


    // QUE LE ASIGNA EL CLIENTE AL CONSTUIRLO
    public Controlador(Model m) {
        this.model = m;
    }

    // SE ENCARGA DE ATENDER LAS PETICIONES DE LOS OBSERVADORES

    public void ejecutarOperacion(String op1, String op2, String signo) {
        try {
            int v1 = Integer.parseInt(op1);
            int v2 = Integer.parseInt(op2);

            this.model.setX(v1);
            this.model.setY(v2);

            if (signo.equalsIgnoreCase("+")) this.model.suma();
            else if (signo.equalsIgnoreCase("-")) this.model.resta();
            else if (signo.equalsIgnoreCase("*")) this.model.multiplicacion();
            else if (signo.equalsIgnoreCase("/")) this.model.division();
            else throw new NumberFormatException();
        } catch (NumberFormatException e) {
            // AVISA DE ERROR SI SE PRODUCEN EN LA ENTRADA
            JOptionPane.showMessageDialog(null, "Operando(s) incorrcto(s)");
        }
    }


    // MÉTODOS PARA EL REGISTRO/BORRADO DE OBSERVADORES

    public void registrarObservador(Observador o) {
        this.model.registrarObservador(o);
    }

    public void borrarObservador(Observador o) {
        this.model.borrarObservador(o);
    }

}
