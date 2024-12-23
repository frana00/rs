package bbdd;
public class FactoriaMongoDB implements FactoriaAccesoBD {
	public FactoriaMongoDB() {
		
		System.out.println("Instanciada la factoría Mongo DB");
	}
	@Override
	public Conexion crearConexion() {
		
		return new ConexionMongoDB();
	}
	@Override
	public Consulta crearConsulta() {
		
		return new ConsultaMongoDB();
	}
}
