package Vista;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PanelBorrarBillete extends JPanel {

	public JLabel lblCodigobillete,lblDni,lblTitulo,lblFondo;
	public JTextField textFieldCodigoBillete; 
	public JFormattedTextField formattedTextFieldDni;
	public JButton btnAtras,btnBorrar;
	
	public PanelBorrarBillete() {

		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("########?");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lblCodigobillete = new JLabel("CODIGO BILLETE:");
		lblCodigobillete.setFont(new Font("Arial", Font.BOLD, 27));
		lblCodigobillete.setBounds(153, 194, 249, 24);
		add(lblCodigobillete);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Arial", Font.BOLD, 27));
		lblDni.setBounds(339, 318, 63, 32);
		add(lblDni);
		
		textFieldCodigoBillete = new JTextField();
		textFieldCodigoBillete.setBounds(417, 189, 142, 32);
		add(textFieldCodigoBillete);
		textFieldCodigoBillete.setColumns(10);
		
		formattedTextFieldDni = new JFormattedTextField(mf);
		formattedTextFieldDni.setBounds(417, 324, 142, 32);
		add(formattedTextFieldDni);
		
		lblTitulo = new JLabel("INTRODUDCA LOS DATOS");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 47));
		lblTitulo.setBounds(134, 62, 629, 46);
		add(lblTitulo);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Arial", Font.BOLD, 15));
		btnBorrar.setBounds(738, 565, 198, 48);
		add(btnBorrar);
		
		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 593);
		add(lblFondo);
				
		
	}

}
