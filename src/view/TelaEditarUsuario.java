package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.PadroesDeTelas;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class TelaEditarUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditarUsuario frame = new TelaEditarUsuario();
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
	public TelaEditarUsuario() {
		setTitle("EDITAR USU\u00C1RIO - 1.0.1");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(231, 437, 231, 23);
		contentPane.add(label);
	}

}