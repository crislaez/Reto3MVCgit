package Modelo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

public class ModeloParadas {

	String dia_ida,mes_ida,ano_ida,fechainicio,hora,minutos,horas;
	public GestorBd gestor;
	
	public ModeloParadas(GestorBd gestor) {
		
		this.gestor=gestor;
		
		
	}
	
	/**
	 * 
	 * @param dateida
	 * @param datevuelta
	 */
	public void limitar(JDateChooser dateida, JDateChooser datevuelta) {
		dateida.setMinSelectableDate(Date.valueOf(LocalDate.now()));
		datevuelta.setMinSelectableDate(Date.valueOf(LocalDate.now().plusDays(1)));
	}
	
	/**
	 * 
	 * @param dateida
	 * @param datevuelta
	 */
	public void fechaida(JDateChooser dateida, JDateChooser datevuelta) {
		try {
			
			int dia=datevuelta.getCalendar().get(Calendar.DAY_OF_MONTH);
			int mes =datevuelta.getCalendar().get(Calendar.MONTH)+1;
			int año=datevuelta.getCalendar().get(Calendar.YEAR);
			LocalDate fechaentrada = LocalDate.of(año, mes, dia);
			dateida.setMaxSelectableDate(Date.valueOf(fechaentrada.minusDays(1)));
		}catch(NullPointerException e) {
			System.out.print("NullPointerException variable vacia");
			e.getMessage();
		}
	}
	
