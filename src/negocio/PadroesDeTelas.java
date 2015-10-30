package negocio;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

import view.telaVersao;

public class PadroesDeTelas {

    
    public static void definir(JFrame tela){
    	tela.setLocationRelativeTo(null);
    	tela.setVisible(true);
    	tela.setResizable(false);
	tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	tela.setBounds(100, 100, 700, 500);
	tela.getContentPane().setLayout(null);
	tela.getContentPane().setBackground(Color.WHITE);
	tela.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.getClass().getResource("/img/unifor_logo.png")));
    }
}
