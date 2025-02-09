package calculadora;

import javax.swing.*;
import java.awt.event.*;

public class VistaVentana extends JFrame implements Observador, ActionListener {
    // ESTA VISTA YA ES MÁS PROPIA DE MODELO VISTA - CONTROLADOR
    // TIENE LA RESPONSABILIDAD DE INTERACTUAR CON EL USUARIO DE FORMA GRAFICA
    // ACEPTANDO ENTRADAS ADEMÁS DE MOSTRANDO SALIDAS.
    // - PEDIR DATOS DE ENTRADA
    // - PEDIR OPERACIÓN
    // - MOSTRAR RESULTADOS O INDICACIÓN DE ERROR


    // JAVA PARA CREAR LA VENTANA
    private static final long serialVersionUID = 1L;
    private JTextField oper1;
    private JTextField oper2;
    private JButton suma, resta, producto, division;
    private JTextField resultado;


    private Controlador controlador;        // LA VISTA MANTIENE UNA REFERENCIA AL CONTROLADOR

    public VistaVentana(Controlador controlador) {

        // SE GESTIONA MOSTRAR LA VENTANA
        super("Calculadora");
        initGUI();


        // LA PARTE DE REGISTRO ES IGUAL QUE EN OTRAS VISTAS, MEDIANTE EL CONTROLADOR AL QUE SE LE PIDE
        // QUE LA REGISTRE
        // GUARDAR LA REFERENCIA AL CONTROLADOR
        this.controlador = controlador;
        // LA VISTA SOLICITA SU REGISTRO AL CONTROLADOR
        this.controlador.registrarObservador(this);
    }

    // JAVA PARA LA GESTIÓN DE LA VENTANA
    private void initGUI() {
        this.setLayout(null);

        // CREACIÓN DE LOS ELEMENTOS GRÁFICOS
        oper1 = new JTextField(20);
        oper1.setBounds(10, 10, 100, 30);
        oper2 = new JTextField(20);
        oper2.setBounds(110, 10, 100, 30);
        suma = new JButton("+");
        suma.setBounds(10, 50, 100, 30);
        resta = new JButton("-");
        resta.setBounds(110, 50, 100, 30);
        producto = new JButton("*");
        producto.setBounds(210, 50, 100, 30);
        division = new JButton("/");
        division.setBounds(310, 50, 100, 30);
        resultado = new JTextField(20);
        resultado.setBounds(10, 85, 400, 30);
        // LA PROPIA CLASE ES LA QUE GESTIONA LOS EVENTOS SOBRE
        // LOS BOTONES DE LOS OPERADORS
        suma.addActionListener(this);
        resta.addActionListener(this);
        producto.addActionListener(this);
        division.addActionListener(this);
        this.add(oper1);
        this.add(oper2);
        this.add(suma);
        this.add(resta);
        this.add(producto);
        this.add(division);
        this.add(resultado);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(430, 150);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }


    // Y ESTE ES EL MÉTODO DEL ActionListener QUE GOBIERNA QUÉ HACER
    // AL PULSAR LOS BOTONES
    @Override
    public void actionPerformed(ActionEvent e) {
        String oper1 = this.oper1.getText();
        String oper2 = this.oper2.getText();
        String signo = e.getActionCommand();
        // CUANDO EL USUARIO PULSA UN OPERADOR LA VISTA INVOCA EL MÉTODO DEL CONTROLADOR

        controlador.ejecutarOperacion(oper1, oper2, signo);

    }

    // MÉTODOS DE ACTUALIZACIÓN INVOCADOS POR EL MODELO PARA
    // QUE LA VISTA MUESTRE LOS RESULTADOS Y ERRORES COMO CONSIDERE
    @Override
    public void actualizarResultado(double dato) {
        String str = Double.toString(dato);
        this.resultado.setText(str);
    }

    @Override
    public void actualizarError(String mensaje) {

        this.resultado.setText(mensaje);
    }
}
