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
	private ControladorLogin controladorlogin;
	private ControladorRegistro controladorregistro;
	private ControladorPago controladorpago;
	
	public Controlador(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		this.setControladorpanelbienvenida(new ControladorBienvenida(ventana,modelo));
		this.setControladormenuprincipal(new ControladorMenuPrincipal(ventana,modelo));
		this.setControladormenuopcion(new ControladorMenuOpcion(ventana,modelo));
		this.setControladorparadas(new ControladorParadas(ventana,modelo));
		this.setControladorbus(new ControladorBus(ventana,modelo));
		this.setControladorlogin(new ControladorLogin(ventana,modelo));
		this.setControladorregistro(new ControladorRegistro(ventana,modelo));
		this.setControladorpago(new ControladorPago(ventana,modelo));
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

	public ControladorLogin getControladorlogin() {
		return controladorlogin;
	}

	public void setControladorlogin(ControladorLogin controladorlogin) {
		this.controladorlogin = controladorlogin;
	}

	public ControladorRegistro getControladorregistro() {
		return controladorregistro;
	}

	public void setControladorregistro(ControladorRegistro controladorregistro) {
		this.controladorregistro = controladorregistro;
	}

	public ControladorPago getControladorpago() {
		return controladorpago;
	}

	public void setControladorpago(ControladorPago controladorpago) {
		this.controladorpago = controladorpago;
	}
	


	

}
