package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class acesso {

	public boolean acesso;
	
	public void Acesso(String login, String senha){
		
		Connection controleAcesso = null;
		Statement consulta = null;
		ResultSet tabela = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			controleAcesso = DriverManager.getConnection("jdbc:mysql://localhost/uniformobile","root","101191");
			consulta = (Statement) controleAcesso.createStatement();
			tabela = consulta.executeQuery("select login, senha from usuario where login='"+login+"'and senha='"+senha+"'");
			
			if (tabela.next()){
				JOptionPane.showMessageDialog(null, "Acesso autorizado");
				acesso=true;
			}else{
				JOptionPane.showMessageDialog(null, "Usu�rio e senha inv�lido");
				acesso=false;
			}
		}catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null, "N�o foi poss�vel conectar ao banco de dados, tente novamente");
			acesso=false;
		}
		
	}

}