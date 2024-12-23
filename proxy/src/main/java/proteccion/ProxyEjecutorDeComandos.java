package proteccion;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
// SERÍA Proxy EN EL UML DEL PATRÓN
public class ProxyEjecutorDeComandos implements InterfaceEjecutor {

    InterfaceEjecutor ejecutorReal;	// Referencia al ejecutor real al que se le asigna en el constructor

    public ProxyEjecutorDeComandos() {

        // SE LE ASIGNA EL EJECUTOR DE COMANDOS REAL
        ejecutorReal = new EjecutorDeComandos();

    }
    @Override
    public String ejecutarComando(String comando) throws Exception {

        // VERIFICACIÓN DE CREDENCIALES (TRABAJO PROPIO DEL PROXY)
        JPasswordField pf = new JPasswordField();
        int opcion = JOptionPane.showConfirmDialog(null, pf, "Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String credenciales =  new String(pf.getPassword());
        // LLAMADA AL SUJETO REAL
        if ((opcion == JOptionPane.OK_OPTION) && (credenciales.equals("CLAVE"))) {

            return ejecutorReal.ejecutarComando(comando);
        }

        else
            return "Password incorrecto o anulado. No se ha podido ejecutar el comando";

    }
}
