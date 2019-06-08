package Vista;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PanelLogin extends JPanel {

	public JLabel lblLogin,lblDni,lblContrasena,lblFondo;
	public JFormattedTextField formattedTextField;
	public JPasswordField passwordField;
	public JButton btnAtras,btnContinuar,btnRegistrarse;
	
	public PanelLogin() {

		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("########?");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MaskFormatter mft = null;
		try {
			mft = new MaskFormatter("##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 37));
		lblLogin.setBounds(422, 84, 124, 68);
		add(lblLogin);
		
		lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.BLACK);
		lblDni.setFont(new Font("Arial", Font.BOLD, 27));
		lblDni.setBounds(331, 229, 65, 32);
		add(lblDni);
		
		lblContrasena = new JLabel("CONTRASE\u00D1A: ");
		lblContrasena.setForeground(Color.BLACK);
		lblContrasena.setFont(new Font("Arial", Font.BOLD, 27));
		lblContrasena.setBounds(186, 318, 210, 39);
		add(lblContrasena);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(422, 229, 139, 31);
		add(formattedTextField);
			
		
		passwordField = new JPasswordField();
		passwordField.setBounds(422, 325, 139, 32);
		add(passwordField);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuar.setBounds(738, 565, 198, 48);
		add(btnContinuar);
		//btnContinuar.setEnabled(false);
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 15));
		btnRegistrarse.setBounds(631, 229, 151, 128);
		add(btnRegistrarse);
		
		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);
		
	}

}
