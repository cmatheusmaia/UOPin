package visao;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.TextArea;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import dao.acesso;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class main {

	private JFrame frmUniforonlinePara;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmUniforonlinePara.setVisible(true);
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
		frmUniforonlinePara = new JFrame();
		frmUniforonlinePara.setTitle("UniforOnline - Para desktops | Powered By Matheus Maai");
		frmUniforonlinePara.getContentPane().setBackground(Color.WHITE);
		frmUniforonlinePara.setBounds(100, 100, 370, 469);
		frmUniforonlinePara.setResizable(false);
		frmUniforonlinePara.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUniforonlinePara.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setBounds(46, 280, 65, 14);
		frmUniforonlinePara.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(46, 305, 65, 14);
		frmUniforonlinePara.getContentPane().add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(109, 277, 201, 20);
		frmUniforonlinePara.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(109, 305, 201, 20);
		frmUniforonlinePara.getContentPane().add(txtSenha);
		
		JButton btnEntrar = new JButton("Acessar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				acesso cl = new acesso();
				cl.Acesso(txtLogin.getText(), txtSenha.getText());
				
				if(cl.acesso == true){
					telaInicio tl = new telaInicio();
					tl.show();
					new telaInicio();
					tl.setExtendedState(telaInicio.MAXIMIZED_BOTH);
					dispose();
				}
				
				if (cl.acesso==false){
					txtLogin.setText("");
					txtSenha.setText("");
					txtLogin.requestFocus();
				}
				
				cl.acesso = false;
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnEntrar.setBounds(46, 333, 135, 38);
		frmUniforonlinePara.getContentPane().add(btnEntrar);
		
		JButton btnCancelar = new JButton("Fechar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnCancelar.setBounds(181, 333, 129, 38);
		frmUniforonlinePara.getContentPane().add(btnCancelar);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(main.class.getResource("/img/UNIFOR_Logo_21.gif")));
		logo.setBounds(10, 53, 334, 197);	
		frmUniforonlinePara.getContentPane().add(logo);
	}
}
