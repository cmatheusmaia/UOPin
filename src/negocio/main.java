package negocio;

import javax.swing.JOptionPane;
import dao.*;

public class main {

	public static void sair(String[] args) {
		JOptionPane.showMessageDialog(null, "O sistema será encerrado");
		System.exit(0);
		
	}
	
	public static void entrar(String[] args) {
		acesso ac = new acesso();
			ac.Acesso(null, null);
		}
}
	
