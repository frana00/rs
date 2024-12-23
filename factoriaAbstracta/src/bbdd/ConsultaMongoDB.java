package bbdd;
public class ConsultaMongoDB implements Consulta {
	public ConsultaMongoDB() {
		
		System.out.println("Creado objeto ConsultaMongoDB");
	}
	@Override
	public boolean ejecutar() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MongoBD ==> ejecutar");			
		return false;
	}
	@Override
	public boolean imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MongoBD ==> imprimir");			
		return false;
	}
}
