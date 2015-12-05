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
//	JOptionPane.showMessageDialog(null, "Carregando rotina");

	// Responsável para chamar rotinas de: Cadastro;

	switch (tela.toString()) {
	case "TelaCadastrarEvento":
		new TelaCadastroEvento();
	    break;
	case "TelaExcluirEvento":
		new TelaCadastroEvento();
	    new TelaExcluirEvento();
	    break;
	case "TelaEditarEvento":
		new TelaEditarEvento();
	    break;
	case "TelaCadastrarUsuario":
		new TelaCadastroUsuario();
	    break;
	case "TelaEditarUsuario":
		new TelaEditarUsuario();
	    break;
	case "TelaExcluirUsuario":
		new TelaExcluirUsuario();
	    break;
	case "TelaCadastrarEstabelecimento":
		new TelaCadastroEstabelecimento();
	    break;
	case "TelaEditarEstabelecimento":
		new TelaEditarEstabelecimento();
	    break;
	case "TelaExcluirEstabelecimento":
		new TelaExcluirEstabelecimento();
	    break;

	// Responsável para chamar rotinas de: Relatórios;

	case "TelaRelEventosRealizados":
		new TelaRelEventosRealizados();
	    break;
	case "TelaRelUsuariosCadastros":
		new TelaRelUsuariosCadastros();
	    break;

	// Responsável para chamar rotinas de: Sobre;

	case "TelaSobreUnifor":
		new TelaSobreUnifor();
	    break;

	case "TelaSobreSistema":
		new TelaSobreSistema();
	    break;
	case "TelaVersao":
		new TelaVersao();
	    break;

	default:
	    break;
	}

	PadroesDeTelas.definir(tela);
    }

    public static void recarregar(JFrame tela) {
	tela.dispose();
	switch (tela.toString()) {
	case "TelaCadastrarEvento":
		new TelaCadastroEvento();
	    break;
	case "TelaExcluirEvento":
		new TelaCadastroEvento();
	    new TelaExcluirEvento();
	    break;
	case "TelaEditarEvento":
		new TelaEditarEvento();
	    break;
	case "TelaCadastrarUsuario":
		new TelaCadastroUsuario();
	    break;
	case "TelaEditarUsuario":
		new TelaEditarUsuario();
	    break;
	case "TelaExcluirUsuario":
		new TelaExcluirUsuario();
	    break;
	case "TelaCadastrarEstabelecimento":
		new TelaCadastroEstabelecimento();
	    break;
	case "TelaEditarEstabelecimento":
		new TelaEditarEstabelecimento();
	    break;
	case "TelaExcluirEstabelecimento":
		new TelaExcluirEstabelecimento();
	    break;

	case "TelaRelEventosRealizados":
		new TelaRelEventosRealizados();
	    break;
	case "TelaRelUsuariosCadastros":
		new TelaRelUsuariosCadastros();
	    break;

	case "TelaSobreUnifor":
		new TelaSobreUnifor();
	    break;

	case "TelaSobreSistema":
		new TelaSobreSistema();
	    break;
	case "TelaVersao":
		new TelaVersao();
	    break;

	default:
	    break;
	}

	PadroesDeTelas.definir(tela);
	
    }

}