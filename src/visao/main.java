package visao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import dao.*;
import negocio.*;
import java.util.*;
import java.sql.*;

public class main {

	private JFrame frmUniforMobile;
	private JTextField inserirUsuario;
	private JTextField inserirSenha;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmUniforMobile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUniforMobile = new JFrame();
		frmUniforMobile.setTitle("UNIFOR - FERRAMENTA DE GEST\u00C3O");
		frmUniforMobile.setResizable(false);
		frmUniforMobile.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frmUniforMobile.getContentPane().setBackground(Color.WHITE);
		frmUniforMobile.setBounds(100, 100, 373, 499);
		frmUniforMobile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUniforMobile.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/img/UNIFOR_Logo_21.gif")));
		lblNewLabel.setBounds(10, 22, 351, 248);
		frmUniforMobile.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setBounds(89, 281, 46, 14);
		frmUniforMobile.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(89, 311, 46, 14);
		frmUniforMobile.getContentPane().add(lblNewLabel_2);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrar.setBounds(73, 341, 109, 31);
		frmUniforMobile.getContentPane().add(btnEntrar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSair.setBounds(187, 341, 109, 31);
		frmUniforMobile.getContentPane().add(btnSair);
		
		inserirUsuario = new JTextField();
		inserirUsuario.setBounds(138, 277, 158, 23);
		frmUniforMobile.getContentPane().add(inserirUsuario);
		inserirUsuario.setColumns(10);
		
		inserirSenha = new JTextField();
		inserirSenha.setBounds(138, 307, 158, 23);
		frmUniforMobile.getContentPane().add(inserirSenha);
		inserirSenha.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("VERS\u00C3O DO SISTEMA 1.0.0.1 BUILDER 2015");
		lblNewLabel_3.setForeground(SystemColor.controlShadow);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(73, 445, 230, 14);
		frmUniforMobile.getContentPane().add(lblNewLabel_3);
	}
}
