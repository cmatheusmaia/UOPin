package negocio;
/*
 * Autores: Samuel Santiago / Matheus Maia
 * Colaboração: Adriano Patrick
 * Nessa classe ficamos responsável de fazer o gerenciamento na chamada de rotinas*
 * As rotinas são atividades que o usuário poderá executar em meio a autenticação do sistema.
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.*;

public class ChamarTelas {

    public static void abrir(JFrame tela) {
	JOptionPane.showMessageDialog(null, "Carregando rotina");

	// Responsável para chamar rotinas de: Cadastro;

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

	// Responsável para chamar rotinas de: Relatórios;

	case "telaRelEventosRealizados":
	    new telaRelEventosRealizados();
	    break;
	case "telaRelUsuariosCadastros":
	    new telaRelUsuariosCadastros();
	    break;

	// Responsável para chamar rotinas de: Sobre;

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