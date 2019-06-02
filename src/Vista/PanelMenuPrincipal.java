package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

	public JButton btnhacerreserva,btnborrarreserva,btnborrarcliente;
	public JLabel lblfondopanelprincipal;
	
	public PanelMenuPrincipal() {

		btnhacerreserva = new JButton("Hacer Reserva");
		btnhacerreserva.setFont(new Font("Arial", Font.BOLD, 47));
		btnhacerreserva.setBounds(89, 60, 722, 83);
		add(btnhacerreserva);
		
		btnborrarreserva = new JButton("Borrar Reserva");
		btnborrarreserva.setFont(new Font("Arial", Font.BOLD, 47));
		btnborrarreserva.setBounds(89, 243, 722, 83);
		add(btnborrarreserva);
		
		btnborrarcliente = new JButton("Borrar Cliente");
		btnborrarcliente.setFont(new Font("Arial", Font.BOLD, 47));
		btnborrarcliente.setBounds(89, 419, 722, 83);
		add(btnborrarcliente);
		
		lblfondopanelprincipal = new JLabel("New label");
		lblfondopanelprincipal.setIcon(new ImageIcon("C:\\eclipse-workspace\\AReto3MVC\\Cosas\\fondo1.jpg"));
		lblfondopanelprincipal.setBounds(0, 0, 926, 616);
		add(lblfondopanelprincipal);
	}

}
