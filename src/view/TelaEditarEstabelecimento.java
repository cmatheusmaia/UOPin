package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import negocio.PadroesDeTelas;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import negocio.PadroesDeTelas;
import dao.InseriEstabelecimento;
import sistema.bean.EstabelecimentoBean;
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
import javax.swing.JTextField;
import javax.swing.JButton;


public class TelaEditarEstabelecimento extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField jtfNome;
    private JTextField jtfCnpj;
    private JTextField jtfTelefone;
    private JTextField jtfRamoDeAtividade;
    private JTextField jtfEnderecoNoCampus;
    private JTextField jtfProprietario;
    private JTextField jtfHorarioDeFuncionamento;

    InseriEstabelecimento InsereDados = new InseriEstabelecimento();
    EstabelecimentoBean EstBin = new EstabelecimentoBean();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    TelaEditarEstabelecimento frame = new TelaEditarEstabelecimento();
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
    public TelaEditarEstabelecimento() {
	setTitle("EDITAR ESTABELECIMENTO - 1.0.1");
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblVersaoDoSistema = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	lblVersaoDoSistema.setForeground(SystemColor.controlShadow);
	lblVersaoDoSistema.setFont(new Font("Arial", Font.PLAIN, 10));
	lblVersaoDoSistema.setBounds(236, 437, 231, 23);
	contentPane.add(lblVersaoDoSistema);

	JLabel lblNome = new JLabel("Nome*");
	lblNome.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNome.setBounds(51, 74, 46, 14);
	contentPane.add(lblNome);

	JLabel lblCnpj = new JLabel("CNPJ*");
	lblCnpj.setFont(new Font("Arial", Font.PLAIN, 11));
	lblCnpj.setBounds(51, 134, 46, 14);
	contentPane.add(lblCnpj);

	JLabel lblTelefone = new JLabel("Telefone");
	lblTelefone.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTelefone.setBounds(51, 194, 46, 14);
	contentPane.add(lblTelefone);

	JLabel lblRamoDeAtividade = new JLabel("Ramo de Atividade*");
	lblRamoDeAtividade.setFont(new Font("Arial", Font.PLAIN, 11));
	lblRamoDeAtividade.setBounds(374, 74, 97, 14);
	contentPane.add(lblRamoDeAtividade);

	JLabel lblEnderecoNoCampus = new JLabel("Endere\u00E7o no Campus*");
	lblEnderecoNoCampus.setFont(new Font("Arial", Font.PLAIN, 11));
	lblEnderecoNoCampus.setBounds(374, 194, 112, 14);
	contentPane.add(lblEnderecoNoCampus);

	JLabel lblProprietario = new JLabel("Propriet\u00E1rio*");
	lblProprietario.setFont(new Font("Arial", Font.PLAIN, 11));
	lblProprietario.setBounds(374, 134, 60, 14);
	contentPane.add(lblProprietario);

	JLabel lblHorarioDeFuncionamento = new JLabel("Hor\u00E1rio de \r\nFuncionamento");
	lblHorarioDeFuncionamento.setFont(new Font("Arial", Font.PLAIN, 11));
	lblHorarioDeFuncionamento.setBounds(51, 254, 126, 14);
	contentPane.add(lblHorarioDeFuncionamento);

	jtfNome = new JTextField();
	jtfNome.setColumns(10);
	jtfNome.setBounds(51, 99, 275, 24);
	contentPane.add(jtfNome);

	jtfCnpj = new JTextField();
	jtfCnpj.setColumns(10);
	jtfCnpj.setBounds(51, 159, 275, 24);
	contentPane.add(jtfCnpj);

	jtfTelefone = new JTextField();
	jtfTelefone.setColumns(10);
	jtfTelefone.setBounds(51, 219, 275, 24);
	contentPane.add(jtfTelefone);

	jtfRamoDeAtividade = new JTextField();
	jtfRamoDeAtividade.setColumns(10);
	jtfRamoDeAtividade.setBounds(374, 99, 275, 24);
	contentPane.add(jtfRamoDeAtividade);

	jtfEnderecoNoCampus = new JTextField();
	jtfEnderecoNoCampus.setColumns(10);
	jtfEnderecoNoCampus.setBounds(374, 219, 275, 24);
	contentPane.add(jtfEnderecoNoCampus);

	jtfProprietario = new JTextField();
	jtfProprietario.setColumns(10);
	jtfProprietario.setBounds(374, 159, 275, 24);
	contentPane.add(jtfProprietario);

	jtfHorarioDeFuncionamento = new JTextField();
	jtfHorarioDeFuncionamento.setColumns(10);
	jtfHorarioDeFuncionamento.setBounds(51, 279, 275, 24);
	contentPane.add(jtfHorarioDeFuncionamento);

	JLabel lblCamposObrigatorios = new JLabel("* Campos obrigat\u00F3rios");
	lblCamposObrigatorios.setForeground(SystemColor.controlShadow);
	lblCamposObrigatorios.setFont(new Font("Arial", Font.PLAIN, 10));
	lblCamposObrigatorios.setBounds(51, 379, 237, 23);
	contentPane.add(lblCamposObrigatorios);

	JButton btnAlterar = new JButton("ATUALIZAR");
	btnAlterar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
	    }
	});
	btnAlterar.setBounds(190, 345, 106, 23);
	contentPane.add(btnAlterar);

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
	btnLimpar.setBounds(380, 345, 106, 23);
	contentPane.add(btnLimpar);

	JLabel lblSelecionarEstabelecimento = new JLabel("Selecionar Estabelecimento:");
	lblSelecionarEstabelecimento.setForeground(SystemColor.controlDkShadow);
	lblSelecionarEstabelecimento.setFont(new Font("Arial", Font.PLAIN, 11));
	lblSelecionarEstabelecimento.setBounds(158, 34, 136, 23);
	contentPane.add(lblSelecionarEstabelecimento);

	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		int codigo = Integer
			.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do Estabelecimento: "));
		InseriEstabelecimento.BuscarDados(codigo, EstBin);
		jtfNome.setText(EstBin.getNome());
		jtfCnpj.setText(EstBin.getCnpj());
		jtfTelefone.setText(EstBin.getTelefone());
		jtfRamoDeAtividade.setText(EstBin.getRamodeatividade());
		jtfEnderecoNoCampus.setText(EstBin.getEndereconocampus());
		jtfProprietario.setText(EstBin.getProprietario());
		jtfHorarioDeFuncionamento.setText(EstBin.getHorariodefuncionamento());
	    }
	});
	btnBuscar.setBounds(303, 34, 106, 23);
	contentPane.add(btnBuscar);

	JMenuBar menuBar = new JMenuBar();
	menuBar.setBounds(0, 0, 694, 21);
	contentPane.add(menuBar);

	JMenu menu = new JMenu("Ajuda");
	menuBar.add(menu);

	JMenuItem menuItem = new JMenuItem("O que mudou?");
	menu.add(menuItem);
    }
}
