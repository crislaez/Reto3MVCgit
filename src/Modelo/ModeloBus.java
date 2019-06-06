package Modelo;

import javax.swing.DefaultListModel;

public class ModeloBus {

	
	public GestorBd gestor;

	
	public ModeloBus(GestorBd gestor) {
		this.gestor=gestor;
	}
	
	/**
	 * 
	 * @param modelo4
	 * @param billete
	 * @param billete2
	 */
	public void bus(DefaultListModel modelo4,Billete billete,Billete billete2) {
		Modelo.cadenabus=Modelo.cadena4.split(",")[1];
		Modelo.cbus=Integer.parseInt(Modelo.cadenabus);
		billete.setCod_Bus(Modelo.cbus);
		billete2.setCod_Bus(Modelo.cbus);
		Modelo.cadenabus=Modelo.cadena4.split(",")[3];
		Modelo.plazas=Integer.parseInt(Modelo.cadenabus);
		Modelo.cadenabus=Modelo.cadena4.split(",")[5];
		Modelo.consumo=Float.parseFloat(Modelo.cadenabus);
		System.out.println("Codigo Bus: "+billete.getCod_Bus());
		System.out.println("Plazas: "+Modelo.plazas);
		System.out.println("Consumo: "+Modelo.consumo);
		modelo4.clear();
	}
	
	//----------------------------------------
}
