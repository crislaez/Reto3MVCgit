package Modelo;

public class Cliente {

	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Fecha_nac;
	private String Sexo;
	private String Contrase�a;
	
	public Cliente(String DNI,String Nombre,String Apellidos,String Fecha_nac,String Sexo,String Contrase�a) {
		
	}
	public Cliente() {
		this.DNI=DNI;
		this.Nombre=Nombre;
		this.Apellidos=Apellidos;
		this.Fecha_nac=Fecha_nac;
		this.Sexo=Sexo;
		this.Contrase�a=Contrase�a;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getFecha_nac() {
		return Fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		Fecha_nac = fecha_nac;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}
	
	
}
