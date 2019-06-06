package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import Modelo.Modelo;
import Vista.Ventana;

public class ControladorParadas implements ActionListener,MouseListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	private Ventana ventana;
	private Modelo modelo;
	int aux=0;
	
	public ControladorParadas(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelparadas.btnAtras.addActionListener(this);
		ventana.panelparadas.btnContinuar.addActionListener(this);
		
		ventana.panelparadas.dateChooserInicio.getCalendarButton().addActionListener(this);
		ventana.panelparadas.dateChooserFinal.getCalendarButton().addActionListener(this);
		
		ventana.panelparadas.listLineaIda.addMouseListener(this);
		ventana.panelparadas.listLineaVuelta.addMouseListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana.panelparadas.btnAtras) {
			funciones.cambiarDePanel(ventana.panelparadas, ventana.panelmenuopcion);
			ventana.panelparadas.btnContinuar.setEnabled(false);
			aux=0;
			Modelo.aux2=0;
		}
		if (e.getSource()==ventana.panelparadas.btnContinuar) {
			//funciones.cambiarDePanel(ventana.panelparadas, ventana.);
			modelo.modeloparadas.fechas(ventana.panelparadas.dateChooserInicio, modelo.billete);
			if(Modelo.aux2==1) {
				modelo.modeloparadas.fechasvueltas(ventana.panelparadas.dateChooserFinal, modelo.billete2);
			}
			
			modelo.modeloparadas.continuar(ventana.panelparadas, ventana.panelbus,ventana.panelparadas.dateChooserInicio,ventana.panelparadas.dateChooserFinal,ventana.panelbus.listBuses,ventana.panelbus.modelo4);
			
		}
		
		if (e.getSource()==ventana.panelparadas.dateChooserInicio.getCalendarButton()) {
			
			modelo.modeloparadas.limitar(ventana.panelparadas.dateChooserInicio, ventana.panelparadas.dateChooserFinal);
			modelo.modeloparadas.fechaida(ventana.panelparadas.dateChooserInicio, ventana.panelparadas.dateChooserFinal);
	
			
		}
		if (e.getSource()==ventana.panelparadas.dateChooserFinal.getCalendarButton()) {
			System.out.println("aqui");
			modelo.modeloparadas.limitar(ventana.panelparadas.dateChooserInicio, ventana.panelparadas.dateChooserFinal);
			modelo.modeloparadas.fechavuelta(ventana.panelparadas.dateChooserInicio, ventana.panelparadas.dateChooserFinal);
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==ventana.panelparadas.listLineaIda) {
			try {
				aux=1;
				Modelo.uno=ventana.panelparadas.listLineaIda.getSelectedIndex();
				
				Modelo.cadena2= (String) ventana.panelparadas.listLineaIda.getSelectedValue();
				modelo.modeloparadas.codigoinicio(ventana.panelparadas.listLineaIda, ventana.panelparadas.modelo2, modelo.billete,modelo.billete2);
			}catch(NullPointerException e1){
				System.out.println("NullPointerException corregido");
			}
			
			
		}
		if (e.getSource()==ventana.panelparadas.listLineaVuelta) {
			if (aux==0) {
				JOptionPane.showMessageDialog(null, "Seleccione primero su parada de origen");
			}
			else {
				try {
					Modelo.dos=ventana.panelparadas.listLineaVuelta.getSelectedIndex();
					
					Modelo.cadena3= (String) ventana.panelparadas.listLineaVuelta.getSelectedValue();
					modelo.modeloparadas.noescogermismaparada();
					System.out.println("contador"+Modelo.cont);
					if(Modelo.cont==1) {
						JOptionPane.showMessageDialog(null, "No puedes escojer las misma parada");
					}
					else {
					modelo.modeloparadas.codigofin(ventana.panelparadas.listLineaVuelta, ventana.panelparadas.modelo3, modelo.billete,modelo.billete2);
					ventana.panelparadas.btnContinuar.setEnabled(true);
					
					}
				}catch(NullPointerException e1){
					
				}
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
