package Modelo;

import java.util.ArrayList;

import Coordinador.Controlador;

public class Modelo {

	//controlador
	private Controlador controlador;
	//modelos de los paneles
	public ModeloBienvenida modelobienvenida;
	public ModeloMenuPrincipal modelomenuprincipal;
	public ModeloMenuOpcion modelomenuopcion;
	public ModeloParadas modeloparadas;
	public ModeloBus modelobus;
	public ModeloLogin modelologin;
	
	public GestorBd gestor;
	public static String codigo;
	public static String cadena;
	public static String cadena2;
	public static String cadena3;
	public static String cadena4;
	public static String cadenabus;
	public static String codigoparadaida;
	public static int cida;
	public static String codigoparadavuelta;
	public static int cvuelta;
	public static int cont;
	public static int uno;
	public static int dos;
	public static int aux2;
	
	public static int cbus;
	public static int plazas;
	public static float consumo;
		
	public static float lat1;
	public static float lon1;
	public static float lat2;
	public static float lon2;
	
	public ArrayList<Parada>paradas;
	public Billete billete;
	public Billete billete2;
	//constructor
	public Modelo() {
		this.billete=new Billete();
		this.billete2=new Billete();
		this.gestor=new GestorBd();
		this.paradas=new ArrayList<Parada>();
		this.modelobienvenida=new ModeloBienvenida();
		this.modelomenuprincipal=new ModeloMenuPrincipal(gestor);
		this.modelomenuopcion=new ModeloMenuOpcion(gestor);
		this.modeloparadas=new ModeloParadas(gestor);
		this.modelobus=new ModeloBus(gestor);
		this.modelologin=new ModeloLogin(gestor);
	}
	
	
	//get seter controlador
	public void setControlador(Controlador controlador) {
		// TODO Auto-generated method stub
		this.controlador=controlador;
	}

	public Controlador getControlador() {
		return controlador;
	}

}
