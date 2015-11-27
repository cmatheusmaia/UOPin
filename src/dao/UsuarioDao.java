package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import sistema.bean.UsuarioBean;

public class UsuarioDao {

    public boolean acesso;

    public UsuarioDao(UsuarioBean user) {
	inserir(user.getNome(), user.getSenha(), user.getPerfil_Usuario_idPerfil_Usuario(), user.getDt_nascimento(),
		user.getPerfil_Usuario_idPerfil_Usuario(), user.getNomeCompleto());
    }

    public UsuarioDao() {
	// TODO Auto-generated constructor stub
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

    public void buscarDados(String nomeUsuario, UsuarioBean usuarioBean) {
	ConexaoBanco uniformobile = new ConexaoBanco();

	try {
	    // BUSCAR DADOS
	    Connection ExConn = (Connection) uniformobile.getConnection();
	    Statement stmt = (Statement) ExConn.createStatement();
	    String sSQL = "SELECT * FROM `uniformobile`.`usuario` WHERE `Nome` = '" + nomeUsuario +"'";
	    ResultSet rs = stmt.executeQuery(sSQL);

	    while (rs.next()) {
		usuarioBean.setIdUsuario(rs.getInt("idUsuario"));
		usuarioBean.setNome(rs.getString("Nome"));
		usuarioBean.setSenha(rs.getString("Senha"));
		usuarioBean.setPerfil_Usuario_idPerfil_Usuario(rs.getInt("Perfil_Usuario_idPerfil_Usuario"));
		usuarioBean.setDt_nascimento(rs.getString("Dt_nascimento"));
		usuarioBean.setSexo_idSexo(rs.getInt("Sexo_idSexo"));
		usuarioBean.setNomeCompleto(rs.getString("Nome_completo"));
	    }
	    stmt.close();
	    uniformobile.fecharBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Os dados não puderam ser encontrado!!!");
	}

    }

    public void atualizarDados(UsuarioBean usuarioBean) {
	ConexaoBanco uniformobile = new ConexaoBanco();
	int res;
	try {
	    Connection ExConn = (Connection) uniformobile.getConnection();
	    Statement stmt = (Statement) ExConn.createStatement();

	    res = stmt.executeUpdate("UPDATE `uniformobile`.`usuario` SET `Nome`='" + usuarioBean.getNome() + "', "
		    + "`Perfil_Usuario_idPerfil_Usuario`='" + usuarioBean.getPerfil_Usuario_idPerfil_Usuario()
		    + "', `Senha`='" + usuarioBean.getSenha() + "', " + "`Dt_nascimento`='"
		    + usuarioBean.getDt_nascimento() + "', `Sexo_idSexo`='" + usuarioBean.getSexo_idSexo() + "',"
		    + " `Nome_completo`='" + usuarioBean.getNomeCompleto() 
		    + "' WHERE `idUsuario`='"+ usuarioBean.getIdUsuario() + "'");
	    if (res == 1)
		JOptionPane.showMessageDialog(null, "Os dados  foram atualizados com sucesso!!!");
	    stmt.close();
	    uniformobile.fecharBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Os dados não puderam ser atualizados!!!");
	}

    }

}
