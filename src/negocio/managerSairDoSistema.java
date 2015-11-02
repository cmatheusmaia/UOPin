package negocio;

import javax.swing.JOptionPane;

public class managerSairDoSistema {

	public static void sair() {
		
		int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?",
				"", JOptionPane.YES_NO_OPTION, JOptionPane.NO_OPTION);    
	    		if(selectedOption == JOptionPane.YES_OPTION){
	    			JOptionPane.showMessageDialog(null, "O sistema será encerrado");
	        System.exit(0); 
	        }else{
	        	
	    		if(selectedOption == JOptionPane.NO_OPTION){
	    			
	    		}
	        }
	

	/*int selectedOption = JOptionPane.showConfirmDialog(null,
}
}*/

	
}}