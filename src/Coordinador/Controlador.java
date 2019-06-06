package Coordinador;

import Modelo.Modelo;

import Vista.Ventana;


public class Controlador {
	
	public Ventana ventana;
	public Modelo modelo;
	
	//instanciar todos los controladores del cada panel
	private ControladorBienvenida controladorpanelbienvenida;
	private ControladorMenuPrincipal controladormenuprincipal;
	private ControladorMenuOpcion controladormenuopcion;
	private ControladorParadas controladorparadas;
	private ControladorBus controladorbus;
	
	public Controlador(Ventana ventana,Modelo mode) {
		this.ventana=ventana;
		this.modelo=mode;
		
		this.setControladorpanelbienvenida(new ControladorBienvenida(ventana,mode));
		this.setControladormenuprincipal(new ControladorMenuPrincipal(ventana,mode));
		this.setControladormenuopcion(new ControladorMenuOpcion(ventana,mode));
		this.setControladorparadas(new ControladorParadas(ventana,mode));
		this.setControladorbus(new ControladorBus(ventana,mode));
	}

	public ControladorBienvenida getControladorpanelbienvenida() {
		return controladorpanelbienvenida;
	}

	public void setControladorpanelbienvenida(ControladorBienvenida controladorpanelbienvenida) {
		this.controladorpanelbienvenida = controladorpanelbienvenida;
	}

	public ControladorMenuPrincipal getControladormenuprincipal() {
		return controladormenuprincipal;
	}

	public void setControladormenuprincipal(ControladorMenuPrincipal controladormenuprincipal) {
		this.controladormenuprincipal = controladormenuprincipal;
	}

	public ControladorMenuOpcion getControladormenuopcion() {
		return controladormenuopcion;
	}

	public void setControladormenuopcion(ControladorMenuOpcion controladormenuopcion) {
		this.controladormenuopcion = controladormenuopcion;
	}

	public ControladorParadas getControladorparadas() {
		return controladorparadas;
	}

	public void setControladorparadas(ControladorParadas controladorparadas) {
		this.controladorparadas = controladorparadas;
	}

	public ControladorBus getControladorbus() {
		return controladorbus;
	}

	public void setControladorbus(ControladorBus controladorbus) {
		this.controladorbus = controladorbus;
	}
	


	

}
