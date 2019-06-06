package Modelo;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JRadioButton;

import com.toedter.calendar.JDateChooser;

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
	public void rida(JRadioButton rdbtnIda,JRadioButton rdbtnVuelta,JList lista,DefaultListModel modelo,JButton continuar) {
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
			continuar.setEnabled(false);
		}
		
	}
	/**
	 * 
	 * @param rdbtnIda
	 * @param rdbtnVuelta
	 * @param lista
	 * @param modelo
	 */
	public void rvuelta(JRadioButton rdbtnIda,JRadioButton rdbtnVuelta,JList lista,DefaultListModel modelo,JDateChooser dateChooserFinal,JButton continuar) {
		if(rdbtnVuelta.isSelected()) {
			rdbtnIda.setEnabled(false);
			aux=true;
			System.out.println(aux);
			gestor.verlineas(lista, modelo);
			dateChooserFinal.setEnabled(true);
			Modelo.aux2=1;
			System.out.println(Modelo.aux2);
		}
		else if(!rdbtnVuelta.isSelected()) {
			rdbtnIda.setEnabled(true);
			aux=false;
			System.out.println(aux);
			modelo.clear();
			dateChooserFinal.setEnabled(false);
			Modelo.aux2=0;
			continuar.setEnabled(false);
		}
	}
	/**
	 * 
	 * @param listaIda
	 * @param modelo2
	 * @param listaVuelta
	 * @param modelo3
	 * @param billete
	 */
	public void codigolinea(JList listaIda,DefaultListModel modelo2,JList listaVuelta,DefaultListModel modelo3,Billete billete,Billete billete2) {
		Modelo.codigo=Modelo.cadena.split(",")[1];
		billete.setCod_Linea(Modelo.codigo);
		billete2.setCod_Linea(Modelo.codigo);
		System.out.println("CodigoLinea Billete1: "+billete.getCod_Linea());
		System.out.println("CodigoLinea Billete2: "+billete2.getCod_Linea());
		gestor.verparadas(Modelo.codigo, listaIda, modelo2,listaVuelta,modelo3);
	}

	/*
	public void rellenarcomboidavuelta(JList listaIda,DefaultListModel modelo2,JList listaVuelta,DefaultListModel modelo3) {
		
		gestor.verparadas(Modelo.codigo, listaIda, modelo2,listaVuelta,modelo3);
	}
	*/
	//-----------
}
