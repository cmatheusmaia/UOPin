package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

import sistema.bean.UsuarioBean;

public class InserirUsuario {

    public boolean acesso;

    public InserirUsuario(UsuarioBean user){
	inserir(user.getNome(), user.getSenha(), user.getPerfil_Usuario_idPerfil_Usuario(), user.getDt_nascimento(), user.getPerfil_Usuario_idPerfil_Usuario(), user.getNomeCompleto());
    }
    
    public void inserir(String nome, String senha, int perfil, String dt_nasc, int sexo, String nomeComp) {

	Connection controleAcesso = null;
	Statement consulta = null;

	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    controleAcesso = DriverManager.getConnection("jdbc:mysql://localhost/uniformobile", "root", "101191");
	    consulta = (Statement) controleAcesso.createStatement();
	    String sSQL = "INSERT INTO `uniformobile`.`usuario` (`Nome`, `Senha`, `Perfil_Usuario_idPerfil_Usuario`, `Dt_nascimento`, `Sexo_idSexo`, `Nome_completo`)"
		    + " VALUES ('" + nome + "','" + senha + "','" + perfil + "','" + dt_nasc + "','" + sexo + "','"
		    + nomeComp + "');";
	    boolean res = consulta.execute(sSQL);
	    JOptionPane.showMessageDialog(null,
		    (!res) ? "Dados Inseridos com Sucesso!!!" : "" + "Dados incorretos. Não foram inseridos!!!!");
	    consulta.close();

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Dados incorretos. Não foram inseridos!!!!");
	}

    }

}
