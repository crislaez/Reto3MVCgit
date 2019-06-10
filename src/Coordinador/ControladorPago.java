package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Ventana;



public class ControladorPago implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana ventana;
	private Modelo modelo;
	
	public ControladorPago(Ventana ventana,Modelo modelo) {
		this.ventana=ventana;
		this.modelo=modelo;
		
		ventana.panelpago.btnPrecioAtras.addActionListener(this);
		ventana.panelpago.btnPrecioContinuar.addActionListener(this);
		ventana.panelpago.billete200.addActionListener(this);
		ventana.panelpago.billete100.addActionListener(this);
		ventana.panelpago.billete50.addActionListener(this);
		ventana.panelpago.billete20.addActionListener(this);
		ventana.panelpago.billete10.addActionListener(this);
		ventana.panelpago.billete5.addActionListener(this);
		ventana.panelpago.moneda2e.addActionListener(this);
		ventana.panelpago.moneda1e.addActionListener(this);
		ventana.panelpago.moneda50cent.addActionListener(this);
		ventana.panelpago.moneda20cent.addActionListener(this);
		ventana.panelpago.moneda10cent.addActionListener(this);
		ventana.panelpago.moneda5cent.addActionListener(this);
		ventana.panelpago.moneda2cent.addActionListener(this);
		ventana.panelpago.moneda1cent.addActionListener(this);
		
	}
	public void resetear() {
		ventana.panelpago.btnPrecioContinuar.setEnabled(false);
		ventana.panelpago.DineroFaltante.setText("");
		ventana.panelpago.DineroIntroducido.setText("");
		ventana.panelpago.Vueltas.setText("");
		ventana.panelpago.billete200.setEnabled(true);
		ventana.panelpago.billete100.setEnabled(true);
		ventana.panelpago.billete50.setEnabled(true);
		ventana.panelpago.billete20.setEnabled(true);
		ventana.panelpago.billete10.setEnabled(true);
		ventana.panelpago.billete5.setEnabled(true);
		ventana.panelpago.moneda2e.setEnabled(true);
		ventana.panelpago.moneda1e.setEnabled(true);
		ventana.panelpago.moneda50cent.setEnabled(true);
		ventana.panelpago.moneda20cent.setEnabled(true);
		ventana.panelpago.moneda10cent.setEnabled(true);
		ventana.panelpago.moneda5cent.setEnabled(true);
		ventana.panelpago.moneda2cent.setEnabled(true);
		ventana.panelpago.moneda1cent.setEnabled(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana.panelpago.btnPrecioAtras) {
			funciones.cambiarDePanel(ventana.panelpago, ventana.panelmenuopcion);
			Modelo.aux2=0;
			resetear();
		}
		if (arg0.getSource()==ventana.panelpago.btnPrecioContinuar) {
			modelo.modelopago.continuar(modelo.billete, modelo.billete2);
			resetear();
		}
		if (arg0.getSource()==ventana.panelpago.billete200) {
			modelo.modelopago.btn200(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.billete100) {
			modelo.modelopago.btn100(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.billete50) {
			modelo.modelopago.btn50(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.billete20) {
			modelo.modelopago.btn20(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.billete10) {
			modelo.modelopago.btn10(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.billete5) {
			modelo.modelopago.btn5(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda2e) {
			modelo.modelopago.btn2e(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda1e) {
			modelo.modelopago.btn1e(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda50cent) {
			modelo.modelopago.btn50cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda20cent) {
			modelo.modelopago.btn20cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda10cent) {
			modelo.modelopago.btn10cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda5cent) {
			modelo.modelopago.btn5cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda2cent) {
			modelo.modelopago.btn2cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana.panelpago.moneda1cent) {
			modelo.modelopago.btn1cent(modelo.precios, ventana.panelpago.DineroFaltante, ventana.panelpago.DineroIntroducido, ventana.panelpago.Vueltas, ventana.panelpago.btnPrecioContinuar, ventana.panelpago.billete200, ventana.panelpago.billete100, ventana.panelpago.billete50, ventana.panelpago.billete20, ventana.panelpago.billete10, ventana.panelpago.billete5, ventana.panelpago.moneda2e, ventana.panelpago.moneda1e, ventana.panelpago.moneda50cent, ventana.panelpago.moneda20cent, ventana.panelpago.moneda10cent, ventana.panelpago.moneda5cent, ventana.panelpago.moneda2cent, ventana.panelpago.moneda1cent);
		}
		
	}
}
