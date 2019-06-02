package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorMenuOpcion implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorMenuOpcion(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelmenuopcion.rdbtnIda.addActionListener(this);
		ventana.panelmenuopcion.rdbtnVuelta.addActionListener(this);
		ventana.panelmenuopcion.btnAtras.addActionListener(this);
		ventana.panelmenuopcion.btnContinuar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelmenuopcion.rdbtnIda) {
			modelo.modelomenuopcion.rida(ventana.panelmenuopcion.rdbtnIda, ventana.panelmenuopcion.rdbtnVuelta,ventana.panelmenuopcion.listLinea,ventana.panelmenuopcion.modelo1);
			
		}
		if (e.getSource()==ventana.panelmenuopcion.rdbtnVuelta) {
			modelo.modelomenuopcion.rvuelta(ventana.panelmenuopcion.rdbtnIda, ventana.panelmenuopcion.rdbtnVuelta,ventana.panelmenuopcion.listLinea,ventana.panelmenuopcion.modelo1);
			
		}
		if (e.getSource()==ventana.panelmenuopcion.btnAtras) {
			funciones.cambiarDePanel(ventana.panelmenuopcion, ventana.panelmenuprincipal);
			
		}
		if (e.getSource()==ventana.panelmenuopcion.btnContinuar) {
			//funciones.cambiarDePanel(ventana.panelbienvenida, ventana.panelmenuprincipal);
			
		}
		
	}
}
