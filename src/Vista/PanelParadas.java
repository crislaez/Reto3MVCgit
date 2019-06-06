package Vista;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.toedter.calendar.JDateChooser;

import Modelo.Parada;

public class PanelParadas extends JPanel {

	public ArrayList<Parada>paradas=new ArrayList<Parada>();
	public JLabel lblNewLabel,lblFondo;
	public JDateChooser dateChooserInicio,dateChooserFinal;
	public JButton btnAtras,btnContinuar;
	public JScrollPane scrollPaneIda,scrollPaneVuelta;
	public JList listLineaIda,listLineaVuelta;
	public DefaultListModel modelo2,modelo3;
	
	public PanelParadas() {
		
		lblNewLabel = new JLabel("Seleccione Fecha y Destino");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 37));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(210, 60, 512, 100);
		add(lblNewLabel);
		
		dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(40, 367, 395, 19);
		add(dateChooserInicio);
		
		dateChooserFinal = new JDateChooser();
		dateChooserFinal.setBounds(492, 367, 401, 19);
		add(dateChooserFinal);
		dateChooserFinal.setEnabled(false);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtras.setBounds(-13, 565, 198, 48);
		add(btnAtras);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuar.setBounds(738, 565, 198, 48);
		add(btnContinuar);
		btnContinuar.setEnabled(false);
		
		
		
		scrollPaneIda = new JScrollPane();
		scrollPaneIda.setBounds(40, 170, 395, 145);
		add(scrollPaneIda);
		
		listLineaIda = new JList();
		scrollPaneIda.setViewportView(listLineaIda);
		modelo2= new DefaultListModel();
		
		scrollPaneVuelta = new JScrollPane();
		scrollPaneVuelta.setBounds(497, 170, 395, 145);
		add(scrollPaneVuelta);
		
		listLineaVuelta = new JList();
		scrollPaneVuelta.setViewportView(listLineaVuelta);
		modelo3= new DefaultListModel();

		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);

	}

}
