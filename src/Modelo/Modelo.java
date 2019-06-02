package Modelo;

import Coordinador.Controlador;

public class Modelo {

	//controlador
	private Controlador controlador;
	//modelos de los paneles
	public ModeloBienvenida modelobienvenida;
	public ModeloMenuPrincipal modelomenuprincipal;
	public ModeloMenuOpcion modelomenuopcion;
	
	public GestorBd gestor;
	//constructor
	public Modelo() {
		this.gestor=new GestorBd();
		this.modelobienvenida=new ModeloBienvenida();
		this.modelomenuprincipal=new ModeloMenuPrincipal(gestor);
		this.modelomenuopcion=new ModeloMenuOpcion(gestor);
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
