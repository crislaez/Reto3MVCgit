package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class PanelTicket extends JPanel {

	public JLabel lblTiket,lblFondo;
	public JScrollPane scrollPaneTicket;
	public JTextPane textPaneTicket;
	public JButton btnMas,btnFinalizar;
	
	public PanelTicket() {

		
		lblTiket = new JLabel("SU TICKET");
		lblTiket.setFont(new Font("Arial", Font.BOLD, 37));
		lblTiket.setBounds(360, 68, 219, 50);
		add(lblTiket);
		
		scrollPaneTicket = new JScrollPane();
		scrollPaneTicket.setBounds(191, 145, 550, 323);
		add(scrollPaneTicket);
		
		textPaneTicket = new JTextPane();
		scrollPaneTicket.setViewportView(textPaneTicket);
		
		btnMas = new JButton("MAS");
		btnMas.setFont(new Font("Arial", Font.BOLD, 15));
		btnMas.setBounds(-13, 565, 198, 48);
		add(btnMas);
		
		btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.setFont(new Font("Arial", Font.BOLD, 15));
		btnFinalizar.setBounds(738, 565, 198, 48);
		add(btnFinalizar);
		
		lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\eclipse-workspace\\AAReto3MVC\\Cosas\\fondo3.jpg"));
		lblFondo.setBounds(0, 0, 926, 603);
		add(lblFondo);
		
	}

}
