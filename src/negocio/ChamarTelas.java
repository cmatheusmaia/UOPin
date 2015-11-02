package negocio;
/*
 * Autores: Samuel Santiago / Matheus Maia
 * Colabora��o: Adriano Patrick
 * Nessa classe ficamos respons�vel de fazer o gerenciamento na chamada de rotinas*
 * As rotinas s�o atividades que o usu�rio poder� executar em meio a autentica��o do sistema.
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.*;

public class ChamarTelas {

    public static void abrir(JFrame tela) {
	JOptionPane.showMessageDialog(null, "Carregando rotina");

	// Respons�vel para chamar rotinas de: Cadastro;

	switch (tela.toString()) {
	case "telaCadastrarEvento":
	    new telaCadastroEvento();
	    break;
	case "telaExcluirEvento":
	    new telaExcluirEvento();
	    break;
	case "telaEditarEvento":
	    new telaEditarEvento();
	    break;
	case "telaCadastrarUsuario":
	    new telaCadastroUsuario();
	    break;
	case "telaEditarUsuario":
	    new telaEditarUsuario();
	    break;
	case "telaExcluirUsuario":
	    new telaExcluirUsuario();
	    break;
	case "telaCadastrarEstabelecimento":
	    new telaCadastroEstabelecimento();
	    break;
	case "telaEditarEstabelecimento":
	    new telaEditarEstabelecimento();
	    break;
	case "telaExcluirEstabelecimento":
	    new telaExcluirEstabelecimento();
	    break;

	// Respons�vel para chamar rotinas de: Relat�rios;

	case "telaRelEventosRealizados":
	    new telaRelEventosRealizados();
	    break;
	case "telaRelUsuariosCadastros":
	    new telaRelUsuariosCadastros();
	    break;

	// Respons�vel para chamar rotinas de: Sobre;

	case "telaSobreUnifor":
	    new telaSobreUnifor();
	    break;

	case "telaSobreSistema":
	    new telaSobreSistema();
	    break;
	case "telaVersao":
	    new telaVersao();
	    break;

	default:
	    break;
	}

	PadroesDeTelas.definir(tela);
    }

}