package negocio;
import javax.swing.JOptionPane;

import dao.acesso;
import view.home;
import view.telaInicial;

public class managerInicial extends telaInicial {

    public static void entrar(String[] args) {
	
    
	acesso cl = new acesso();
	cl.Acesso(txtUsuario.getText(), txtSenha.getText());
	
	if(cl.acesso == true){
		home tl = new home();
		tl.show();
		tl.setExtendedState(home.MAXIMIZED_BOTH);
		dispose();
	}
	
	if (cl.acesso==false){
		txtUsuario.setText("");
		txtSenha.setText("");
		txtUsuario.requestFocus();
	}
	
	cl.acesso = false;
	
    }
    
    private static void dispose() {
	// TODO Auto-generated method stub
	
    }

    public static void sair(String[] args) {
	JOptionPane.showMessageDialog(null, "O sistema será encerrado");
	System.exit(0);	
}
    
}
