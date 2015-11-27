package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.ConexaoBanco;
import dao.InseriEstabelecimento;
import dao.UsuarioDao;
import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.ManagerEditarUsuario;
import negocio.PadroesDeTelas;
import sistema.bean.UsuarioBean;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TelaEditarUsuario extends JFrame {

    private JPanel contentPane;
    private static JTextField textField_Nome;
    private static JTextField textField_Nome_completo;
    private static JTextField textField_Dt_nascimento;
    private static JPasswordField passSenha;
    private static int perfil;
    private static int sexo;
    private static UsuarioBean usuarioBean = new UsuarioBean();
    private static UsuarioDao usuarioDao = new UsuarioDao();

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
	setBounds(100, 100, 700, 500);

	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);

	JMenu mnNewMenu = new JMenu("Ajuda");
	mnNewMenu.setIcon(new ImageIcon(TelaCadastroUsuario.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu);

	JMenuItem mntmNewMenuItem = new JMenuItem("O que mudou?");
	mntmNewMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (ControleDeAcesso.administrador())
			    ChamarTelas.abrir(new TelaSobreSistema());
		}
	});
	mnNewMenu.add(mntmNewMenuItem);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	label.setForeground(SystemColor.controlShadow);
	label.setFont(new Font("Arial", Font.PLAIN, 10));
	label.setBounds(233, 390, 231, 23);
	contentPane.add(label);

	JLabel lblNewLabel = new JLabel("Usu\u00E1rio*");
	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel.setForeground(SystemColor.controlDkShadow);
	lblNewLabel.setBounds(42, 55, 82, 23);
	contentPane.add(lblNewLabel);

	textField_Nome = new JTextField();
	textField_Nome.setEditable(false);
	textField_Nome.setBounds(42, 77, 323, 29);
	contentPane.add(textField_Nome);
	textField_Nome.setColumns(10);

	JLabel lblNewLabel_1 = new JLabel("Senha*");
	lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_1.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_1.setBounds(417, 55, 82, 23);
	contentPane.add(lblNewLabel_1);

	JLabel lblNewLabel_3 = new JLabel("Nome completo*");
	lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_3.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_3.setBounds(42, 118, 82, 23);
	contentPane.add(lblNewLabel_3);

	textField_Nome_completo = new JTextField();
	textField_Nome_completo.setEditable(false);
	textField_Nome_completo.setBounds(42, 140, 610, 29);
	contentPane.add(textField_Nome_completo);
	textField_Nome_completo.setColumns(10);

	JLabel lblNewLabel_4 = new JLabel("Perfil do usu\u00E1rio*");
	lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_4.setBounds(486, 186, 154, 23);
	contentPane.add(lblNewLabel_4);

	JComboBox comboBox_Perfil = new JComboBox();
	comboBox_Perfil.setEnabled(false);
	comboBox_Perfil.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox_Perfil.setModel(new DefaultComboBoxModel(
		new String[] { "Escolha:", "Administrador", "Empresario", "Funcion\u00E1rio" }));
	comboBox_Perfil.setBounds(486, 208, 166, 29);
	contentPane.add(comboBox_Perfil);

	JLabel lblNewLabel_5 = new JLabel("Data de nascimento*");
	lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_5.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_5.setBounds(42, 186, 183, 23);
	contentPane.add(lblNewLabel_5);

	textField_Dt_nascimento = new JTextField();
	textField_Dt_nascimento.setEditable(false);
	textField_Dt_nascimento.setBounds(42, 208, 186, 29);
	contentPane.add(textField_Dt_nascimento);
	textField_Dt_nascimento.setColumns(10);

	JLabel lblNewLabel_6 = new JLabel("Sexo*");
	lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_6.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_6.setBounds(261, 186, 82, 23);
	contentPane.add(lblNewLabel_6);

	JComboBox comboBox_Sexo = new JComboBox();
	comboBox_Sexo.setEnabled(false);
	comboBox_Sexo.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox_Sexo.setModel(new DefaultComboBoxModel(new String[] { "Escolha:", "Masculino", "Feminino" }));
	comboBox_Sexo.setBounds(261, 208, 166, 29);
	contentPane.add(comboBox_Sexo);

	JLabel lblNewLabel_8 = new JLabel("* Campos obrigat\u00F3rios");
	lblNewLabel_8.setForeground(SystemColor.controlShadow);
	lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 10));
	lblNewLabel_8.setBounds(47, 374, 237, 23);
	contentPane.add(lblNewLabel_8);

	passSenha = new JPasswordField();
	passSenha.setEditable(false);
	passSenha.setBounds(417, 78, 235, 29);
	getContentPane().add(passSenha);

	JLabel btnSelecionar = new JLabel("Selecionar Usuario:");
	btnSelecionar.setForeground(SystemColor.controlDkShadow);
	btnSelecionar.setFont(new Font("Arial", Font.PLAIN, 11));
	btnSelecionar.setBounds(218, 18, 100, 23);
	contentPane.add(btnSelecionar);

	JButton btnLimpar = new JButton("LIMPAR");
	btnLimpar.setEnabled(false);
	btnLimpar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		textField_Nome.setText("");
		textField_Nome_completo.setText("");
		textField_Dt_nascimento.setText("");
		passSenha.setText("");
		comboBox_Perfil.setSelectedIndex(0);
		comboBox_Sexo.setSelectedIndex(0);

	    }
	});
	btnLimpar.setBounds(380, 345, 106, 23);
	contentPane.add(btnLimpar);

	JButton btnAlterar = new JButton("ATUALIZAR");
	btnAlterar.setEnabled(false);
	btnAlterar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		usuarioBean.setNome(textField_Nome.getText());
		usuarioBean.setSenha(passSenha.getText());
		usuarioBean.setPerfil_Usuario_idPerfil_Usuario(comboBox_Perfil.getSelectedIndex());
		usuarioBean.setDt_nascimento(textField_Dt_nascimento.getText());
		usuarioBean.setSexo_idSexo(comboBox_Sexo.getSelectedIndex());
		usuarioBean.setNomeCompleto(textField_Nome_completo.getText());
	    
		usuarioDao.atualizarDados(usuarioBean);
	    }
	});
	btnAlterar.setBounds(190, 345, 106, 23);
	contentPane.add(btnAlterar);

	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		String nomeUsuario = JOptionPane.showInputDialog(null, "Digite o nome/login do usuario ");
		usuarioDao.buscarDados(nomeUsuario,usuarioBean);		
		ManagerEditarUsuario.preencherBusca(usuarioBean, textField_Nome, textField_Nome_completo,
			textField_Dt_nascimento, passSenha, comboBox_Perfil, comboBox_Sexo, btnAlterar, btnLimpar);
		
	    }
	});
	btnBuscar.setBounds(321, 16, 106, 23);
	contentPane.add(btnBuscar);
    }

}
