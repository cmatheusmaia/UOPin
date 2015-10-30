package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import negocio.PadroesDeTelas;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class telaVersao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		    public void run() {
			try {
			    telaCadastroEvento frame = new telaCadastroEvento();
			    frame.setVisible(true);
			    frame.setLocationRelativeTo(null);
			} catch (Exception e) {
			    e.printStackTrace();
			}
		    }
		});
	    }

	/**
	 * Create the frame.
	 */
	public telaVersao() {
	    	PadroesDeTelas.definir(this);
	    	setTitle("VERS\u00C3O DO SISTEMA - 1.0.1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(telaVersao.class.getResource("/img/unifor_logo.png")));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setIcon(new ImageIcon(telaVersao.class.getResource("/img/Info.png")));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmOQueMudou = new JMenuItem("O que mudou?");
		mnAjuda.add(mntmOQueMudou);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vers\u00E3o do sistema");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 169, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblConheaMaisSobre = new JLabel("Conhe\u00E7a mais sobre a vers\u00E3o 1.0, esta vers\u00E3o veio com o prop\u00F3sito de gerenciar o Unifor Mobile");
		lblConheaMaisSobre.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConheaMaisSobre.setBounds(10, 45, 674, 14);
		contentPane.add(lblConheaMaisSobre);
		
		JLabel lblComIssoPodemos = new JLabel("Com isso, podemos ter uma plataforma mais est\u00E1vel e fluida por onde passar.");
		lblComIssoPodemos.setFont(new Font("Arial", Font.PLAIN, 11));
		lblComIssoPodemos.setBounds(10, 60, 674, 14);
		contentPane.add(lblComIssoPodemos);
		
		JLabel label_1 = new JLabel("UNFOR MOBILE. VERS\u00C3O 1.0.1 BUILDER 2015");
		label_1.setForeground(SystemColor.controlShadow);
		label_1.setFont(new Font("Arial", Font.PLAIN, 8));
		label_1.setBounds(257, 425, 175, 14);
		contentPane.add(label_1);
	}
}
