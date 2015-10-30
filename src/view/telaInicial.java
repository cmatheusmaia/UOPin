package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import negocio.managerInicial;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class telaInicial {

    protected JFrame frmUniforFerramenta;
    protected static JTextField txtUsuario;
    protected static JPasswordField txtSenha;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    telaInicial window = new telaInicial();
		    window.frmUniforFerramenta.setVisible(true);
		    window.frmUniforFerramenta.setLocationRelativeTo(null);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public telaInicial() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frmUniforFerramenta = new JFrame();
	frmUniforFerramenta.setVisible(true);
	frmUniforFerramenta.setResizable(false);
	frmUniforFerramenta.setIconImage(
		Toolkit.getDefaultToolkit().getImage(telaInicial.class.getResource("/img/unifor_logo.png")));
	frmUniforFerramenta.getContentPane().setBackground(SystemColor.textHighlightText);
	frmUniforFerramenta.getContentPane().setLayout(null);

	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setIcon(new ImageIcon(telaInicial.class.getResource("/img/UNIFOR_Logo_21.gif")));
	lblNewLabel.setBounds(0, 38, 337, 233);
	frmUniforFerramenta.getContentPane().add(lblNewLabel);

	JLabel lblUsurio = new JLabel("USU\u00C1RIO");
	lblUsurio.setBounds(78, 298, 56, 14);
	frmUniforFerramenta.getContentPane().add(lblUsurio);

	JLabel lblSenha = new JLabel("SENHA");
	lblSenha.setBounds(78, 323, 56, 14);
	frmUniforFerramenta.getContentPane().add(lblSenha);

	txtUsuario = new JTextField();
	txtUsuario.setBounds(132, 295, 135, 20);
	frmUniforFerramenta.getContentPane().add(txtUsuario);
	txtUsuario.setColumns(10);

	txtSenha = new JPasswordField();
	txtSenha.setBounds(131, 320, 136, 20);
	frmUniforFerramenta.getContentPane().add(txtSenha);

	JButton btnNewButton = new JButton("ENTRAR");
	btnNewButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		managerInicial.entrar(txtUsuario, txtSenha);
	    }
	});
	btnNewButton.setBounds(82, 351, 89, 32);
	frmUniforFerramenta.getContentPane().add(btnNewButton);

	JButton btnNewButton_1 = new JButton("SAIR");
	btnNewButton_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		negocio.managerSairDoSistema.sair();
	    }
	});
	btnNewButton_1.setBounds(178, 351, 89, 32);
	frmUniforFerramenta.getContentPane().add(btnNewButton_1);

	JLabel lblUniforcMobile = new JLabel("UNFOR MOBILE. VERS\u00C3O 1.0.1 BUILDER 2015");
	lblUniforcMobile.setForeground(SystemColor.controlShadow);
	lblUniforcMobile.setFont(new Font("Arial", Font.PLAIN, 8));
	lblUniforcMobile.setBounds(92, 435, 175, 14);
	frmUniforFerramenta.getContentPane().add(lblUniforcMobile);
	frmUniforFerramenta.setBackground(SystemColor.textHighlightText);
	frmUniforFerramenta.setTitle("UNIFOR - FERRAMENTA DE GEST\u00C3O");
	frmUniforFerramenta.setBounds(100, 100, 357, 495);
	frmUniforFerramenta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
