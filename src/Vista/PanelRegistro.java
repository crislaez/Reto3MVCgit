package Vista;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PanelRegistro extends JPanel {

	public JLabel lblRegistro,lblDni,lblNombre,lblApellido,lblFechanac,lblSexo,lblContrasena,lblFondo;
	public JFormattedTextField formattedDni,formattedFecha;
	public JTextField textFieldNombre,textFieldApellido,textFieldContrasena;
	public JRadioButton rdbtnHombre,rdbtnMujer;
	public JButton btnAtras,btnRegistrarse;
	
	public PanelRegistro() {

		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("########?");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MaskFormatter mft = null;
		try {
			mft = new MaskFormatter("####-##-##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Arial", Font.BOLD, 37));
		lblRegistro.setBounds(357, 40, 205, 63);
		add(lblRegistro);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Arial", Font.BOLD, 27));
		lblDni.setBounds(318, 145, 64, 27);
		add(lblDni);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 27));
		lblNombre.setBounds(244, 203, 138, 27);
		add(lblNombre);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 27));
		lblApellido.setBounds(226, 260, 156, 27);
		add(lblApellido);
		
		lblFechanac = new JLabel("FECHA DE NACIMIENTO:");
		lblFechanac.setFont(new Font("Arial", Font.BOLD, 27));
		lblFechanac.setBounds(49, 323, 333, 27);
		add(lblFechanac);
		
		lblSexo = new JLabel("SEXO:");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 27));
		lblSexo.setBounds(297, 387, 85, 27);
		add(lblSexo);
		
		lblContrasena = new JLabel("CONTRASE\u00D1A:");
		lblContrasena.setFont(new Font("Arial", Font.BOLD, 27));
		lblContrasena.setBounds(175, 446, 205, 27);
		add(lblContrasena);
		
		formattedDni = new JFormattedTextField(mf);
		formattedDni.setBounds(418, 150, 181, 28);
		add(formattedDni);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(418, 208, 183, 28);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(420, 265, 181, 28);
		add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		formattedFecha = new JFormattedTextField(mft);
		formattedFecha.setBounds(420, 328, 181, 28);
		add(formattedFecha);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(420, 451, 181, 28);
		add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		rdbtnHombre = new JRadioButton("HOMBRE");
		rdbtnHombre.setFont(new Font("Arial", Font.ITALIC, 17));
		rdbtnHombre.setBounds(408, 393, 105, 21);
		add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("MUJER");
		rdbtnMujer.setFont(new Font("Arial", Font.ITALIC, 17));
		rdbtnMujer.setBounds(538, 393, 105, 21);
		add(rdbtnMujer);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 15));
		btnRegistrarse.setBounds(738, 565, 198, 48);
		add(btnRegistrarse);

		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);
		
		
	}

}
