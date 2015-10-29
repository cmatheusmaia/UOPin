package negocio;

import javax.swing.JOptionPane;

import view.telaCadastroEvento;
import view.telaCadastroUsuario;

public class ChamarTelas {

    public static void abrir(String nomeDaTela) {
	JOptionPane.showMessageDialog(null, "Iniciando tela");
	
	switch (nomeDaTela) {
	case "CadastrarEvento":
		new telaCadastroEvento();
	    break;
	case "CadastrarUsuario":
	    	new telaCadastroUsuario();
	    break;
	default:
	    break;
	}
    }
}
