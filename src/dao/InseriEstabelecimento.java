package dao;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import sistema.bean.EstabelecimentoBean;

public class InseriEstabelecimento {
	
	public static void InsereDados(String nome,String cnpj,String telefone,String ramodeatividade,String endereconocampus,String proprietario,String horariodefuncionamento){
		ConexaoBanco uniformobile = new ConexaoBanco();
		try {
			Connection ExConn = (Connection)uniformobile.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
			String sSQL = "INSERT INTO uniformobile.estabelecimento VALUES ('"+nome+"','"+cnpj+"','"+telefone+"','"+ramodeatividade+"','"+endereconocampus+"','"+proprietario+"','"+horariodefuncionamento+"');";
			System.out.println(sSQL);
			boolean res = stmt.execute(sSQL);
			
			JOptionPane.showMessageDialog(null,(!res)?"Dados Inseridos com Sucesso!!!":"" +
					"Dados incorretos. Não foram inseridos!!!!");
			stmt.close();
			uniformobile.fecharBDConn();
		}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Dados incorretos. Não foram inseridos!!!!");
		}
	}
	
	public static void ExcluirEstabelecimento(int codigo){
		ConexaoBanco uniformobile  = new ConexaoBanco();
		   
		  try {
		    //EXCLUIR DADOS
			Connection ExConn = (Connection)uniformobile.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
		    String sSQL = "DELETE FROM uniformobile.estabelecimento WHERE idEstabelecimento = "+codigo+";";
		    boolean rs = stmt.execute(sSQL);
		    JOptionPane.showMessageDialog(null,(!rs)? "Dados do estabelecimento excluidos com sucesso.":"Dados do estabelecimento não foram excluidos com sucesso.");    
		     
		    stmt.close();
		    uniformobile.fecharBDConn();
		  }catch(Exception e){
		    JOptionPane.showMessageDialog(null,"Os dados não foram encontrados!!!");
		  } 
	}
		

		public String AtualizarDados(String nome,String cnpj,String telefone,String ramodeatividade,String endereconocampus,String proprietario,
		String horariodefuncionamento,
		EstabelecimentoBean EstBin){
			ConexaoBanco uniformobile  = new ConexaoBanco();
		  String retorno = "erro";
		  int res;
		  try {
		   //ATUALIZAR DADOS
			 Connection ExConn = (Connection)uniformobile.getConnection();
			 Statement stmt = (Statement) ExConn.createStatement();
		    
			 res = stmt.executeUpdate("UPDATE uniformobile.estabelecimento SET nome = '"+nome+"', cnpj = '"+cnpj+
		     "',telefone = '"+telefone+"',ramodeatividade = '"+ramodeatividade+"', endereconocampus = '"+endereconocampus+
		     "',proprietario = '"+proprietario+"' WHERE idEstabelecimento = "+EstBin.getCodigo());
		   if(res==1)JOptionPane.showMessageDialog(null,"Os dados  foram atualizados com sucesso!!!");
		   stmt.close();
		   uniformobile.fecharBDConn();
		  }catch(Exception e){
		    JOptionPane.showMessageDialog(null,"Os dados não puderam ser atualizados!!!");
		  }
		  return retorno;}


	public static int BuscarDados(int codigo,EstabelecimentoBean EstBin) {
		ConexaoBanco uniformobile = new ConexaoBanco();
	     
	  try {
	   //BUSCAR DADOS
		 Connection ExConn = (Connection)uniformobile.getConnection();
	     Statement stmt = (Statement) ExConn.createStatement();
	   String sSQL = "SELECT * FROM uniformobile.Estabelecimento WHERE idEstabelecimento = "+codigo;
	   ResultSet rs = stmt.executeQuery(sSQL);
	   
	       while(rs.next())
	  {
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
	    	uniformobile.fecharBDConn();
	  }catch(Exception e){
	    JOptionPane.showMessageDialog(null,"Os dados não puderam ser encontrado!!!");
	  }
	return codigo; 
	  
	}
		}

