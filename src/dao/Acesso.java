package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import negocio.ControleDeAcesso;

public class Acesso {

    public boolean acesso;

    public void Acesso(String Nome, String Senha) {

	Connection controleAcesso = null;
	Statement consulta = null;
	Statement consultaAdm = null;
	Statement consultaEmp = null;
	Statement consultaFun = null;
	ResultSet tabela = null;
	ResultSet administrador = null;
	ResultSet empresario = null;
	ResultSet funcionario = null;

	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    controleAcesso = DriverManager.getConnection("jdbc:mysql://localhost/uniformobile", "root", "101191");
	    consulta = (Statement) controleAcesso.createStatement();
	    consultaAdm = (Statement) controleAcesso.createStatement();
	    consultaEmp = (Statement) controleAcesso.createStatement();
	    consultaFun = (Statement) controleAcesso.createStatement();
	    tabela = consulta
		    .executeQuery("select Nome, Senha from usuario where Nome='" + Nome + "'and Senha='" + Senha + "'");
	    administrador = consultaAdm.executeQuery(
		    "select Nome, Perfil_Usuario_idPerfil_Usuario from usuario where Nome='" + Nome + "'and Perfil_Usuario_idPerfil_Usuario='1'");
	    empresario = consultaEmp.executeQuery(
		    "select Nome, Perfil_Usuario_idPerfil_Usuario from usuario where Nome='" + Nome + "'and Perfil_Usuario_idPerfil_Usuario='2'");
	    funcionario = consultaFun.executeQuery(
		    "select Nome, Perfil_Usuario_idPerfil_Usuario from usuario where Nome='" + Nome + "'and Perfil_Usuario_idPerfil_Usuario='3'");

	    if (tabela.next()) {
		JOptionPane.showMessageDialog(null, "Acesso autorizado");
		acesso = true;
	    } else {
		JOptionPane.showMessageDialog(null, "Usuário e Senha inválido");
		acesso = false;
	    }

	    if (administrador.next()) {
		ControleDeAcesso.setNivel(1);
	    }
	    if (empresario.next()) {
		ControleDeAcesso.setNivel(2);
	    }
	    if (funcionario.next()) {
		ControleDeAcesso.setNivel(3);
	    }

	} catch (ClassNotFoundException | SQLException e) {
	    JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados, tente novamente");
	    acesso = false;
	}

    }

}