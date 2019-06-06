package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelBus extends JPanel {

	public JScrollPane scrollPaneBuses;
	public JList listBuses;
	public JButton btnAtras,btnContinuar;
	public JLabel lblEscogerbus,lblFondo;
	public DefaultListModel modelo4;
	
	public PanelBus() {

		
		scrollPaneBuses = new JScrollPane();
		scrollPaneBuses.setBounds(132, 129, 674, 353);
		add(scrollPaneBuses);
		
		listBuses = new JList();
		scrollPaneBuses.setViewportView(listBuses);
		modelo4= new DefaultListModel();
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuar.setBounds(738, 565, 198, 48);
		add(btnContinuar);
		btnContinuar.setEnabled(false);
		
		lblEscogerbus = new JLabel("ESCOJA AUTOBUS");
		lblEscogerbus.setForeground(Color.BLACK);
		lblEscogerbus.setFont(new Font("Arial", Font.BOLD, 37));
		lblEscogerbus.setBounds(289, 46, 371, 59);
		add(lblEscogerbus);
		
		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);
	}

}
