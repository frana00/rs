package bbdd;
/**
*
* Declara una interfaz para operaciones que crean productos abstractos
*
*/
public interface FactoriaAccesoBD {
	
	public Conexion crearConexion();
	public Consulta crearConsulta();
	
}
