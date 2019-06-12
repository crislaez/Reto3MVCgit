package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorTicket implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	int aux=0;
	
	public ControladorTicket(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelticket.btnMas.addActionListener(this);
		ventana.panelticket.btnFinalizar.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelticket.btnMas) {
			funciones.cambiarDePanel(ventana.panelticket, ventana.panelmenuprincipal);
		}
		if (e.getSource()==ventana.panelticket.btnFinalizar) {
			System.exit(-1);
		}
		
	}

}
