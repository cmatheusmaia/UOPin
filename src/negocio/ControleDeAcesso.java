package negocio;

import javax.swing.JOptionPane;

public class ControleDeAcesso {

    private static int nivelDeAcesso;

    public static void setNivel(int nivel) {
	nivelDeAcesso = nivel;
    }

    public static boolean administrador() {
	if (nivelDeAcesso == 1)
	    return true;
	else {
	    JOptionPane.showMessageDialog(null, "Usuario sem nível de acesso para tela");
	    return false;
	}
    }

    public static boolean empresarioEAdministrador() {
	if (nivelDeAcesso <= 2)
	    return true;
	else {
	    JOptionPane.showMessageDialog(null, "Usuario sem nível de acesso para tela");
	    return false;
	}
    }

    public static boolean funcionarioEmpresarioEAdministrador() {
	if (nivelDeAcesso <= 3)
	    return true;
	else {
	    JOptionPane.showMessageDialog(null, "Usuario sem nível de acesso para tela");
	    return false;
	}
    }
}
