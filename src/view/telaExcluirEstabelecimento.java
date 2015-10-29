package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class telaExcluirEstabelecimento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaExcluirEstabelecimento frame = new telaExcluirEstabelecimento();
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
	public telaExcluirEstabelecimento() {
		setVisible(true);
		setResizable(false);
		setTitle("EXCLUIR ESTABELECIMENTO - 1.0.1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(241, 427, 231, 23);
		contentPane.add(label);
	}

}
