package Modelo;

public class Linea_autobus {

	private String Cod_Linea;
	private int Cod_bus;
	
	public Linea_autobus() {
		
	}
	public Linea_autobus(String Cod_Linea,int Cod_bus) {
		this.Cod_Linea=Cod_Linea;
		this.Cod_bus=Cod_bus;
	}
	public String getCod_Linea() {
		return Cod_Linea;
	}
	public void setCod_Linea(String cod_Linea) {
		Cod_Linea = cod_Linea;
	}
	public int getCod_bus() {
		return Cod_bus;
	}
	public void setCod_bus(int cod_bus) {
		Cod_bus = cod_bus;
	}
	
}
