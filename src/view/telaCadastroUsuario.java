package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class telaCadastroUsuario extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    telaCadastroUsuario frame = new telaCadastroUsuario();
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
    
    public telaCadastroUsuario() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(telaCadastroUsuario.class.getResource("/img/unifor_logo.png")));
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setResizable(false);
    	setTitle("CADASTRO DE USUARIO - 1.0.2");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 700, 500);
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnNewMenu = new JMenu("Ajuda");
	mnNewMenu.setIcon(new ImageIcon(telaCadastroUsuario.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu);
	
	JMenuItem mntmNewMenuItem = new JMenuItem("O que mudou?");
	mnNewMenu.add(mntmNewMenuItem);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Usu\u00E1rio*");
	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel.setForeground(SystemColor.controlDkShadow);
	lblNewLabel.setBounds(32, 27, 82, 23);
	contentPane.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(32, 49, 218, 29);
	contentPane.add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Senha*");
	lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_1.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_1.setBounds(286, 26, 82, 23);
	contentPane.add(lblNewLabel_1);
	
	textField_1 = new JTextField();
	textField_1.setBounds(286, 49, 166, 29);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(493, 47, 166, 29);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("Confirmar senha*");
	lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_2.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_2.setBounds(493, 22, 148, 23);
	contentPane.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Nome*");
	lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_3.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_3.setBounds(32, 90, 82, 23);
	contentPane.add(lblNewLabel_3);
	
	textField_3 = new JTextField();
	textField_3.setBounds(32, 112, 420, 29);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Perfil do usu\u00E1rio*");
	lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_4.setBounds(493, 90, 154, 23);
	contentPane.add(lblNewLabel_4);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "Administrador", "Empresario", "Funcion\u00E1rio"}));
	comboBox.setBounds(493, 112, 166, 29);
	contentPane.add(comboBox);
	
	JLabel lblNewLabel_5 = new JLabel("Data de nascimento*");
	lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_5.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_5.setBounds(32, 158, 183, 23);
	contentPane.add(lblNewLabel_5);
	
	textField_4 = new JTextField();
	textField_4.setBounds(32, 180, 186, 29);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNewLabel_6 = new JLabel("Sexo*");
	lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_6.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_6.setBounds(286, 158, 82, 23);
	contentPane.add(lblNewLabel_6);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "Masculino", "Feminino"}));
	comboBox_1.setBounds(286, 180, 166, 29);
	contentPane.add(comboBox_1);
	
	JLabel lblNewLabel_7 = new JLabel("Observa\u00E7\u00E3o");
	lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_7.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_7.setBounds(32, 224, 154, 23);
	contentPane.add(lblNewLabel_7);
	
	textField_5 = new JTextField();
	textField_5.setBounds(32, 252, 627, 75);
	contentPane.add(textField_5);
	textField_5.setColumns(10);
	
	JLabel lblNewLabel_8 = new JLabel("* Campos obrigat\u00F3rios");
	lblNewLabel_8.setForeground(SystemColor.controlShadow);
	lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 10));
	lblNewLabel_8.setBounds(42, 333, 237, 23);
	contentPane.add(lblNewLabel_8);
	
	JLabel lblNewLabel_9 = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	lblNewLabel_9.setForeground(SystemColor.controlShadow);
	lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 10));
	lblNewLabel_9.setBounds(222, 422, 231, 23);
	contentPane.add(lblNewLabel_9);
	
	JButton btnNewButton = new JButton("Cadastrar");
	btnNewButton.setBounds(179, 367, 131, 31);
	contentPane.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Limpar");
	btnNewButton_1.setBounds(359, 367, 131, 31);
	contentPane.add(btnNewButton_1);
    }
}