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
	case "TelaCadastrarEvento":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaCadastroEvento();
	    break;
	case "TelaExcluirEvento":
	    if (ControleDeAcesso.empresarioEAdministrador())
		new TelaCadastroEvento();
	    new TelaExcluirEvento();
	    break;
	case "TelaEditarEvento":
	    if (ControleDeAcesso.empresarioEAdministrador())
		new TelaEditarEvento();
	    break;
	case "TelaCadastrarUsuario":
	    if (ControleDeAcesso.administrador())
		new TelaCadastroUsuario();
	    break;
	case "TelaEditarUsuario":
	    if (ControleDeAcesso.administrador())
		new TelaEditarUsuario();
	    break;
	case "TelaExcluirUsuario":
	    if (ControleDeAcesso.administrador())
		new TelaExcluirUsuario();
	    break;
	case "TelaCadastrarEstabelecimento":
	    if (ControleDeAcesso.empresarioEAdministrador())
		new TelaCadastroEstabelecimento();
	    break;
	case "TelaEditarEstabelecimento":
	    if (ControleDeAcesso.empresarioEAdministrador())
		new TelaEditarEstabelecimento();
	    break;
	case "TelaExcluirEstabelecimento":
	    if (ControleDeAcesso.administrador())
		new TelaExcluirEstabelecimento();
	    break;

	// Responsável para chamar rotinas de: Relatórios;

	case "TelaRelEventosRealizados":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaRelEventosRealizados();
	    break;
	case "TelaRelUsuariosCadastros":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaRelUsuariosCadastros();
	    break;

	// Responsável para chamar rotinas de: Sobre;

	case "TelaSobreUnifor":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaSobreUnifor();
	    break;

	case "TelaSobreSistema":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaSobreSistema();
	    break;
	case "TelaVersao":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaVersao();
	    break;

	default:
	    break;
	}

	PadroesDeTelas.definir(tela);
    }

}