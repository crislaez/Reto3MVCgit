package Modelo;

public class Linea {

	private String Cod_Linea;
	private String Nombre;
	
	public Linea() {
		
	}
	public Linea(String Cod_Linea,String Nombre) {
		this.Cod_Linea=Cod_Linea;
		this.Nombre=Nombre;
	}
	public String getCod_Linea() {
		return Cod_Linea;
	}
	public void setCod_Linea(String cod_Linea) {
		Cod_Linea = cod_Linea;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
