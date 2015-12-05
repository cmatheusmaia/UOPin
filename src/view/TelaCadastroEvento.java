package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.ManagerCadastrarEvento;
import negocio.ManagerCadastroUsuario;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroEvento extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldNome;
    private JTextField textFieldDataInicio;
    private JTextField textFieldDescricao;
    private JTextField textFieldLink;
    private JTextField textFieldDataFim;
    private JTextField textFieldUrlImg;
    private JTextField textFieldLocal;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    TelaCadastroEvento frame = new TelaCadastroEvento();
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
    public TelaCadastroEvento() {
	setTitle("CADASTRO DE EVENTO - 1.0.1");
	
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
	lblNewLabel_3.setBounds(34, 18, 82, 23);
	contentPane.add(lblNewLabel_3);
	
	textFieldNome = new JTextField();
	textFieldNome.setBounds(34, 40, 420, 29);
	contentPane.add(textFieldNome);
	textFieldNome.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Centro organizador*");
	lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_4.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_4.setBounds(465, 18, 154, 23);
	contentPane.add(lblNewLabel_4);
	
	JComboBox comboBoxCentros = new JComboBox();
	comboBoxCentros.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBoxCentros.setModel(new DefaultComboBoxModel(new String[] {"Escolha:",
			"CI\u00CANCIAS DA COMUNICA\u00C7\u00C3O E GEST\u00C3O", "CI\u00CANCIAS JUR\u00CDDICAS",
			"CI\u00CANCIAS DA SA\u00DADE", "CI\u00CANCIAS TECNOL\u00D3GICAS"}));
	comboBoxCentros.setBounds(465, 40, 212, 29);
	contentPane.add(comboBoxCentros);
	
	JLabel lblNewLabel_5 = new JLabel("Data e hora de inicio*");
	lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_5.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_5.setBounds(32, 74, 183, 23);
	contentPane.add(lblNewLabel_5);
	
	textFieldDataInicio = new JTextField();
	textFieldDataInicio.setBounds(32, 96, 186, 29);
	contentPane.add(textFieldDataInicio);
	textFieldDataInicio.setColumns(10);
	
	JLabel lblNewLabel_7 = new JLabel("Descri\u00E7\u00E3o*");
	lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_7.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_7.setBounds(33, 262, 154, 23);
	contentPane.add(lblNewLabel_7);
	
	textFieldDescricao = new JTextField();
	textFieldDescricao.setBounds(32, 283, 645, 43);
	contentPane.add(textFieldDescricao);
	textFieldDescricao.setColumns(10);
	
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
	
	JButton btnCadastrar = new JButton("Cadastrar");
	btnCadastrar.addActionListener(new ActionListener() {
		private JComboBox comboBoxTipo;

		public void actionPerformed(ActionEvent arg0) {
			ManagerCadastrarEvento.salvarDados(textFieldNome.getText(), comboBoxCentros.getSelectedIndex(),
					textFieldDataInicio.getText(), textFieldLink.getText(), textFieldDataFim.getText(),
					textFieldUrlImg.getText(), textFieldLocal.getText(), comboBoxTipo.getSelectedIndex(), textFieldDescricao.getText());
		}
	});
	btnCadastrar.setBounds(179, 367, 131, 31);
	contentPane.add(btnCadastrar);
	
	JButton btnNewButtonLimpar = new JButton("Limpar");
	btnNewButtonLimpar.setBounds(359, 367, 131, 31);
	contentPane.add(btnNewButtonLimpar);
	
	JLabel lblNewLabel = new JLabel("Link externo do evento*");
	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel.setForeground(SystemColor.controlDkShadow);
	lblNewLabel.setBounds(249, 74, 131, 23);
	contentPane.add(lblNewLabel);
	
	textFieldLink = new JTextField();
	textFieldLink.setBounds(249, 96, 428, 29);
	contentPane.add(textFieldLink);
	textFieldLink.setColumns(10);
	
	textFieldDataFim = new JTextField();
	textFieldDataFim.setColumns(10);
	textFieldDataFim.setBounds(34, 162, 186, 29);
	contentPane.add(textFieldDataFim);
	
	JLabel lblDataEHora = new JLabel("Data e hora do fim*");
	lblDataEHora.setForeground(SystemColor.controlDkShadow);
	lblDataEHora.setFont(new Font("Arial", Font.PLAIN, 11));
	lblDataEHora.setBounds(34, 140, 183, 23);
	contentPane.add(lblDataEHora);
	
	textFieldUrlImg = new JTextField();
	textFieldUrlImg.setColumns(10);
	textFieldUrlImg.setBounds(249, 162, 428, 29);
	contentPane.add(textFieldUrlImg);
	
	JLabel lblUrlDaImagem = new JLabel("Url da imagem*");
	lblUrlDaImagem.setForeground(SystemColor.controlDkShadow);
	lblUrlDaImagem.setFont(new Font("Arial", Font.PLAIN, 11));
	lblUrlDaImagem.setBounds(249, 140, 131, 23);
	contentPane.add(lblUrlDaImagem);
	
	textFieldLocal = new JTextField();
	textFieldLocal.setBounds(34, 224, 420, 29);
	contentPane.add(textFieldLocal);
	textFieldLocal.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Local*");
	lblNewLabel_1.setForeground(SystemColor.controlDkShadow);
	lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNewLabel_1.setBounds(34, 203, 82, 23);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblTipo = new JLabel("Tipo*");
	lblTipo.setForeground(SystemColor.controlDkShadow);
	lblTipo.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTipo.setBounds(465, 202, 154, 23);
	contentPane.add(lblTipo);
	
	JComboBox comboBoxTipo = new JComboBox();
	comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Escolha:", "F\u00D3RUM"}));
	comboBoxTipo.setFont(new Font("Arial", Font.PLAIN, 11));
	comboBoxTipo.setBounds(465, 224, 212, 29);
	contentPane.add(comboBoxTipo);
    }
}
