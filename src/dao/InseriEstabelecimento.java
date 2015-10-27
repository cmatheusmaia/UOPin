package dao;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class InseriEstabelecimento {
	
	public static String InsereDados(String nome,String cnpj,String telefone,String ramodeatividade,String endereconocampus,String proprietario,String horariodefuncionamento){
		conexaoBanco banco  = new conexaoBanco();
		String retorno = "erro";
		try {
			
			Statement stmt = (Statement) conexaoBanco.createStatement();
			String sSQL = "INSERT INTO banco.cliente VALUES ('"+nome+"','"+cnpj+"','"+telefone+"','"+ramodeatividade+"','"+endereconocampus+"','"+proprietario+"','"+horariodefuncionamento+"');";
			boolean res = stmt.execute(sSQL);
			
			JOptionPane.showMessageDialog(null,(!res)?"Dados Inseridos com Sucesso!!!":"" +
					"Os dados não puderam ser inseridos!!!");
			stmt.close();
			banco.abrirBDConn();
		}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
		}
		return retorno;

	}
}

