package Modelo;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;

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
	//para calcular las distancias de las 2 paradas
	public static double distanciaCoord() {  
        double radiomedio_Tierra = 6371; //en kilometros
        double lati1 = Math.toRadians(Modelo.lat1);
        double lati2 = Math.toRadians(Modelo.lat2);
        double long1 = Math.toRadians(Modelo.lon1);
        double long2 = Math.toRadians(Modelo.lon2);
        double distancia = radiomedio_Tierra * Math.acos(Math.cos(lati1)*Math.cos(lati2)*Math.cos(long2-long1)+Math.sin(lati1)*Math.sin(lati2));
       
        return distancia;  
    } 
	/**
	 * 
	 * @param billete
	 */
	public void precio(Billete billete,Billete billete2,JTextField DineroFaltante) {
		double plazasocupadas=0,plazastotales=0,preciobillete=0,preciobillete_total = 0;
		double porcentaje=0.2;
		double precio=0;
		double precio2=0;
		
		System.out.println("distancia entre paradas: "+distanciaCoord());
		System.out.println("consumo del bus:"+Modelo.consumo);
		preciobillete=distanciaCoord()*Modelo.consumo;
		preciobillete_total=(preciobillete*porcentaje) + preciobillete;
		billete.setPrecio((float) preciobillete_total);
		billete2.setPrecio((float) preciobillete_total);
		Modelo.precio=billete.getPrecio();
		Modelo.precio2=billete.getPrecio()*2;
		
		System.out.println("precio del billete: "+billete.getPrecio());
		System.out.println("precio del billete2: "+billete2.getPrecio());
		if(Modelo.aux2==1) {
			Modelo.total_faltante=Modelo.precio2;
			DineroFaltante.setText(Modelo.precio2+" \u20ac");
		}
		else {
			Modelo.total_faltante=Modelo.precio;
			DineroFaltante.setText(Modelo.precio+" \u20ac");
		}
	}
	//----------------------------------------
}
