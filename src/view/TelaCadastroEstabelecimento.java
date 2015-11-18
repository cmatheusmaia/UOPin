package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.PadroesDeTelas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import dao.InseriEstabelecimento;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroEstabelecimento extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    InseriEstabelecimento InseriEstab = new InseriEstabelecimento();
    private JTextField jtfNome;
    private JTextField jtfCnpj;
    private JTextField jtfTelefone;
    private JTextField jtfRamoDeAtividade;
    private JTextField jtfEnderecoNoCampus;
    private JTextField jtfProprietario;
    private JTextField jtfHorarioDeFuncionamento;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    TelaCadastroEstabelecimento frame = new TelaCadastroEstabelecimento();
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
    public TelaCadastroEstabelecimento() {
	setVisible(true);
	setResizable(false);
	setTitle("ESTABELECIMENTO - 1.0.1");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 700, 500);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblVersao_Sistema = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	lblVersao_Sistema.setForeground(SystemColor.controlShadow);
	lblVersao_Sistema.setFont(new Font("Arial", Font.PLAIN, 10));
	lblVersao_Sistema.setBounds(238, 422, 231, 23);
	contentPane.add(lblVersao_Sistema);

	JLabel lblNome = new JLabel("Nome*");
	lblNome.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNome.setBounds(53, 59, 46, 14);
	contentPane.add(lblNome);

	JLabel lblCnpj = new JLabel("CNPJ*");
	lblCnpj.setFont(new Font("Arial", Font.PLAIN, 11));
	lblCnpj.setBounds(53, 119, 46, 14);
	contentPane.add(lblCnpj);

	JLabel lblTelefone = new JLabel("Telefone");
	lblTelefone.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTelefone.setBounds(53, 179, 46, 14);
	contentPane.add(lblTelefone);

	JLabel lblRamoDeAtividade = new JLabel("Ramo de Atividade*");
	lblRamoDeAtividade.setFont(new Font("Arial", Font.PLAIN, 11));
	lblRamoDeAtividade.setBounds(376, 59, 97, 14);
	contentPane.add(lblRamoDeAtividade);

	JLabel lblEnderecoNoCampus = new JLabel("Endere\u00E7o no Campus*");
	lblEnderecoNoCampus.setFont(new Font("Arial", Font.PLAIN, 11));
	lblEnderecoNoCampus.setBounds(376, 179, 112, 14);
	contentPane.add(lblEnderecoNoCampus);

	JLabel lblProprietario = new JLabel("Propriet\u00E1rio*");
	lblProprietario.setFont(new Font("Arial", Font.PLAIN, 11));
	lblProprietario.setBounds(376, 119, 60, 14);
	contentPane.add(lblProprietario);

	JLabel lblHorarioDeFuncionamento = new JLabel("Hor\u00E1rio de \r\nFuncionamento");
	lblHorarioDeFuncionamento.setFont(new Font("Arial", Font.PLAIN, 11));
	lblHorarioDeFuncionamento.setBounds(53, 239, 126, 14);
	contentPane.add(lblHorarioDeFuncionamento);

	jtfNome = new JTextField();
	jtfNome.setColumns(10);
	jtfNome.setBounds(53, 84, 275, 24);
	contentPane.add(jtfNome);

	jtfCnpj = new JTextField();
	jtfCnpj.setColumns(10);
	jtfCnpj.setBounds(53, 144, 275, 24);
	contentPane.add(jtfCnpj);

	jtfTelefone = new JTextField();
	jtfTelefone.setColumns(10);
	jtfTelefone.setBounds(53, 204, 275, 24);
	contentPane.add(jtfTelefone);

	jtfRamoDeAtividade = new JTextField();
	jtfRamoDeAtividade.setColumns(10);
	jtfRamoDeAtividade.setBounds(376, 84, 275, 24);
	contentPane.add(jtfRamoDeAtividade);

	jtfEnderecoNoCampus = new JTextField();
	jtfEnderecoNoCampus.setColumns(10);
	jtfEnderecoNoCampus.setBounds(376, 204, 275, 24);
	contentPane.add(jtfEnderecoNoCampus);

	jtfProprietario = new JTextField();
	jtfProprietario.setColumns(10);
	jtfProprietario.setBounds(376, 144, 275, 24);
	contentPane.add(jtfProprietario);

	jtfHorarioDeFuncionamento = new JTextField();
	jtfHorarioDeFuncionamento.setColumns(10);
	jtfHorarioDeFuncionamento.setBounds(53, 264, 275, 24);
	contentPane.add(jtfHorarioDeFuncionamento);

	JLabel lblCamposObrigatorios = new JLabel("* Campos obrigat\u00F3rios");
	lblCamposObrigatorios.setForeground(SystemColor.controlShadow);
	lblCamposObrigatorios.setFont(new Font("Arial", Font.PLAIN, 10));
	lblCamposObrigatorios.setBounds(53, 364, 237, 23);
	contentPane.add(lblCamposObrigatorios);

	JButton btnCadastrar = new JButton("CADASTRAR");
	btnCadastrar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		String nome = jtfNome.getText();
		String cnpj = jtfCnpj.getText();
		String telefone = jtfTelefone.getText();
		String ramodeatividade = jtfRamoDeAtividade.getText();
		String endereconocampus = jtfEnderecoNoCampus.getText();
		String proprietario = jtfProprietario.getText();
		String horariodefuncionamento = jtfHorarioDeFuncionamento.getText();

		InseriEstabelecimento.InsereDados(nome, cnpj, telefone, ramodeatividade, endereconocampus, proprietario,
			horariodefuncionamento);
	    }

	});
	btnCadastrar.setBounds(222, 330, 106, 23);
	contentPane.add(btnCadastrar);

	JButton btnLimpar = new JButton("LIMPAR");
	btnLimpar.addActionListener(new ActionListener() {
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

	btnLimpar.setBounds(352, 330, 106, 23);
	contentPane.add(btnLimpar);
    }

}
