package negocio;

import javax.swing.JOptionPane;

import dao.acesso;
import view.home;
import view.telaCadastroUsuario;
import view.telaInicial;

public class managerCadastrarEvento {

	
	public static void chamarRotina(String[] args) {
		JOptionPane.showMessageDialog(null, "Iniciando tela");
		new telaCadastroUsuario();
	}
}





