package Vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	public PanelBienvenida panelbienvenida;
	public PanelMenuPrincipal panelmenuprincipal;
	public PanelMenuOpcion panelmenuopcion;
	public PanelParadas panelparadas;
	public PanelBus panelbus;
	public PanelLogin panellogin;
	public PanelRegistro panelregistro;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldContrasena;
	private JLabel lblFondo;
	

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//instanciar Bienvenida
		panelbienvenida= new PanelBienvenida();
		contentPane.add(panelbienvenida);
		panelbienvenida.setLayout(null);
		
		//instanciar menu principal
		panelmenuprincipal= new PanelMenuPrincipal();
		contentPane.add(panelmenuprincipal);
		panelmenuprincipal.setLayout(null);
		
		//instanciar menu opciones
		panelmenuopcion= new PanelMenuOpcion();
		contentPane.add(panelmenuopcion);
		panelmenuopcion.setLayout(null);
		
		//instanciar panel de las paradas
		panelparadas= new PanelParadas();
		contentPane.add(panelparadas);
		panelparadas.setLayout(null);
		
		//instanciar panel del bus
		panelbus= new PanelBus();
		contentPane.add(panelbus);
		panelbus.setLayout(null);

		//instanciar login
		panellogin= new PanelLogin();
		contentPane.add(panellogin);
		panellogin.setLayout(null);
		
		//instanciar registro
		panelregistro= new PanelRegistro();
		contentPane.add(panelregistro);
		panelregistro.setLayout(null);
		
		
		


		

		
		
		
		
	}
}
