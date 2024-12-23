package bbdd;
public class ConexionMySQL implements Conexion {
	public ConexionMySQL() {
		
		System.out.println("Creado objeto ConexionMySQL");
	}
	@Override
	public boolean abrir() {
		// TODO Auto-generated method stub
		System.out.println("Conexion MySQL ==> abrir");		
		return false;
	}
	@Override
	public boolean cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Conexion Mongo MySQL ==> cerrar");		
		return false;
	}
}
