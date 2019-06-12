package Modelo;

import java.io.FileOutputStream;
import java.io.IOException;
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
	public void continuar(Billete billete, Billete billete2,JTextPane textReserva) {
		String frase= ("Codigo del Billete"+billete.getCod_Billete()+"\r\n"
				+"Numero de Trayectos: "+billete.getNTrayecto()+ "\r\n"
						+"Codigo de la Linea: " + billete.getCod_Linea() + "\r\n" 
				+ "Codigo del Bus: " + billete.getCod_Bus()+ "\r\n" 
						+ "Codigo Parada Inicio: " + billete.getCod_Parada_Inicio()+ "\r\n"
				+"Codigo Parada Fin: " + billete.getCod_Parada_Fin()+ "\r\n"
						+"Fecha: " + billete.getFecha()+ "\r\n"+"Hora: " + billete.getHora()+ "\r\n"
				+"DNI: " + billete.getDNI()+ "\r\n"
						+"Precio: " + billete.getPrecio()+ "\r\n");
		
		try {
			gestor.insertarBillete(billete.getCod_Billete(), billete.getNTrayecto(), billete.getCod_Linea(), billete.getCod_Bus(), billete.getCod_Parada_Inicio(), billete.getCod_Parada_Fin(), billete.getFecha(), billete.getHora(), billete.getDNI(), billete.getPrecio());
			EscribiroCrearFichearo(billete.getCod_Billete(), billete.getNTrayecto(), billete.getCod_Linea(), billete.getCod_Bus(), billete.getCod_Parada_Inicio(), billete.getCod_Parada_Fin(), billete.getFecha(), billete.getHora(), billete.getDNI(), billete.getPrecio());
			textReserva.getStyledDocument().insertString(textReserva.getStyledDocument().getLength(),frase, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception corregido");
		}
		
		if(Modelo.aux2==1) {
			try {
				gestor.insertarBillete(billete2.getCod_Billete(), billete2.getNTrayecto(), billete2.getCod_Linea(), billete2.getCod_Bus(), billete2.getCod_Parada_Inicio(), billete2.getCod_Parada_Fin(), billete2.getFecha(), billete2.getHora(), billete2.getDNI(), billete2.getPrecio());
				EscribiroCrearFichearo(billete.getCod_Billete(), billete.getNTrayecto(), billete.getCod_Linea(), billete.getCod_Bus(), billete.getCod_Parada_Inicio(), billete.getCod_Parada_Fin(), billete.getFecha(), billete.getHora(), billete.getDNI(), billete.getPrecio());
				textReserva.getStyledDocument().insertString(textReserva.getStyledDocument().getLength(),frase, null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception corregido");
			}
		}
		
	}
	/**
	 * 
	 * @param Cod_Billete
	 * @param NTrayecto
	 * @param Cod_Linea
	 * @param Cod_Bus
	 * @param Cod_Parada_Inicio
	 * @param Cod_Parada_Fin
	 * @param Fecha
	 * @param Hora
	 * @param DNI
	 * @param Precio
	 */
	public void EscribiroCrearFichearo(int Cod_Billete,int NTrayecto,String Cod_Linea,int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin,String Fecha,String Hora,String DNI,float Precio)  {

		String frase= ("Codigo del Billete"+Cod_Billete+"\r\n"
		+"Numero de Trayectos: "+NTrayecto+ "\r\n"
				+"Codigo de la Linea: " + Cod_Linea + "\r\n" 
		+ "Codigo del Bus: " + Cod_Bus+ "\r\n" 
				+ "Codigo Parada Inicio: " + Cod_Parada_Inicio+ "\r\n"
		+"Codigo Parada Fin: " + Cod_Parada_Fin+ "\r\n"
				+"Fecha: " + Fecha+ "\r\n"+"Hora: " + Hora+ "\r\n"
		+"DNI: " + DNI+ "\r\n"
				+"Precio: " + Precio+ "\r\n");
		
		char c=0;
		try {

			FileOutputStream f= new FileOutputStream("Cosas/reserva.txt");  //---> En un directorio concreto
			
			//*** pasar los caracteres al flujo
			for(int i =0; i<frase.length(); i++) {
				c=frase.charAt(i);
				f.write(c);
			}
			//*** cerrra el flujo de salida
			f.close();
			
		}catch (IOException e) {
			System.out.println("error  "+e.getMessage());
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
