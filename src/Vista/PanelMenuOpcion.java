package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class PanelMenuOpcion extends JPanel {

	public JRadioButton rdbtnIda,rdbtnVuelta;
	public JScrollPane scrollPaneLinea;
	public JList listLinea;
	public JButton btnAtras,btnContinuar;
	public JLabel lblFondo,lblescogerlinea;
	public DefaultListModel modelo1;
	
	public PanelMenuOpcion() {

		rdbtnIda = new JRadioButton("Ida");
		rdbtnIda.setFont(new Font("Arial", Font.BOLD, 27));
		rdbtnIda.setBounds(173, 114, 105, 21);
		add(rdbtnIda);
		
		rdbtnVuelta = new JRadioButton("Vuelta");
		rdbtnVuelta.setFont(new Font("Arial", Font.BOLD, 27));
		rdbtnVuelta.setBounds(675, 119, 124, 21);
		add(rdbtnVuelta);
		
		scrollPaneLinea = new JScrollPane();
		scrollPaneLinea.setBounds(279, 246, 393, 209);
		add(scrollPaneLinea);
		
		listLinea = new JList();
		scrollPaneLinea.setViewportView(listLinea);
		modelo1= new DefaultListModel();
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuar.setBounds(738, 565, 198, 48);
		add(btnContinuar);
		btnContinuar.setEnabled(false);
		
		lblescogerlinea = new JLabel("Escoja Linea");
		lblescogerlinea.setForeground(Color.WHITE);
		lblescogerlinea.setFont(new Font("Arial", Font.BOLD, 37));
		lblescogerlinea.setBounds(369, 34, 236, 59);
		add(lblescogerlinea);
		
		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AReto3MVC\\Cosas\\fondo1.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);

	}

}
