package mig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnexionBDD
{
	 Connection con=null;
	 Statement state;
	
	String connexionState = "Connexion établie!";
	
	public ConnexionBDD(String url, String db, String login, String password)
	{
		try { 
			String driverName=null;
			
			if(url=="jdbc:mysql://localhost:3306")
				Class.forName("com.mysql.jdbc.Driver");
			if(url=="jdbc:postgresql://localhost:5432")
				Class.forName("com.postgresql.jdbc.Driver");//Insere le nom du driver
			

	      con = DriverManager.getConnection(url+"/"+db, login, password);  

	      state = con.createStatement();
	         
	    } catch (Exception e) {
	      connexionState = e.getMessage();
	    }    

	}
	
	
	
	public static void main(String[] args)
	{
		IHM fenetre = new IHM();
	}

}
