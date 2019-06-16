package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorBorrarBillete implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorBorrarBillete(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelborrarbillete.btnAtras.addActionListener(this);
		ventana.panelborrarbillete.btnBorrar.addActionListener(this);
		
	}
	public void resetear() {
		ventana.panelborrarbillete.textFieldCodigoBillete.setText("");
		ventana.panelborrarbillete.formattedTextFieldDni.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelborrarbillete.btnAtras) {
			funciones.cambiarDePanel(ventana.panelborrarbillete, ventana.panelmenuopcion);
			resetear();
		}
		if (e.getSource()==ventana.panelborrarbillete.btnBorrar) {
			modelo.modeloborrarbillete.borrar(ventana.panelborrarbillete.textFieldCodigoBillete, ventana.panelborrarbillete.formattedTextFieldDni, ventana.panelborrarbillete, ventana.panelmenuprincipal);
		}
	}
	
	
}
