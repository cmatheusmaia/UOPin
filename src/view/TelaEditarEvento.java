package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.ManagerEditarUsuario;
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
	setBounds(100,100,700,500);

	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnNewMenu = new JMenu("Ajuda");
	mnNewMenu.setIcon(new ImageIcon(TelaCadastroEvento.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu);
	
	JMenuItem mntmNewMenuItem = new JMenuItem("O que mudou?");
	mntmNewMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
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
	
	JLabel lblNewLabel_3 = new JLabel("Nome*");
	lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_3.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_3.setBounds(17, 38, 82, 23);
	contentPane.add(lblNewLabel_3);
	
	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setBounds(17, 60, 420, 29);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Centro organizador*");
	lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_4.setBounds(448, 38, 154, 23);
	contentPane.add(lblNewLabel_4);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setEnabled(false);
	comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "CI\u00CANCIAS DA COMUNICA\u00C7\u00C3O E GEST\u00C3O", "CI\u00CANCIAS JUR\u00CDDICAS", "CI\u00CANCIAS DA SA\u00DADE", "CI\u00CANCIAS TECNOL\u00D3GICAS"}));
	comboBox.setBounds(448, 60, 212, 29);
	contentPane.add(comboBox);
	
	JLabel lblNewLabel_5 = new JLabel("Data e hora de inicio*");
	lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_5.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_5.setBounds(15, 94, 183, 23);
	contentPane.add(lblNewLabel_5);
	
	textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setBounds(15, 116, 186, 29);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNewLabel_7 = new JLabel("Descri\u00E7\u00E3o*");
	lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_7.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_7.setBounds(16, 282, 154, 23);
	contentPane.add(lblNewLabel_7);
	
	textField_5 = new JTextField();
	textField_5.setEditable(false);
	textField_5.setBounds(15, 303, 645, 43);
	contentPane.add(textField_5);
	textField_5.setColumns(10);
	
	JLabel lblNewLabel_8 = new JLabel("* Campos obrigat\u00F3rios");
	lblNewLabel_8.setForeground(SystemColor.controlShadow);
	lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 10));
	lblNewLabel_8.setBounds(25, 353, 237, 23);
	contentPane.add(lblNewLabel_8);
	
	JLabel lblNewLabel_9 = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	lblNewLabel_9.setForeground(SystemColor.controlShadow);
	lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 10));
	lblNewLabel_9.setBounds(222, 395, 231, 23);
	contentPane.add(lblNewLabel_9);
	
	JButton btnNewButton = new JButton("Atualizar");
	btnNewButton.setEnabled(false);
	btnNewButton.setBounds(165, 362, 131, 31);
	contentPane.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Limpar");
	btnNewButton_1.setEnabled(false);
	btnNewButton_1.setBounds(345, 362, 131, 31);
	contentPane.add(btnNewButton_1);
	
	JLabel lblNewLabel = new JLabel("Link externo do evento*");
	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel.setForeground(SystemColor.controlDkShadow);
	lblNewLabel.setBounds(232, 94, 131, 23);
	contentPane.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setEditable(false);
	textField.setBounds(232, 116, 428, 29);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setEditable(false);
	textField_1.setColumns(10);
	textField_1.setBounds(17, 182, 186, 29);
	contentPane.add(textField_1);
	
	JLabel lblDataEHora = new JLabel("Data e hora do fim*");
	lblDataEHora.setForeground(SystemColor.controlDkShadow);
	lblDataEHora.setFont(new Font("Arial", Font.PLAIN, 11));
	lblDataEHora.setBounds(17, 160, 183, 23);
	contentPane.add(lblDataEHora);
	
	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setColumns(10);
	textField_2.setBounds(232, 182, 428, 29);
	contentPane.add(textField_2);
	
	JLabel lblUrlDaImagem = new JLabel("Url da imagem*");
	lblUrlDaImagem.setForeground(SystemColor.controlDkShadow);
	lblUrlDaImagem.setFont(new Font("Arial", Font.PLAIN, 11));
	lblUrlDaImagem.setBounds(232, 160, 131, 23);
	contentPane.add(lblUrlDaImagem);
	
	textField_6 = new JTextField();
	textField_6.setEditable(false);
	textField_6.setBounds(17, 244, 420, 29);
	contentPane.add(textField_6);
	textField_6.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Local*");
	lblNewLabel_1.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_1.setBounds(17, 223, 82, 23);
	contentPane.add(lblNewLabel_1);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setEnabled(false);
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "Palestra", "F\u00F3rum", "Semin\u00E1rio", "Curso", "Oficina", "Entretenimento"}));
	comboBox_1.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBox_1.setBounds(448, 244, 212, 29);
	contentPane.add(comboBox_1);
	
	JLabel lblTipo = new JLabel("Tipo*");
	lblTipo.setForeground(SystemColor.controlDkShadow);
	lblTipo.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTipo.setBounds(448, 222, 154, 23);
	contentPane.add(lblTipo);
	
	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
	    }
	});
	btnBuscar.setBounds(318, 16, 106, 23);
	contentPane.add(btnBuscar);
	
	JLabel textSelecionar = new JLabel("Buscar Evento");
	textSelecionar.setForeground(SystemColor.controlDkShadow);
	textSelecionar.setFont(new Font("Arial", Font.PLAIN, 11));
	textSelecionar.setBounds(232, 18, 100, 23);
	contentPane.add(textSelecionar);

    }
}
