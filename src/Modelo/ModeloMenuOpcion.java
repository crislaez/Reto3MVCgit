package Modelo;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class ModeloMenuOpcion {

	public GestorBd gestor;
	public boolean aux;
	
	public ModeloMenuOpcion(GestorBd gestor) {
		this.gestor=gestor;
	}
	/**
	 * 
	 * @param rdbtnIda
	 * @param rdbtnVuelta
	 * @param lista
	 * @param modelo
	 */
	public void rida(JRadioButton rdbtnIda,JRadioButton rdbtnVuelta,JList lista,DefaultListModel modelo) {
		if(rdbtnIda.isSelected()) {
			rdbtnVuelta.setEnabled(false);
			aux=true;
			System.out.println(aux);
			gestor.verlineas(lista, modelo);
		}
		else if(!rdbtnIda.isSelected()) {
			rdbtnVuelta.setEnabled(true);
			aux=false;
			System.out.println(aux);
			modelo.clear();
		}
		
	}
	/**
	 * 
	 * @param rdbtnIda
	 * @param rdbtnVuelta
	 * @param lista
	 * @param modelo
	 */
	public void rvuelta(JRadioButton rdbtnIda,JRadioButton rdbtnVuelta,JList lista,DefaultListModel modelo) {
		if(rdbtnVuelta.isSelected()) {
			rdbtnIda.setEnabled(false);
			aux=true;
			System.out.println(aux);
			gestor.verlineas(lista, modelo);
		}
		else if(!rdbtnVuelta.isSelected()) {
			rdbtnIda.setEnabled(true);
			aux=false;
			System.out.println(aux);
			modelo.clear();
		}
	}
}
