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
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
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
//Buscar Liena
	public void verlineas(JList lista,DefaultListModel modelo) {
		boolean error=true; 
        String tipoDeProcedimiento = "{ call verlineas() }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
         
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
//------------------------------------------------------------------------------------
//rellenar parada
	public void verparadas(String Cod_Linea,JList listaIda,DefaultListModel modelo2,JList listaVuelta,DefaultListModel modelo3) {
		
        String tipoDeProcedimiento = "{ call vercodigoparada(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
     
              miSentencia.setString(1, Cod_Linea);
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            	
            	  
            	  modelo2.addElement("Codigo Parada:,"+resultSet.getInt(1)+", Nombre: ,"+resultSet.getString(2)+", Calle: ,"+resultSet.getString(3)+", Latitud: ,"+resultSet.getFloat(4)+", Longitud: ,"+resultSet.getFloat(5)+",");
                  modelo3.addElement("Codigo Parada:,"+resultSet.getInt(1)+", Nombre: ,"+resultSet.getString(2)+", Calle: ,"+resultSet.getString(3)+", Latitud: ,"+resultSet.getFloat(4)+", Longitud: ,"+resultSet.getFloat(5)+",");
              }
            
             listaIda.setModel(modelo2);
             listaVuelta.setModel(modelo3);
            
        } catch (SQLException ex) {
            System.out.println("SQLException error" );
        }
        close();
    }
//------------------------------------------------------------------------------------
//rellenar buses
	public void verbuses(String Cod_Linea,JList listabuses,DefaultListModel modelo4) {
		
        String tipoDeProcedimiento = "{ call verbus(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
     
              miSentencia.setString(1, Cod_Linea);
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            	
            	  
            	  modelo4.addElement("Codigo Bus:,"+resultSet.getInt(1)+", Numero de Plazas: ,"+resultSet.getInt(2)+", Consumo: ,"+resultSet.getFloat(3)+", Color: ,"+resultSet.getString(4)+",");
                 
              }
            
              listabuses.setModel(modelo4);
            
            
        } catch (SQLException ex) {
            System.out.println("SQLException error" );
        }
        close();
    }
//------------------------------------------------------------------------------------
//Comprobar que el DNI y la contrasena que se pasa por parametros coinciden con el de la BBDD, numero de filas es 1
	public int comprovardnicontraseña(String dni, String contrasena) throws Exception {
		int resultado=0;
		
		
		conectar();
		String sql = "select * FROM cliente WHERE dni='"+dni+"' AND contraseña='"+contrasena+"'";
		try 
		{
	    	
	    	statement = connect.createStatement();
	   
	        resultSet = statement.executeQuery(sql);
	                
	        if(resultSet.next()) 
		    {
	        	resultado=1;
	        	System.out.println(resultado);
		    }
		      
		} 
	    catch (SQLException e) 
	    {
		    e.printStackTrace();
	
		   
		} 
		 close();
	    return resultado;
	 
	}	
//------------------------------------------------------------------------------------------------------------	
//insertat cliente
		public int insertarCliente(String dni,String nombre,String apellido,String fecha, String sexo, String contrasena) throws Exception 
		{ int prueba=0;
		    try 
		    {
		    	conectar();
		        // Statements allow to issue SQL queries to the database
		        statement = connect.createStatement();
		
		        // PreparedStatements can use variables and are more efficient
		        preparedStatement = connect
		                .prepareStatement("insert into cliente(DNI,Nombre,Apellidos,Fecha_nac,Sexo,Contraseña) "
		                		+ "values (\""+dni+"\",\""+nombre+"\",\""+apellido+"\",\""+fecha+"\",\""+sexo+"\",\""+contrasena+"\")");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	System.out.println("SQLException corregido");
		    	JOptionPane.showMessageDialog(null, "Error al ingresar, el Usuario ya existe");
		    	prueba=1;	    	
		    } 
		    close();
		return prueba;
		}
//------------------------------------------------------------------------------------------------------------	
//insertat billete
		public void insertarBillete(int Cod_Billete,int NTrayecto,String Cod_Linea,int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin,String Fecha,String Hora,String DNI,float Precio) throws Exception 
		{ 
		
			conectar();
		    try 
		    {
		    	
		        // Statements allow to issue SQL queries to the database
		        statement = connect.createStatement();
		
		        // PreparedStatements can use variables and are more efficient
		        preparedStatement = connect
		                .prepareStatement("insert into billete(Cod_Billete,NTrayecto,Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,Fecha,Hora,DNI,Precio) "
		                		+ "values (\""+Cod_Billete+"\",\""+NTrayecto+"\",\""+Cod_Linea+"\",\""+Cod_Bus+"\",\""+Cod_Parada_Inicio+"\",\""+Cod_Parada_Fin+"\",\""+Fecha+"\",\""+Hora+"\",\""+DNI+"\",\""+Precio+"\")");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    	//System.out.println("SQLException corregido");
		    	  	
		    } 
		    close();
		
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------
		public int consegircodigobillete() {
			
			int aux=0;
			conectar();
			try
			{
				statement = connect.createStatement();
				resultSet = statement.executeQuery("select Cod_Billete from billete order by Cod_Billete desc limit 1");
				while (resultSet.next())
				{
					aux = resultSet.getInt("Cod_Billete");
				}
			}
			catch(SQLException e)
			{
				System.out.println("SQLException corregido");
			};
			
			close();
			return aux+1;
		}
//--------------------------------------------------------------------------------------------------------------------------------			
//borrar billete
	public int borrarBillete(int Cod_Billete,String dni) throws Exception
	{ int prueba=0;
	conectar();
		try
		{
			statement = connect.createStatement();
			prueba=statement.executeUpdate("delete from billete where Cod_Billete = '"+Cod_Billete+"' and DNI = '"+dni+"'");
			
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			prueba=1;
		}
		System.out.println("problema: "+prueba);
		 close();
		return prueba;
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
//Insertar contraseña
	
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