	/**
	 * 
	 * @param dateida
	 * @param datevuelta
	 */
	public void fechavuelta(JDateChooser dateida, JDateChooser datevuelta) {
		try {
			
			int dia=dateida.getCalendar().get(Calendar.DAY_OF_MONTH);
			int mes =dateida.getCalendar().get(Calendar.MONTH)+1;
			int año=dateida.getCalendar().get(Calendar.YEAR);
			LocalDate fechasalida = LocalDate.of(año, mes, dia);
			datevuelta.setMinSelectableDate(Date.valueOf(fechasalida.plusDays(1)));
			
		}catch(NullPointerException e) {
			System.out.print("NullPointerException variable vacia");
			e.getMessage();
		}
	}
	/**
	 * 
	 * @param dateFechaIda
	 * @param billete
	 */
	public void fechas(JDateChooser dateFechaIda,Billete billete) {

		try {
		dia_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.DAY_OF_MONTH)); 
		mes_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.MONTH) + 1);
		ano_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.YEAR));
		hora = Integer.toString(dateFechaIda.getCalendar().get(Calendar.HOUR_OF_DAY));
		minutos = Integer.toString(dateFechaIda.getCalendar().get(Calendar.MINUTE));
		
		fechainicio=(ano_ida + "/" + mes_ida + "/" + dia_ida); 
		horas=(hora+":"+minutos);
		
		billete.setFecha(fechainicio);
		billete.setHora(horas);
	   
	    System.out.println("Fecha billete1: "+billete.getFecha());
	    System.out.println("hora billete1: "+billete.getHora());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException corregido");
		}
	    
	}
	/**
	 * 
	 * @param dateFechavuelte
	 * @param billete2
	 */
	public void fechasvueltas(JDateChooser dateFechavuelte,Billete billete2) {

		try {
		dia_ida = Integer.toString(dateFechavuelte.getCalendar().get(Calendar.DAY_OF_MONTH)); 
		mes_ida = Integer.toString(dateFechavuelte.getCalendar().get(Calendar.MONTH) + 1);
		ano_ida = Integer.toString(dateFechavuelte.getCalendar().get(Calendar.YEAR));
		hora = Integer.toString(dateFechavuelte.getCalendar().get(Calendar.HOUR_OF_DAY));
		minutos = Integer.toString(dateFechavuelte.getCalendar().get(Calendar.MINUTE));
		
		fechainicio=(ano_ida + "/" + mes_ida + "/" + dia_ida); 
		horas=(hora+":"+minutos);
		
		billete2.setFecha(fechainicio);
		billete2.setHora(horas);
	   
	    System.out.println("Fecha billete2: "+billete2.getFecha());
	    System.out.println("hora billete2: "+billete2.getHora());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException corregido");
		}
	}
	/**
	 * 
	 * @param listaIda
	 * @param modelo2
	 * @param billete
	 * @param billete2
	 */
	public void codigoinicio(JList listaIda,DefaultListModel modelo2,Billete billete,Billete billete2) {
		
		Modelo.codigoparadaida=Modelo.cadena2.split(",")[1];
		Modelo.cida=Integer.parseInt(Modelo.codigoparadaida);
		Modelo.codigoparadaida=Modelo.cadena2.split(",")[7];
		Modelo.lat1=Float.parseFloat(Modelo.codigoparadaida);
		Modelo.codigoparadaida=Modelo.cadena2.split(",")[9];
		Modelo.lon1=Float.parseFloat(Modelo.codigoparadaida);
		billete.setCod_Parada_Inicio(Modelo.cida);
		billete2.setCod_Parada_Fin(Modelo.cida);
		System.out.println("codigo parada inicio Billete1: "+billete.getCod_Parada_Inicio());
		System.out.println("codigo parada fin Billete2: "+billete2.getCod_Parada_Fin());
		System.out.println("Latitud 1: "+Modelo.lat1);
		System.out.println("longitud 1: "+Modelo.lon1);
		modelo2.clear();
	}
	/**
	 * 
	 * @param listaVuelta
	 * @param modelo3
	 * @param billete
	 * @param billete2
	 */
	public void codigofin(JList listaVuelta,DefaultListModel modelo3,Billete billete,Billete billete2) {
		Modelo.codigoparadavuelta=Modelo.cadena3.split(",")[1];
		Modelo.cvuelta=Integer.parseInt(Modelo.codigoparadavuelta);
		Modelo.codigoparadavuelta=Modelo.cadena3.split(",")[7];
		Modelo.lat2=Float.parseFloat(Modelo.codigoparadavuelta);
		Modelo.codigoparadavuelta=Modelo.cadena3.split(",")[9];
		Modelo.lon2=Float.parseFloat(Modelo.codigoparadavuelta);
		billete.setCod_Parada_Fin(Modelo.cvuelta);
		billete2.setCod_Parada_Inicio(Modelo.cvuelta);
		System.out.println("codigo parada fin Billete1: "+billete.getCod_Parada_Fin());
		System.out.println("codigo parada inicio Billete2: "+billete2.getCod_Parada_Inicio());
		System.out.println("Latitud 2: "+Modelo.lat2);
		System.out.println("longitud 2: "+Modelo.lon2);
		modelo3.clear();
	}
	/**
	 * 
	 */
	public void noescogermismaparada() {
		System.out.println("vuelta en metodos: "+Modelo.dos);
		System.out.println("ida en metodos: "+Modelo.uno);
		if(Modelo.dos==Modelo.uno) {
			Modelo.cont=1;
		}
		else {
			Modelo.cont=0;
		}
	}
	/**
	 * 
	 * @param panelparadas
	 * @param panelbuses
	 * @param dateFechaIda
	 * @param dateFechavuelta
	 */
	public void continuar(JPanel panelparadas, JPanel panelbuses,JDateChooser dateFechaIda,JDateChooser dateFechavuelta,JList listabuses,DefaultListModel modelo4) {
	
		 if(dateFechaIda.getDate() == null) {
			JOptionPane.showMessageDialog(null, "Escoja fecha Ida");
			
			} 
		 else if(Modelo.aux2==1) {
				if(dateFechavuelta.getDate() == null) {
					JOptionPane.showMessageDialog(null, "Escoja fecha Vuelta");
				
				}
				else {
					gestor.verbuses(Modelo.codigo, listabuses, modelo4);
					panelparadas.setVisible(false);
					panelbuses.setVisible(true);
				}
		 }
		 else {
			 gestor.verbuses(Modelo.codigo, listabuses, modelo4);
			 panelparadas.setVisible(false);
			panelbuses.setVisible(true);
		 }
	}
//---------------------------------------------------	
}

