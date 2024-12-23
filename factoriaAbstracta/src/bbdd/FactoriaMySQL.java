package bbdd;
public class FactoriaMySQL implements FactoriaAccesoBD {
	public FactoriaMySQL() {
		
		System.out.println("Instanciada la factoría Factoria SQL");
	}
	@Override
	public Conexion crearConexion() {
		
		return new ConexionMySQL();
	}
	@Override
	public Consulta crearConsulta() {
		
		return new ConsultaMySQL();
	}
}
