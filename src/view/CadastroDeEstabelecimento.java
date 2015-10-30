package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import dao.InseriEstabelecimento;
import negocio.PadroesDeTelas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CadastroDeEstabelecimento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfNome;
	private JTextField jtfCnpj;
	private JTextField jtfTelefone;
	private JTextField jtfRamoDeAtividade;
	private JTextField jtfEnderecoNoCampus;
	private JTextField jtfProprietario;
	private JTextField jtfHorarioDeFuncionamento;
	
	InseriEstabelecimento InseriEstab = new InseriEstabelecimento();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeEstabelecimento frame = new CadastroDeEstabelecimento();
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
	public CadastroDeEstabelecimento() {
	    	PadroesDeTelas.definir(this);
		setTitle("ESTABELECIMENTO - 1.0.1");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeEstabelecimento = new JLabel("CADASTRO DE ESTABELECIMENTO");
		lblCadastroDeEstabelecimento.setFont(new Font("Arial", Font.BOLD, 14));
		lblCadastroDeEstabelecimento.setBounds(108, 29, 245, 14);
		contentPane.add(lblCadastroDeEstabelecimento);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(10, 68, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(10, 95, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setBounds(10, 120, 64, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblRamoDeAtividade = new JLabel("RAMO DE ATIVIDADE:");
		lblRamoDeAtividade.setBounds(10, 145, 129, 14);
		contentPane.add(lblRamoDeAtividade);
		
		JLabel lblEnderecoNoCampus = new JLabel("ENDERE\u00C7O NO CAMPUS:");
		lblEnderecoNoCampus.setBounds(10, 170, 141, 14);
		contentPane.add(lblEnderecoNoCampus);
		
		JLabel lblProprietrio = new JLabel("PROPRIETARIO:");
		lblProprietrio.setBounds(10, 195, 95, 14);
		contentPane.add(lblProprietrio);
		
		JLabel lblHorrioDeFuncionamento = new JLabel("HORARIO DE FUNCIONAMENTO:");
		lblHorrioDeFuncionamento.setBounds(10, 220, 182, 14);
		contentPane.add(lblHorrioDeFuncionamento);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(66, 65, 255, 20);
		contentPane.add(jtfNome);
		jtfNome.setColumns(10);
		
		jtfCnpj = new JTextField();
		jtfCnpj.setColumns(10);
		jtfCnpj.setBounds(66, 92, 255, 20);
		contentPane.add(jtfCnpj);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setColumns(10);
		jtfTelefone.setBounds(86, 117, 255, 20);
		contentPane.add(jtfTelefone);
		
		jtfRamoDeAtividade = new JTextField();
		jtfRamoDeAtividade.setColumns(10);
		jtfRamoDeAtividade.setBounds(142, 142, 255, 20);
		contentPane.add(jtfRamoDeAtividade);
		
		jtfEnderecoNoCampus = new JTextField();
		jtfEnderecoNoCampus.setColumns(10);
		jtfEnderecoNoCampus.setBounds(152, 167, 255, 20);
		contentPane.add(jtfEnderecoNoCampus);
		
		jtfProprietario = new JTextField();
		jtfProprietario.setColumns(10);
		jtfProprietario.setBounds(115, 192, 255, 20);
		contentPane.add(jtfProprietario);
		
		jtfHorarioDeFuncionamento = new JTextField();
		jtfHorarioDeFuncionamento.setColumns(10);
		jtfHorarioDeFuncionamento.setBounds(191, 217, 255, 20);
		contentPane.add(jtfHorarioDeFuncionamento);
		
		JButton btnCADASTRAR = new JButton("CADASTRAR");
		btnCADASTRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = jtfNome.getText();
				String cnpj = jtfCnpj.getText();
				String telefone = jtfTelefone.getText();
				String ramodeatividade = jtfRamoDeAtividade.getText();
				String endereconocampus = jtfEnderecoNoCampus.getText();
				String proprietario = jtfProprietario.getText();
				String horariodefuncionamento = jtfHorarioDeFuncionamento.getText();
				
				InseriEstabelecimento.InsereDados (nome,cnpj,telefone,ramodeatividade,endereconocampus,proprietario,horariodefuncionamento);
			}


		});
		btnCADASTRAR.setBounds(109, 262, 106, 23);
		contentPane.add(btnCADASTRAR);
		
		JButton btnLIMPAR = new JButton("LIMPAR");
		btnLIMPAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfNome.setText("");
				jtfCnpj.setText("");
				jtfTelefone.setText("");
				jtfRamoDeAtividade.setText("");
				jtfEnderecoNoCampus.setText("");
				jtfProprietario.setText("");
				jtfHorarioDeFuncionamento.setText("");
				
			}
		});
		btnLIMPAR.setBounds(281, 262, 89, 23);
		contentPane.add(btnLIMPAR);
	}
}
