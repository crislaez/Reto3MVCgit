package Modelo;

public class Autobus {

	private int Cod_bus;
	private int N_plazas;
	private double Consumo_km;
	private String Color;
	
	public Autobus() {
		
	}
	public Autobus(int Cod_bus,int N_plazas,double Consumo_km,String Color) {
		this.Cod_bus=Cod_bus;	
		this.N_plazas=N_plazas;
		this.Consumo_km=Consumo_km;
		this.Color=Color;
	}
	public int getCod_bus() {
		return Cod_bus;
	}
	public void setCod_bus(int cod_bus) {
		Cod_bus = cod_bus;
	}
	public int getN_plazas() {
		return N_plazas;
	}
	public void setN_plazas(int n_plazas) {
		N_plazas = n_plazas;
	}
	public double getConsumo_km() {
		return Consumo_km;
	}
	public void setConsumo_km(double consumo_km) {
		Consumo_km = consumo_km;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
}
