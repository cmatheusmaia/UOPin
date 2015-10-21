package dao;
import java.sql.*;
public class conexaoBanco {
	
	public static Connection getConnection(){
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

}
