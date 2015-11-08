package negocio;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

import view.TelaVersao;

public class PadroesDeTelas {

    
    public static void definir(JFrame tela){

    	tela.setResizable(false);
	tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	tela.setBounds(100, 100, 700, 500);
    	tela.setLocationRelativeTo(null);
	tela.getContentPane().setLayout(null);
	tela.getContentPane().setBackground(Color.WHITE);
	tela.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.getClass().getResource("/img/unifor_logo.png")));
    	tela.setVisible(true);
    }
}
