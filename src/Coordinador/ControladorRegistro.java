package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorRegistro implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorRegistro(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelregistro.btnAtras.addActionListener(this);
		ventana.panelregistro.btnRegistrarse.addActionListener(this);
		ventana.panelregistro.rdbtnHombre.addActionListener(this);
		ventana.panelregistro.rdbtnMujer.addActionListener(this);
	}
	public void resetear() {
		ventana.panelregistro.formattedDni.setText("");
		ventana.panelregistro.textFieldNombre.setText("");
		ventana.panelregistro.textFieldApellido.setText("");
		ventana.panelregistro.formattedFecha.setText("");
		ventana.panelregistro.textFieldContrasena.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelregistro.btnAtras) {
			funciones.cambiarDePanel(ventana.panelregistro, ventana.panelmenuopcion);
			ventana.panelparadas.btnContinuar.setEnabled(false);
			Modelo.aux2=0;
		}
		if (e.getSource()==ventana.panelregistro.btnRegistrarse) {
			modelo.modeloregistro.registrarse(ventana.panelregistro.formattedDni, ventana.panelregistro.textFieldNombre, ventana.panelregistro.textFieldApellido, ventana.panelregistro.formattedFecha, ventana.panelregistro.textFieldContrasena, modelo.cliente, ventana.panelregistro, ventana.panellogin);
			resetear();
		}
		if (e.getSource()==ventana.panelregistro.rdbtnHombre) {
					modelo.modeloregistro.rbthombre(ventana.panelregistro.rdbtnHombre, ventana.panelregistro.rdbtnMujer);
		}
		if (e.getSource()==ventana.panelregistro.rdbtnMujer) {
			modelo.modeloregistro.rbtmujer(ventana.panelregistro.rdbtnHombre, ventana.panelregistro.rdbtnMujer);
		}

		
	}
}
