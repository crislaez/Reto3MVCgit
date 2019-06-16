package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModeloBorrarBillete {

	public GestorBd gestor;
	public boolean aux;
	
	public ModeloBorrarBillete(GestorBd gestor) {
		this.gestor=gestor;
	}
	
	public void borrar(JTextField textFieldCodigoBillete,JFormattedTextField formattedTextFieldDni,JPanel panelborrarbillete,JPanel panelmenuprincipal) {
		int cod=0;
		String dni="";
		
		try {
			 cod=Integer.parseInt(textFieldCodigoBillete.getText());
			 dni=formattedTextFieldDni.getText();
			
		}catch(Exception e) {
			 cod=0;
			 dni="";
		}
	
		int prueba=0;
		int decision=JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar el Billete?","Advertencia",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
		
		 if(decision==JOptionPane.YES_OPTION) {
				try {
					prueba=gestor.borrarBillete(cod, dni);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//System.out.println("Exception corregido");
					e.printStackTrace();
				}
				if(prueba==1) {
					JOptionPane.showMessageDialog(null, "Datos Incorrectos");
				}
				else if(prueba==0) {
					panelborrarbillete.setVisible(false);
					panelmenuprincipal.setVisible(true);
				}
		 }
	}
	
}
