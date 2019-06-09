package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorBus implements ActionListener, MouseListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorBus(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelbus.btnAtras.addActionListener(this);
		ventana.panelbus.btnContinuar.addActionListener(this);
		
		ventana.panelbus.listBuses.addMouseListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelbus.btnAtras) {
			funciones.cambiarDePanel(ventana.panelbus, ventana.panelmenuopcion);	
			ventana.panelparadas.btnContinuar.setEnabled(false);
			Modelo.aux2=0;
		}
		if (e.getSource()==ventana.panelbus.btnContinuar) {
			modelo.modelobus.precio(modelo.billete,modelo.billete2,ventana.panelpago.DineroFaltante);
			funciones.cambiarDePanel(ventana.panelbus, ventana.panellogin);
			
		}

		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelbus.listBuses) {
			
			try {
				Modelo.cadena4= (String) ventana.panelbus.listBuses.getSelectedValue();
				modelo.modelobus.bus(ventana.panelbus.modelo4, modelo.billete, modelo.billete2);
				ventana.panelbus.btnContinuar.setEnabled(true);
			}catch(NullPointerException e1) {
				System.out.println("NullPointerException corregido");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
