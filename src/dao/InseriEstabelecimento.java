package dao;

import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

import sistema.bean.EstabelecimentoBean;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

public class InseriEstabelecimento {

    public static String InsereDados(String nome, String cnpj, String telefone, String ramodeatividade,
	    String endereconocampus, String proprietario, String horariodefuncionamento) {
	ConexaoBanco banco = new ConexaoBanco();
	String retorno = "erro";
	try {
	    // INSERIR OS DADOS
	    // Connection ExConn = (Connection) banco.abrirBDConn();
	    Statement stmt = (Statement) ConexaoBanco.createStatement();
	    String sSQL = "INSERT INTO banco.estabelecimento VALUES ('" + nome + "','" + cnpj + "','" + telefone + "','"
		    + ramodeatividade + "','" + endereconocampus + "','" + proprietario + "','" + horariodefuncionamento
		    + "');";
	    boolean res = stmt.execute(sSQL);

	    JOptionPane.showMessageDialog(null,
		    (!res) ? "Dados Inseridos com Sucesso!!!" : "" + "Dados incorretos. Não foram inseridos!!!!");
	    stmt.close();
	    banco.abrirBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Dados incorretos. Não foram inseridos!!!!");
	}
	return retorno;

    }

    public static void ExcluirEstabelecimento(int codigo) {
	ConexaoBanco banco = new ConexaoBanco();

	try {
	    // EXCLUIR DADOS
	    // Connection conexaoBanco = (Connection) banco.abrirBDConn();
	    Statement stmt = (Statement) ConexaoBanco.createStatement();
	    String sSQL = "DELETE FROM banco.estalecimento WHERE idEstabelecimento = " + codigo + ";";
	    boolean rs = stmt.execute(sSQL);
	    JOptionPane.showMessageDialog(null, (!rs) ? "Dados do estabelecimento excluidos com sucesso."
		    : "Dados do estabelecimento não foram excluidos com sucesso.");

	    stmt.close();
	    banco.fecharBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Os dados não foram encontrados!!!");
	}
    }

    public String AtualizarDados(String nome, String cnpj, String telefone, String ramodeatividade,
	    String endereconocampus, String proprietario, String horariodefuncionamento, EstabelecimentoBean EstBin) {
	ConexaoBanco banco = new ConexaoBanco();
	String retorno = "erro";
	int res;
	try {
	    // ATUALIZAR DADOS
	    // Connection ExConn = (Connection) banco.abrirBDConn();
	    Statement stmt = (Statement) ConexaoBanco.createStatement();

	    // String codigo;
	    res = stmt.executeUpdate("UPDATE banco.Estabelecimento SET nome = '" + nome + "', cnpj = '" + cnpj
		    + "',telefone = '" + telefone + "',ramodeatividade = '" + ramodeatividade
		    + "', endereconocampus = '" + endereconocampus + "',proprietario = '" + proprietario
		    + "' WHERE idEstabelecimento = " + EstBin.getCodigo());
	    if (res == 1)
		JOptionPane.showMessageDialog(null, "Os dados  foram atualizados com sucesso!!!");
	    stmt.close();
	    banco.fecharBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Os dados não puderam ser atualizados!!!");
	}
	return retorno;
    }

    public static int BuscarDados(int codigo, EstabelecimentoBean EstBin) {
	ConexaoBanco banco = new ConexaoBanco();

	try {
	    // BUSCAR DADOS
	    // Connection ExConn = (Connection) banco.abrirBDConn();
	    Statement stmt = (Statement) ConexaoBanco.createStatement();
	    String sSQL = "SELECT * FROM banco.Estabelecimento WHERE idEstabelecimento = " + codigo;
	    ResultSet rs = stmt.executeQuery(sSQL);

	    while (rs.next()) {
		EstBin.setCodigo(rs.getInt("idEstabelecimento"));
		EstBin.setNome(rs.getString("nome"));
		EstBin.setCnpj(rs.getString("cnpj"));
		EstBin.setTelefone(rs.getString("telefone"));
		EstBin.setRamodeatividade(rs.getString("ramodeatividade"));
		EstBin.setEndereconocampus(rs.getString("endereconocampus"));
		EstBin.setProprietario(rs.getString("proprietario"));
		EstBin.setHorariodefuncionamento(rs.getString("horariodefuncionamento"));
	    }
	    stmt.close();
	    banco.fecharBDConn();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Os dados não puderam ser encontrado!!!");
	}
	return codigo;

    }

}
