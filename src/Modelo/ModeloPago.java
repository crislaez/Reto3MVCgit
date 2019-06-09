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
	//double total_faltante;
	double total_devolucion=0;
	public ModeloPago(GestorBd gestor) {
		
		this.gestor=gestor;
		
		
	}
	
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn200(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent){
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		
		valorBoton = Double.parseDouble(Billete00.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
		
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn100(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(billete100.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
			
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(billete50.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido -billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(Billete0.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(billete10.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(billete5.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2e(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda2e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1e(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda1e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda50cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda20cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda10cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda5cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda2cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param billete
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param Billete00
	 * @param billete100
	 * @param billete50
	 * @param Billete0
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1cent(Billete billete,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton Billete00,JButton billete100,JButton billete50,JButton Billete0,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		double billetedoble=0;
		if(Modelo.aux2==1) {
			billetedoble=billete.getPrecio()*2;
		}
		else {
			billetedoble=billete.getPrecio();
		}
		valorBoton = Double.parseDouble(moneda1cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo.total_faltante = Modelo.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			Billete00.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			Billete0.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
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
			total_devolucion = total_introducido - billete.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	
	
}
