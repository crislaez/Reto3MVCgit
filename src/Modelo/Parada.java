package Modelo;

public class Parada {

	private int Cod_Parada;
	private String Nombre;
	private String Calle;
	private float Latitud;
	private float Longitud;
	
	public Parada() {
		
	}
	public Parada(int Cod_Parada,String Nombre,String Calle,float Latitud,float Longitud) {
		this.Cod_Parada=Cod_Parada;
		this.Nombre=Nombre;
		this.Calle=Calle;
		this.Latitud=Latitud;
		this.Longitud=Longitud;
	}
	public int getCod_Parada() {
		return Cod_Parada;
	}
	public void setCod_Parada(int cod_Parada) {
		Cod_Parada = cod_Parada;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public float getLatitud() {
		return Latitud;
	}
	public void setLatitud(float latitud) {
		Latitud = latitud;
	}
	public float getLongitud() {
		return Longitud;
	}
	public void setLongitud(float longitud) {
		Longitud = longitud;
	}
	
}
