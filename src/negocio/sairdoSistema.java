package negocio;

import javax.swing.JOptionPane;

public class sairdoSistema {
    public static void sair() {
	int selectedOption = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?", "O sistema será encerrado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);  
        if(selectedOption == JOptionPane.YES_OPTION){  
            System.exit(0);                           
        }
    }

}
