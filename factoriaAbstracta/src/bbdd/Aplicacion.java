package bbdd;
public class Aplicacion {	
	
	// EL CLIENTE MANEJA FACTORIAS Y OBJETOS ABSTRACTOS
	
	FactoriaAccesoBD factoria;
	Conexion conexion;
	Consulta consulta;
	public Aplicacion(FactoriaAccesoBD factoria) {
		this.factoria = factoria;
	}
	
	public void crearConexion() {
		
		// DELEGA LA CREACIÓN DE LA CONEXIÓN EN LA FACTORIA QUE TENGA
		
		conexion = factoria.crearConexion();
		
		// Se puede invocar a los metodos de conexion
	}
	
	public void crearConsulta() {
		
		// 	DELEGA LA CREACIÓN DE LA CONSULTA EN LA FACTORIA QUE TENGA
		
		consulta = factoria.crearConsulta();
		
		// Se puede invocar a los metodos de consulta
	}
	public static void main(String[] args) {
		// ES EN EL PROGRAMA PRINCIPAL DONDE SE DECIDE QUÉ FACTORIA CONCRETA SE USA EN CADA MOMENTO
		
		//Aplicacion app = new Aplicacion(new FactoriaMongoDB());
		Aplicacion app = new Aplicacion(new FactoriaMySQL());
		
		// PERO UNA VEZ DECIDIDA LA FACTORIA CONCRETA, LA LÓGICA DE LA APLICACIÓN SE HACE EN UN NIVEL DE ABSTRACCIÓN MAYOR, A NIVEL DE OBJETOS ABSTRACTOS.
		app.crearConexion();
		app.crearConsulta();
		
	}
}
