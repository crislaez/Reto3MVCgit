package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.apache.commons.codec.digest.DigestUtils;

public class ModeloRegistro {

	public GestorBd gestor;
	String sexo="";
	public ModeloRegistro(GestorBd gestor) {
		
		this.gestor=gestor;
		
		
	}
	/**
	 * 
	 * @param hombre
	 * @param mujer
	 */
	public void rbthombre(JRadioButton hombre,JRadioButton mujer) {
		if(hombre.isSelected()) {
			sexo="V";
			System.out.println("Sexo: "+sexo);
			mujer.setEnabled(false);
		}
		else if(!hombre.isSelected()) {
			sexo="";
			System.out.println("Sexo: "+sexo);
			mujer.setEnabled(true);
		}
	}
	/**
	 * 
	 * @param hombre
	 * @param mujer
	 */
	public void rbtmujer(JRadioButton hombre,JRadioButton mujer) {
		if(mujer.isSelected()) {
			sexo="M";
			System.out.println("Sexo: "+sexo);
			hombre.setEnabled(false);
		}
		else if(!mujer.isSelected()) {
			sexo="";
			System.out.println("Sexo: "+sexo);
			hombre.setEnabled(true);
		}
	}
	public void registrarse(JFormattedTextField dni,JTextField nombre,JTextField apellido,JFormattedTextField fecha,JTextField contrasena,Cliente cliente,JPanel registro, JPanel login) {
	
		int aux=0;	
		if(dni.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ingrese el dni");
		}
		else if(nombre.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ingrese el nombre");
		}
		else if(apellido.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ingrese el apellido");
		}
		else if(fecha.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ingrese la fecha");
		}
		else if(contrasena.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "ingrese la contrasena");
		}
		else {
			cliente.setDNI(dni.getText());
			cliente.setNombre(nombre.getText());
			cliente.setApellidos(apellido.getText());
			cliente.setFecha_nac(fecha.getText());
			cliente.setSexo(sexo);
			Modelo.encriptMD5=DigestUtils.md5Hex(contrasena.getText());
			cliente.setContraseña(Modelo.encriptMD5);
			try {
				aux=gestor.insertarCliente(cliente.getDNI(), cliente.getNombre(), cliente.getApellidos(), cliente.getFecha_nac(), cliente.getSexo(), cliente.getContraseña());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception corregido");
				System.out.println("Error");
			}
			if(aux==0) {
				registro.setVisible(false);
				login.setVisible(true);
				JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al comprobar los datos");
			}
		}

	}
	//------------------------------------
}
