package Modelo;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ModeloLogin {

	public GestorBd gestor;
	public boolean aux;
	
	public ModeloLogin(GestorBd gestor) {
		this.gestor=gestor;
	}
	/**
	 * 
	 * @param dni
	 * @param contrasena
	 * @param panellogin
	 * @param panelpago
	 */
	public void continuar(String dni, String contrasena,JPanel panellogin, JPanel panelpago) {
		int aux=1;
		try {
			aux=gestor.comprovardnicontraseña(dni, contrasena);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception corregido");
		}
		if(aux==1) {
			panellogin.setVisible(false);
			panelpago.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Datos Incorrectos");
		}
	}
	//------------------------------------------------
}
