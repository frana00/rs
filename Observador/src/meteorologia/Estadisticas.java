package meteorologia;

public class Estadisticas implements Observador {

    /* ESTADO PUEDE TRANSFORMARSE EN LOS OBSERVADORES CONCRETOS EN LO QUE NECESITEN.
     * ESTE OBSERVADOR CALCULA ESTADÍSTICAS CON CADA DATO NUEVO
     * POR LO TANTO NECESITA ESTA MANERA DE GUARDAR EL ESTADO */
    private double temperaturaMaxima = Double.NEGATIVE_INFINITY;
    private double humedadMaxima = Double.NEGATIVE_INFINITY;
    private double temperaturaMinima = Double.POSITIVE_INFINITY;
    private double humedadMinima = Double.POSITIVE_INFINITY;

    /* ÉSTE ES EL SUJETO, NECESARIO PARA REGISTRARSE COMO OBSERVADOR */
    private DatosMeteorologicos datos;

    public Estadisticas(DatosMeteorologicos datos) {
        /* EN EL CONSTRUCTOR SE LE ASIGNA EL SUJETO AL QUE VA A OBSERVAR */
        this.datos = datos;
        /* Y SE REGISTRA COMO OBSERVADOR */
        datos.registrarObservador(this);
    }

    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        /* REESCRITURA DEL MÉTODO DE LA INTERFAZ */

        /* ACTUALIZA EL ESTADO COMO NECESITE, EN ESTE CASO ACTUALIZACIÓN DE LAS ESTADÍSTICAS */
        if (temperatura < temperaturaMinima)
            temperaturaMinima = temperatura;
        if (temperatura > temperaturaMaxima)
            temperaturaMaxima = temperatura;

        if (humedad < humedadMinima)
            humedadMinima = humedad;
        if (humedad > humedadMaxima)
            humedadMaxima = humedad;
        /* Y MUESTRA LOS DATOS COMO NECESITE */
        mostrarDatos();
    }

    public void mostrarDatos() {
        System.out.println("Temperatura máxima: " + temperaturaMaxima + "°");
        System.out.println("Temperatura mínima: " + temperaturaMinima + "°");
        System.out.println("Humedad máxima: " + humedadMaxima + "%");
        System.out.println("Humedad mínima: " + humedadMinima + "%");
    }
}
