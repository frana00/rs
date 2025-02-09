package meteorologia;

public class Main {
    public static void main(String[] args) {
        DatosMeteorologicos datos = new DatosMeteorologicos();

        Observador datosActuales = new DatosActuales(datos);
        Observador estadisticas = new Estadisticas(datos);
        // Observador avisoHelada = new AvisoHelada(datos);

        datos.establecerEstado(25, 70, 100);
        datos.establecerEstado(23, 65, 101);
        datos.establecerEstado(20, 60, 102);
        datos.establecerEstado(19, 80, 103);
        datos.establecerEstado(-1, 80, 103);
    }
}
