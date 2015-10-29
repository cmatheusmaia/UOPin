package negocio;
/*
 * Autores: Samuel Santiago / Matheus Maia
 * Colabora��o: Adriano Patrick
 * Nessa classe ficamos respons�vel de fazer o gerenciamento na chamada de rotinas*
 * As rotinas s�o atividades que o usu�rio poder� executar em meio a autentica��o do sistema.
 */

import javax.swing.JOptionPane;

import view.*;

public class ChamarTelas {

    public static void abrir(String nomeDaTela) {
	JOptionPane.showMessageDialog(null, "Carregando rotina");
	
	// Respons�vel para chamar rotinas de: Cadastro;
	
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
	    
	    
	//  Respons�vel para chamar rotinas de: Relat�rios;
	    
	case "UltimosEventosRealizadosRelatorio":
	    new telaRelEventosRealizados();
	    break;
	case "UsuariosCadastradosRelatorio":
	    new telaRelUsuariosCadastros();
	    break;    
	    
	//  Respons�vel para chamar rotinas de: Sobre;
	    
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
