package negocio;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dao.acesso;
import view.Home;
import view.TelaInicial;

public class ManagerInicial{

    public static void entrar(JTextField txtUsuario, JPasswordField txtSenha, JFrame tela) {
	acesso cl = new acesso();
	cl.Acesso(txtUsuario.getText(), txtSenha.getText());

	if (cl.acesso == true) {
	    new Home();
	    tela.dispose();
	    
	}

	if (cl.acesso == false) {
	    txtUsuario.setText("");
	    txtSenha.setText("");
	    txtUsuario.requestFocus();
	}

	cl.acesso = false;

    }
}
