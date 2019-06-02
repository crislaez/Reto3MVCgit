package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class GestorBd {
	
	private Connection connect;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
//------------------------------------------------------------------------------------------
//conectar
	public void gestorDB() {
		connect=null;
	}
//----------------------------------------------------------------------------------------------
//direccion
	public void conectar() {
		
		try {
			
			//connect=DriverManager.getConnection(InsertarHost() ,InsertarUsuario(), InsertarContrasena() );
			connect=DriverManager.getConnection(InsertarHost() ,InsertarUsuario(), "" );
			
			
		}catch(java.sql.SQLException sqle ) {
	        
			JOptionPane.showMessageDialog(null, "Error " + sqle);
			System.exit(1);

	    	
		}
		
	}
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casa final ordenado por precio
	public void verlineas(JList lista,DefaultListModel modelo) {
		boolean error=true; 
        String tipoDeProcedimiento = "{ call verlineas() }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el par�metro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el par�metro de
         
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            
            	  modelo.addElement("Codigo Linea:,"+resultSet.getString(1)+", Nombre: ,"+resultSet.getString(2)) ;
            	  error=false;
              }
              lista.setModel(modelo);  
	       
                     
            
        } catch (SQLException ex) {
            System.out.println("SQLException error" );
        }
        close();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------
//insertar host
	public static String InsertarHost() 
	{
		String texto="";
		 String host="";
		
		try 
		{
			BufferedReader bf = new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) //hace el ciclo mientras bfRead tiene datos
			{
				temp = temp + bfRead;// guardado el texto del archivo
			}
			texto = temp;
		}
		catch(Exception e) {
			System.err.println("no se encontro el archivo");
			
		}
				
		host = texto.split(";")[0];
			
		return host;
	}		
//------------------------------------------------------------------------------------------------------------------	
//Insertar usuario
	public static String InsertarUsuario() 
	{
		String texto="";
		String usuario="";
		
		try 
		{
			BufferedReader bf=new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) 
			{//hace el ciclo mientras bfRead tiene datos
				temp=temp + bfRead;// guardado el texto del archivo
			}
			texto=temp;
		}
		catch(Exception e)
		{
			System.err.println("no se encontro el archivo");		
		}
					
		usuario=texto.split(";")[1];
			
		return usuario;
	}
//------------------------------------------------------------------------------------------------------------------------
//Insertar contrase�a
	
	public static String InsertarContrasena() 
	{
		String texto="";
		String contrasena="";
		
		try 
		{
			BufferedReader bf=new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) 
			{
				temp=temp + bfRead;// guardado el texto del archivo
			}
			
			texto=temp;
		}
		catch(Exception e) 
		{
			System.err.println("no se encontro el archivo");
			
		}
					
		contrasena=texto.split(";")[2];
					
		return contrasena;
		}		
	//----------------------------------------------------------------------------------------
	public void close() {
	    try {
	        if (resultSet != null) {
	            resultSet.close();
	        }
	
	        if (statement != null) {
	            statement.close();
	        }
	
	        if (connect != null) {
	            connect.close();
	        }
	    } catch (Exception e) {
	
	    }
}

}
