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
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEditarEvento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditarEvento frame = new TelaEditarEvento();
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
	public TelaEditarEvento() {
		setTitle("EDITAR EVENTO - 1.0.1");
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 694, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("Ajuda");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("O que mudou?");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ControleDeAcesso.administrador())
				    ChamarTelas.abrir(new TelaSobreSistema());
			}
		});
		menu.add(menuItem);
	}
}
