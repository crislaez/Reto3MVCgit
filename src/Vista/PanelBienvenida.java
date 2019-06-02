package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class PanelBienvenida extends JPanel {

	public JButton btnBienvenida;
	
	public PanelBienvenida() {

		btnBienvenida = new JButton("Bienvenid@");
		btnBienvenida.setFont(new Font("Arial", Font.BOLD, 57));
		btnBienvenida.setBounds(0, 0, 926, 603);
		add(btnBienvenida);
	}

}
