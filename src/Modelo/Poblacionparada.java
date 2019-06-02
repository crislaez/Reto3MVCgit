package Modelo;

public class Poblacionparada {

	private int Cod_Parada;
	private String Cod_Postal;
	
	public Poblacionparada() {
		
	}
	public Poblacionparada( int Cod_Parada,String Cod_Postal) {
		this.Cod_Parada=Cod_Parada;
		this.Cod_Postal=Cod_Postal;
	}
	public int getCod_Parada() {
		return Cod_Parada;
	}
	public void setCod_Parada(int cod_Parada) {
		Cod_Parada = cod_Parada;
	}
	public String getCod_Postal() {
		return Cod_Postal;
	}
	public void setCod_Postal(String cod_Postal) {
		Cod_Postal = cod_Postal;
	}
	
	
}
