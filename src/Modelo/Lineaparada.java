package Modelo;

public class Lineaparada {

	private String Cod_Linea;
	private int Cod_Parada;
	
	public Lineaparada() {
		
	}
	public Lineaparada(String Cod_Linea,int Cod_Parada ) {
	
	this.Cod_Linea=Cod_Linea;
	this.Cod_Parada=Cod_Parada;
	
	}
	public String getCod_Linea() {
		return Cod_Linea;
	}
	public void setCod_Linea(String cod_Linea) {
		Cod_Linea = cod_Linea;
	}
	public int getCod_Parada() {
		return Cod_Parada;
	}
	public void setCod_Parada(int cod_Parada) {
		Cod_Parada = cod_Parada;
	}
	
	
}
