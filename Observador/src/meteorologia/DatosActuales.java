package meteorologia;

public class DatosActuales implements Observador {


    /* DADO QUE EL ESTADO EN EL OBSERVADOR GENERAL (INTERFAZ) ESTÁ DISGREGADO, EN LOS CONCRETOS TAMBIÉN LO PUEDE ESTAR */
    private double temperatura;
    private double humedad;
    private double presion;


    /* ÉSTE ES EL SUJETO, NECESARIO PARA REGISTRARSE COMO OBSERVADOR */
    private DatosMeteorologicos datos;

    public DatosActuales(DatosMeteorologicos datos) {
        /* EN EL CONSTRUCTOR SE LE ASIGNA EL SUJETO AL QUE VA A OBSERVAR */
        this.datos = datos;
        /* Y SE REGISTRA COMO OBSERVADOR */
        datos.registrarObservador(this);
    }

    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        /* REESCRITURA DEL MÉTODO DE LA INTERFAZ */

        /* ACTUALIZA EL ESTADO COMO NECESITE */

        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;

        /* Y MUESTRA LOS DATOS COMO NECESITE */
        mostrarDatos();
    }

    public void mostrarDatos() {

        System.out.println("CONDICIONES ACTUALES: " + temperatura + "°, " + humedad + "% y " + presion + " kPa");

    }
}
