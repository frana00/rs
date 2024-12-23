package proteccion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Cliente extends JFrame{

    private static final long serialVersionUID = 1L;

    // COMPONENTES DE LA GUI
    private JPanel panelComando = new JPanel();
    private JPanel panelResultado = new JPanel();
    private JButton botonEjecutar;
    private JTextField textoComando;
    private JTextArea resultadoComando;
    private JScrollPane resultadoConScroll;

    // SE DECLARA LA INTERFAZ PARA PODER INSTANCIAR CUALQUIERA DE SUS IMPLEMENTACIONES
    private InterfaceEjecutor ejecutor;
    public Cliente()
    {
        super("Prueba patrón proxy de control de acceso");
        initGUI();
        initEjecutor();

    }
    private void initGUI() {

        panelComando.setLayout(new FlowLayout(FlowLayout.CENTER,6,30));

        textoComando = new JTextField(20);
        panelComando.add(new JLabel("Comando:"));
        panelComando.add(textoComando);
        panelComando.setBackground(new Color(0,173,213));

        botonEjecutar = new JButton("Ejecutar");
        panelComando.add(botonEjecutar);

        // DECLARACIÓN DEL MANEJADOR DE EVENTOS DEL BOTÓN
        botonEjecutar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

                resultadoComando.setText("");
                try {
                    resultadoComando.setText(ejecutor.ejecutarComando(textoComando.getText()));	// LLAMADA AL PROXY O AL OBJETO REAL

                }
                catch (Exception e) {
                    System.out.println("Exception::"+e.getMessage());
                }
            }
        });

        resultadoComando = new JTextArea();
        resultadoConScroll = new JScrollPane(resultadoComando, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        resultadoConScroll.setPreferredSize(new Dimension(600,300));
        panelResultado.add(resultadoConScroll);

        this.add(panelComando,BorderLayout.PAGE_START);
        this.add(panelResultado,BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



    private void initEjecutor() {

        // EJECUCIÓN REAL DIRECTA
        // ejecutor = new EjecutorDeComandos();
        //
        ejecutor = new ProxyEjecutorDeComandos();
    }

    public static void main(String[] args) {

        new Cliente();
    }


}
