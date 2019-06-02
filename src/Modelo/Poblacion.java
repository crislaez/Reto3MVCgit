package Modelo;

public class Poblacion {

	private String Cod_Postal;
	private String Nombre;
	
	public Poblacion() {
		
	}
	public Poblacion(String Cod_Postal,String Nombre) {
		this.Cod_Postal=Cod_Postal;
		this.Nombre=Nombre;
	}
	public String getCod_Postal() {
		return Cod_Postal;
	}
	public void setCod_Postal(String cod_Postal) {
		Cod_Postal = cod_Postal;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
