package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorMenuOpcion implements ActionListener, MouseListener{

	
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
		
		ventana.panelmenuopcion.listLinea.addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelmenuopcion.rdbtnIda) {
			modelo.modelomenuopcion.rida(ventana.panelmenuopcion.rdbtnIda, ventana.panelmenuopcion.rdbtnVuelta,ventana.panelmenuopcion.listLinea,ventana.panelmenuopcion.modelo1,ventana.panelmenuopcion.btnContinuar);
			
		}
		if (e.getSource()==ventana.panelmenuopcion.rdbtnVuelta) {
			modelo.modelomenuopcion.rvuelta(ventana.panelmenuopcion.rdbtnIda, ventana.panelmenuopcion.rdbtnVuelta,ventana.panelmenuopcion.listLinea,ventana.panelmenuopcion.modelo1,ventana.panelparadas.dateChooserFinal,ventana.panelmenuopcion.btnContinuar);
			
		}
		if (e.getSource()==ventana.panelmenuopcion.btnAtras) {
			funciones.cambiarDePanel(ventana.panelmenuopcion, ventana.panelmenuprincipal);
			ventana.panelmenuopcion.btnContinuar.setEnabled(false);
		}
		if (e.getSource()==ventana.panelmenuopcion.btnContinuar) {
			modelo.modelomenuopcion.codigolinea(ventana.panelparadas.listLineaIda,ventana.panelparadas.modelo2, ventana.panelparadas.listLineaVuelta,ventana.panelparadas.modelo3,modelo.billete,modelo.billete2);	
			funciones.cambiarDePanel(ventana.panelmenuopcion, ventana.panelparadas);
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		try {
			Modelo.cadena= (String) ventana.panelmenuopcion.listLinea.getSelectedValue();
			ventana.panelmenuopcion.btnContinuar.setEnabled(true);
			
			//modelo.modelomenuopcion.rellenarcomboidavuelta( ventana.panelparadas.listLineaIda,ventana.panelparadas.modelo2, ventana.panelparadas.listLineaVuelta,ventana.panelparadas.modelo3);
			
		}catch(NullPointerException e1) {
			System.out.println("NullPointerException corregido");
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
