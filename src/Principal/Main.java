package Principal;

import Coordinador.Controlador;

import Modelo.Modelo;

import Vista.Ventana;


public class Main {

	Modelo modelo;
	Controlador controlador;
	Ventana ventana;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main();
		main.iniciar();
	}
	public void iniciar() {
		// Instanciar clases
		ventana = new Ventana();
		modelo = new Modelo();
		controlador = new Controlador(ventana, modelo);
		
		// Asociaciones entre clases
		modelo.setControlador(controlador); 
				
		//Iniciar la ventana
		ventana.setVisible(true);
		
	}

}
