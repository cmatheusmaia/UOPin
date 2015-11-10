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

	// Respons�vel para chamar rotinas de: Relat�rios;

	case "TelaRelEventosRealizados":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaRelEventosRealizados();
	    break;
	case "TelaRelUsuariosCadastros":
	    if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		new TelaRelUsuariosCadastros();
	    break;

	// Respons�vel para chamar rotinas de: Sobre;

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