package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.PadroesDeTelas;

public class telaCadastroEstabelecimento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastroEstabelecimento frame = new telaCadastroEstabelecimento();
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
	public telaCadastroEstabelecimento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o social");
		lblRazoSocial.setBounds(11, 40, 70, 14);
		contentPane.add(lblRazoSocial);
		
		textField = new JTextField();
		textField.setBounds(75, 37, 380, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCnpjcpf = new JLabel("CNPJ/CPF");
		lblCnpjcpf.setBounds(467, 40, 61, 14);
		contentPane.add(lblCnpjcpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(525, 37, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(11, 68, 70, 14);
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(75, 65, 263, 20);
		contentPane.add(textField_2);
		
		JLabel lblN = new JLabel("Bloco");
		lblN.setBounds(347, 68, 38, 14);
		contentPane.add(lblN);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(382, 65, 57, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(480, 64, 181, 20);
		contentPane.add(textField_4);
		
		JLabel lblRef = new JLabel("Ref.");
		lblRef.setBounds(449, 68, 46, 14);
		contentPane.add(lblRef);
	}
}
