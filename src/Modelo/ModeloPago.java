package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


import Coordinador.FuncionesControlador;

public class ModeloPago {

	public GestorBd gestor;
	double valorBoton=0;
	double total_introducido=0;
	double total_devolucion=0;
	
	public ModeloPago(GestorBd gestor) {
		
		this.gestor=gestor;
		
		
	}
	/**
	 * 
	 * @param billete
	 * @param billete2
	 */
	public void continuar(Billete billete, Billete billete2) {
		
		
		try {
			gestor.insertarBillete(billete.getCod_Billete(), billete.getNTrayecto(), billete.getCod_Linea(), billete.getCod_Bus(), billete.getCod_Parada_Inicio(), billete.getCod_Parada_Fin(), billete.getFecha(), billete.getHora(), billete.getDNI(), billete.getPrecio());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception corregido");
		}
		
		if(Modelo.aux2==1) {
			try {
				gestor.insertarBillete(billete2.getCod_Billete(), billete2.getNTrayecto(), billete2.getCod_Linea(), billete2.getCod_Bus(), billete2.getCod_Parada_Inicio(), billete2.getCod_Parada_Fin(), billete2.getFecha(), billete2.getHora(), billete2.getDNI(), billete2.getPrecio());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Pago.setVisible(false);
		//ticket.setVisible(true);
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn200(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent){
	
		
		valorBoton = Double.parseDouble(Precio00.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
		
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn100(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(Precio100.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
			
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(Precio50.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido -Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(Precio0.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(Precio10.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(Precio5.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2e(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda2e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1e(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda1e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda50cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
	
		valorBoton = Double.parseDouble(moneda20cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda10cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda5cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda2cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param Precio
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Precio00
	 * @param Precio100
	 * @param Precio50
	 * @param Precio0
	 * @param Precio10
	 * @param Precio5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1cent(Precio Precio,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Precio00,JButton Precio100,JButton Precio50,JButton Precio0,JButton Precio10,JButton Precio5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		
		valorBoton = Double.parseDouble(moneda1cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Precio00.setEnabled(false);
			Precio100.setEnabled(false);
			Precio50.setEnabled(false);
			Precio0.setEnabled(false);
			Precio10.setEnabled(false);
			Precio5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo.total_faltante)
		{
			total_devolucion = total_introducido - Precio.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	
	
}
