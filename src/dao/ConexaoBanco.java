package dao;
import java.sql.*;

import com.mysql.jdbc.Statement;


public class ConexaoBanco {
	
	public Connection getConnection(){
		Connection connection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/uniformobile", "root", "101191");
		} catch (Exception e){
			connection = null;
		}
		return connection;
	}

	public void abrirBDConn() {
		// TODO Auto-generated method stub
		
	}

	public static Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void fecharBDConn() {
		// TODO Auto-generated method stub
	}

}
