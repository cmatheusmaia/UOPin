package negocio;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dao.acesso;
import view.home;

public class managerInicial{

    public static void entrar(JTextField txtUsuario, JPasswordField txtSenha) {
	acesso cl = new acesso();
	cl.Acesso(txtUsuario.getText(), txtSenha.getText());

	if (cl.acesso == true) {
	    new home();
	}

	if (cl.acesso == false) {
	    txtUsuario.setText("");
	    txtSenha.setText("");
	    txtUsuario.requestFocus();
	}

	cl.acesso = false;

    }
}
