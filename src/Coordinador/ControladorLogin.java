package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorLogin implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorLogin(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panellogin.btnAtras.addActionListener(this);
		ventana.panellogin.btnContinuar.addActionListener(this);
		ventana.panellogin.btnRegistrarse.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panellogin.btnAtras) {
			funciones.cambiarDePanel(ventana.panellogin, ventana.panelmenuopcion);
			ventana.panelparadas.btnContinuar.setEnabled(false);
			Modelo.aux2=0;
		}
		if (e.getSource()==ventana.panellogin.btnContinuar) {
			//modelo.modelologin.continuar(ventana.panellogin.formatteddni, ventana.panellogin.passworContraseña, ventana.panellogin, ventana.panelpago);		
					
		}
		if (e.getSource()==ventana.panellogin.btnRegistrarse) {
			funciones.cambiarDePanel(ventana.panellogin, ventana.panelregistro);
			
		}
		
	}

}
