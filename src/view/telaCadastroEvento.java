package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import negocio.PadroesDeTelas;

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
import javax.swing.JSlider;
import java.awt.Canvas;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;

public class telaCadastroEvento extends JFrame {

    private JPanel contentPane;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_6;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    telaCadastroEvento frame = new telaCadastroEvento();
		    frame.setLocationRelativeTo(null);
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
    public telaCadastroEvento() {
    	PadroesDeTelas.definir(this);
    	setTitle("CADASTRO DE EVENTO - 1.0.1");
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnNewMenu = new JMenu("Ajuda");
	mnNewMenu.setIcon(new ImageIcon(telaCadastroEvento.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu);
	
	JMenuItem mntmNewMenuItem = new JMenuItem("O que mudou?");
	mnNewMenu.add(mntmNewMenuItem);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewLabel_3 = new JLabel("Nome*");
	lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_3.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_3.setBounds(34, 18, 82, 23);
	contentPane.add(lblNewLabel_3);
	
	textField_3 = new JTextField();
	textField_3.setBounds(34, 40, 420, 29);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Centro organizador*");
	lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_4.setBounds(465, 18, 154, 23);
	contentPane.add(lblNewLabel_4);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "CI\u00CANCIAS DA COMUNICA\u00C7\u00C3O E GEST\u00C3O", "CI\u00CANCIAS JUR\u00CDDICAS", "CI\u00CANCIAS DA SA\u00DADE", "CI\u00CANCIAS TECNOL\u00D3GICAS"}));
	comboBox.setBounds(465, 40, 212, 29);
	contentPane.add(comboBox);
	
	JLabel lblNewLabel_5 = new JLabel("Data e hora de inicio*");
	lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_5.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_5.setBounds(32, 74, 183, 23);
	contentPane.add(lblNewLabel_5);
	
	textField_4 = new JTextField();
	textField_4.setBounds(32, 96, 186, 29);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNewLabel_7 = new JLabel("Descri\u00E7\u00E3o*");
	lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_7.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_7.setBounds(33, 262, 154, 23);
	contentPane.add(lblNewLabel_7);
	
	textField_5 = new JTextField();
	textField_5.setBounds(32, 283, 645, 43);
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
	
	JLabel lblNewLabel = new JLabel("Link externo do evento*");
	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel.setForeground(SystemColor.controlDkShadow);
	lblNewLabel.setBounds(249, 74, 131, 23);
	contentPane.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(249, 96, 428, 29);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(34, 162, 186, 29);
	contentPane.add(textField_1);
	
	JLabel lblDataEHora = new JLabel("Data e hora do fim*");
	lblDataEHora.setForeground(SystemColor.controlDkShadow);
	lblDataEHora.setFont(new Font("Arial", Font.PLAIN, 11));
	lblDataEHora.setBounds(34, 140, 183, 23);
	contentPane.add(lblDataEHora);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(249, 162, 428, 29);
	contentPane.add(textField_2);
	
	JLabel lblUrlDaImagem = new JLabel("Url da imagem*");
	lblUrlDaImagem.setForeground(SystemColor.controlDkShadow);
	lblUrlDaImagem.setFont(new Font("Arial", Font.PLAIN, 11));
	lblUrlDaImagem.setBounds(249, 140, 131, 23);
	contentPane.add(lblUrlDaImagem);
	
	textField_6 = new JTextField();
	textField_6.setBounds(34, 224, 420, 29);
	contentPane.add(textField_6);
	textField_6.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Local*");
	lblNewLabel_1.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_1.setBounds(34, 203, 82, 23);
	contentPane.add(lblNewLabel_1);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "Palestra", "F\u00F3rum", "Semin\u00E1rio", "Curso", "Oficina", "Entretenimento"}));
	comboBox_1.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox_1.setBounds(465, 224, 212, 29);
	contentPane.add(comboBox_1);
	
	JLabel lblTipo = new JLabel("Tipo*");
	lblTipo.setForeground(SystemColor.controlDkShadow);
	lblTipo.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTipo.setBounds(465, 202, 154, 23);
	contentPane.add(lblTipo);
    }


}
