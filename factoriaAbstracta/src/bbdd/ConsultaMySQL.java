package bbdd;
public class ConsultaMySQL implements Consulta {
	public ConsultaMySQL() {
		
		System.out.println("Creado objeto ConsultaMySQL");
	}
	@Override
	public boolean ejecutar() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MySQL ==> ejecutar");		
		return false;
	}
	@Override
	public boolean imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MySQL ==> ejecutar");		
		return false;
	}
}
