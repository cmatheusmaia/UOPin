package negocio;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sistema.bean.EstabelecimentoBean;


public class ManagerEditarEstabelecimento {

    public static void preencherBuscaEst(EstabelecimentoBean estabelecimentobean, JTextField jtfNome, 
    		JTextField jtfCnpj, JTextField jtfTelefone, JTextField jtfRamoDeAtividade, 
    		JTextField jtfEnderecoNoCampus, JTextField jtfProprietario, JTextField jtfHorarioDeFuncionamento, 
    		JButton btnAlterar, JButton btnLimpar ){
	
	try {
		jtfNome.setText(estabelecimentobean.getNome());
		jtfNome.setEditable(true);
		jtfCnpj.setText(estabelecimentobean.getCnpj());
		jtfTelefone.setEditable(true);
		jtfTelefone.setText(estabelecimentobean.getTelefone());
		jtfRamoDeAtividade.setEditable(true);
		jtfRamoDeAtividade.setText(estabelecimentobean.getRamodeatividade());
		jtfEnderecoNoCampus.setEditable(true);
		jtfEnderecoNoCampus.setText(estabelecimentobean.getEndereconocampus());
		jtfProprietario.setEditable(true);
		jtfProprietario.setText(estabelecimentobean.getProprietario());
		jtfHorarioDeFuncionamento.setEditable(true);
		jtfHorarioDeFuncionamento.setText (estabelecimentobean.getHorariodefuncionamento());
	    btnAlterar.setEnabled(true);
	    btnLimpar.setEnabled(true);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Estabelecimento não foi encontrado, verifique nome e tente novamente");
	}
	
    }
    
    public static void limparDadosEst(EstabelecimentoBean estabelecimentobean, JTextField jtfNome, JTextField jtfCnpj, JTextField jtfTelefone, JTextField jtfRamoDeAtividade, JTextField jtfEnderecoNoCampus, JTextField jtfProprietario, 
    			JTextField jtfHorarioDeFuncionamento, JButton btnAlterar, JButton btnLimpar ) {

    	jtfNome.setText("");
    	jtfCnpj.setText("");
    	jtfTelefone.setText("");
    	jtfRamoDeAtividade.setText("");
    	jtfEnderecoNoCampus.setText("");
    	jtfProprietario.setText("");
    	jtfHorarioDeFuncionamento.setText("");
	btnAlterar.setEnabled(false);
	btnLimpar.setEnabled(false);

    }

    public static void limparDadosEst(EstabelecimentoBean estabelecimentobean, JTextField jtfNome, JTextField jtfCnpj, JTextField jtfTelefone, JTextField jtfRamoDeAtividade, JTextField jtfEnderecoNoCampus, JTextField jtfProprietario, 
			JTextField jtfHorarioDeFuncionamento) {
    	jtfNome.setText("");
    	jtfCnpj.setText("");
    	jtfTelefone.setText("");
    	jtfRamoDeAtividade.setText("");
    	jtfEnderecoNoCampus.setText("");
    	jtfProprietario.setText("");
    	jtfHorarioDeFuncionamento.setText("");
    }
}
