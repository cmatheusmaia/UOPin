package negocio;
/*
 * Autores: Samuel Santiago / Matheus Maia
 * Colaboração: Adriano Patrick
 * Nessa classe ficamos responsável de fazer o gerenciamento na chamada de rotinas*
 * As rotinas são atividades que o usuário poderá executar em meio a autenticação do sistema.
 */

import javax.swing.JOptionPane;

import view.*;

public class ChamarTelas {

    public static void abrir(String nomeDaTela) {
	JOptionPane.showMessageDialog(null, "Carregando rotina");
	
	// Responsável para chamar rotinas de: Cadastro;
	
	switch (nomeDaTela) {
	case "CadastrarEvento":
		new telaCadastroEvento();
	    break;
	case "ExcluirEvento":
	    new telaExcluirEvento();
	    break;	   
	case "EditarEvento":
	    new telaEditarEvento();
	    break;	    
	case "CadastrarUsuario":
	    new telaCadastroUsuario();
	    break;
	case "EditarUsuario":
	    new telaEditarUsuario();
	    break;
	case "ExcluirUsuario":
	    new telaExcluirUsuario();
	    break;	    
	case "CadastrarEstabelecimento":
	    new telaCadastroEstabelecimento();
	    break;
	case "EditarEstabelecimento":
	    new telaEditarEstabelecimento();
	    break;
	case "ExcluirEstabelecimento":
	    new telaExcluirEstabelecimento();
	    break;  
	    
	    
	//  Responsável para chamar rotinas de: Relatórios;
	    
	case "UltimosEventosRealizadosRelatorio":
	    new telaRelEventosRealizados();
	    break;
	case "UsuariosCadastradosRelatorio":
	    new telaRelUsuariosCadastros();
	    break;    
	    
	//  Responsável para chamar rotinas de: Sobre;
	    
	case "UniforOnlineSobre":
		new telaSobreUnifor();
	    break;
	    
	case "SobreOSistemaSobre":
		new telaSobreSistema();
	    break;    
	case "VersaoSobre":
		new telaVersao();
	    break;    	    
	    
	default:
	    break;
	}
    }
}
