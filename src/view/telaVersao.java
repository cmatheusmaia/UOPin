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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(telaVersao.class.getResource("/img/unifor_logo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
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
		
		JLabel lblMapaDoSistema = new JLabel("Mapa do sistema");
		lblMapaDoSistema.setFont(new Font("Arial", Font.BOLD, 18));
		lblMapaDoSistema.setBounds(10, 87, 626, 14);
		contentPane.add(lblMapaDoSistema);
		
		JLabel label = new JLabel("1.");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setBounds(10, 109, 492, 14);
		contentPane.add(label);
	}
}
