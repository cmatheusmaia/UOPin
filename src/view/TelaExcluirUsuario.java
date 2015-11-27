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

public class TelaExcluirUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExcluirUsuario frame = new TelaExcluirUsuario();
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
	public TelaExcluirUsuario() {
		setTitle("EXCLUIR USU\u00C1RIO");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setIcon(new ImageIcon(TelaExcluirUsuario.class.getResource("/img/Info.png")));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmOQueMudou = new JMenuItem("O que mudou?");
		mntmOQueMudou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ControleDeAcesso.administrador())
				    ChamarTelas.abrir(new TelaSobreSistema());
			}
		});
		mnAjuda.add(mntmOQueMudou);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(229, 427, 231, 23);
		contentPane.add(label);
	}

}
