package negocio;

import javax.swing.JOptionPane;

public class managerSairDoSistema {

	public static void sair() {
		
		int selectedOption = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?",
				"O sistema ser� encerrado", JOptionPane.YES_NO_OPTION, JOptionPane.NO_OPTION);    
	    		if(selectedOption == JOptionPane.YES_OPTION){  
	        System.exit(0); 
	        }else{
	        	
	    		if(selectedOption == JOptionPane.NO_OPTION){
	    			
	    		}
	        }
	

	/*int selectedOption = JOptionPane.showConfirmDialog(null,
}
}*/

	
}}