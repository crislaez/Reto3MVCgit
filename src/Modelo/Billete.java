package Modelo;

public class Billete {

	private int Cod_Billete;
	private int NTrayecto;
	private String Cod_Linea;
	private int Cod_Bus;
	private int Cod_Parada_Inicio;
	private int Cod_Parada_Fin;
	private String Fecha;
	private String Hora;
	private String DNI;
	private float Precio;
	
	public Billete() {
		
	}
	public Billete(int Cod_Billete,int NTrayecto,String Cod_Linea,int Cod_Bus,int Cod_Parada_Inicio,int Cod_Parada_Fin,String Fecha,String Hora,String DNI,float Precio) {
		this.Cod_Billete=Cod_Billete;
		this.NTrayecto=NTrayecto;
		this.Cod_Linea=Cod_Linea;
		this.Cod_Bus=Cod_Bus;
		this.Cod_Parada_Inicio=Cod_Parada_Inicio;
		this.Cod_Parada_Fin=Cod_Parada_Fin;
		this.Fecha=Fecha;
		this.Hora=Hora;
		this.DNI=DNI;
		this.Precio=Precio;
	}
	public int getCod_Billete() {
		return Cod_Billete;
	}
	public void setCod_Billete(int cod_Billete) {
		Cod_Billete = cod_Billete;
	}
	public int getNTrayecto() {
		return NTrayecto;
	}
	public void setNTrayecto(int nTrayecto) {
		NTrayecto = nTrayecto;
	}
	public String getCod_Linea() {
		return Cod_Linea;
	}
	public void setCod_Linea(String cod_Linea) {
		Cod_Linea = cod_Linea;
	}
	public int getCod_Bus() {
		return Cod_Bus;
	}
	public void setCod_Bus(int cod_Bus) {
		Cod_Bus = cod_Bus;
	}
	public int getCod_Parada_Inicio() {
		return Cod_Parada_Inicio;
	}
	public void setCod_Parada_Inicio(int cod_Parada_Inicio) {
		Cod_Parada_Inicio = cod_Parada_Inicio;
	}
	public int getCod_Parada_Fin() {
		return Cod_Parada_Fin;
	}
	public void setCod_Parada_Fin(int cod_Parada_Fin) {
		Cod_Parada_Fin = cod_Parada_Fin;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	
	
}
