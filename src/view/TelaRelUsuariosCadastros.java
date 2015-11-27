package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.PadroesDeTelas;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRelUsuariosCadastros extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelUsuariosCadastros frame = new TelaRelUsuariosCadastros();
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
	public TelaRelUsuariosCadastros() {
		setResizable(false);
		setTitle("RELAT\u00D3RIO DE USU\u00C1RIOS CADASTRADOS - 1.0.1");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 442, 23);
		contentPane.add(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setIcon(new ImageIcon(TelaRelUsuariosCadastros.class.getResource("/img/Info.png")));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmOQueMudou = new JMenuItem("O que mudou?");
		mntmOQueMudou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ControleDeAcesso.administrador())
				    ChamarTelas.abrir(new TelaSobreSistema());
			}
		});
		mnAjuda.add(mntmOQueMudou);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(226, 427, 231, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaRelUsuariosCadastros.class.getResource("/img/erro_descontinuada.jpg")));
		label_1.setBounds(10, 23, 432, 290);
		contentPane.add(label_1);
	}
}
