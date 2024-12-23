package bbdd;
public class ConexionMongoDB implements Conexion {
	public ConexionMongoDB() {
		
		System.out.println("Creado objeto ConexionMongoDB");
	}
	@Override
	public boolean abrir() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MongoDB ==> abrir");
		return false;
	}
	@Override
	public boolean cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MongoDB ==> cerrar");		
		return false;
	}
}
