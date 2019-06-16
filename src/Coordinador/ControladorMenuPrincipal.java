package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorMenuPrincipal implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorMenuPrincipal(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelmenuprincipal.btnhacerreserva.addActionListener(this);
		ventana.panelmenuprincipal.btnborrarreserva.addActionListener(this);
		ventana.panelmenuprincipal.btnborrarcliente.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelmenuprincipal.btnhacerreserva) {
			funciones.cambiarDePanel(ventana.panelmenuprincipal, ventana.panelmenuopcion);
			
		}
		if (e.getSource()==ventana.panelmenuprincipal.btnborrarreserva) {
			funciones.cambiarDePanel(ventana.panelmenuprincipal, ventana.panelborrarbillete);
			
		}
		if (e.getSource()==ventana.panelmenuprincipal.btnborrarcliente) {
			//funciones.cambiarDePanel(ventana.panelbienvenida, ventana.panelmenuprincipal);
			
		}
	}
}
