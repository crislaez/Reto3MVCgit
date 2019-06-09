package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.apache.commons.codec.digest.DigestUtils;

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
	public void continuar(JFormattedTextField dni, JPasswordField contrasena,JPanel panellogin, JPanel panelpago,Cliente cliente) {
		int aux=0;
		cliente.setDNI(dni.getText());
		Modelo.encriptMD5=DigestUtils.md5Hex(contrasena.getText());
		cliente.setContraseña(Modelo.encriptMD5);
		System.out.println(cliente.getDNI());
		System.out.println(cliente.getContraseña());
		try {
			aux=gestor.comprovardnicontraseña(cliente.getDNI(), cliente.getContraseña());
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
