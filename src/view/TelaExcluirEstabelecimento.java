package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import dao.InseriEstabelecimento;
import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.ManagerExcluirEstabelecimento;
import sistema.bean.EstabelecimentoBean;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class TelaExcluirEstabelecimento extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	protected static final EstabelecimentoBean EstBin = null;
	protected static final JButton btnLimpar = null;
    private JPanel contentPane;
    private JTextField jtfNome;
    private JTextField jtfCnpj;
    private JTextField jtfTelefone;
    private JTextField jtfRamoDeAtividade;
    private JTextField jtfEnderecoNoCampus;
    private JTextField jtfProprietario;
    private JTextField jtfHorarioDeFuncionamento;
	protected EstabelecimentoBean estabelecimentobean;
	protected InseriEstabelecimento insereEstabelecimento;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    TelaExcluirEstabelecimento frame = new TelaExcluirEstabelecimento();
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
    public TelaExcluirEstabelecimento() {
	setTitle("EXCLUIR ESTABELECIMENTO - 1.0.1");
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnAjuda = new JMenu("Ajuda");
	mnAjuda.setIcon(new ImageIcon(TelaExcluirEstabelecimento.class.getResource("/img/Info.png")));
	menuBar.add(mnAjuda);
	
	JMenuItem mntmOQueMudou = new JMenuItem("O que mudou?");
	mntmOQueMudou.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (ControleDeAcesso.administrador())
			    ChamarTelas.abrir(new TelaSobreSistema());
		}
	});
	mnAjuda.add(mntmOQueMudou);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblVersaoDoSistema = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	lblVersaoDoSistema.setForeground(SystemColor.controlShadow);
	lblVersaoDoSistema.setFont(new Font("Arial", Font.PLAIN, 10));
	lblVersaoDoSistema.setBounds(237, 427, 231, 23);
	contentPane.add(lblVersaoDoSistema);

	JLabel lblNome = new JLabel("Nome*");
	lblNome.setFont(new Font("Arial", Font.PLAIN, 11));
	lblNome.setBounds(52, 64, 46, 14);
	contentPane.add(lblNome);

	JLabel lblCnpj = new JLabel("CNPJ*");
	lblCnpj.setFont(new Font("Arial", Font.PLAIN, 11));
	lblCnpj.setBounds(52, 124, 46, 14);
	contentPane.add(lblCnpj);

	JLabel lblTelefone = new JLabel("Telefone");
	lblTelefone.setFont(new Font("Arial", Font.PLAIN, 11));
	lblTelefone.setBounds(52, 184, 46, 14);
	contentPane.add(lblTelefone);

	JLabel lblRamoDeAtividade = new JLabel("Ramo de Atividade*");
	lblRamoDeAtividade.setFont(new Font("Arial", Font.PLAIN, 11));
	lblRamoDeAtividade.setBounds(375, 64, 97, 14);
	contentPane.add(lblRamoDeAtividade);

	JLabel lblEnderecoNoCampus = new JLabel("Endere\u00E7o no Campus*");
	lblEnderecoNoCampus.setFont(new Font("Arial", Font.PLAIN, 11));
	lblEnderecoNoCampus.setBounds(375, 184, 112, 14);
	contentPane.add(lblEnderecoNoCampus);

	JLabel lblProprietario = new JLabel("Propriet\u00E1rio*");
	lblProprietario.setFont(new Font("Arial", Font.PLAIN, 11));
	lblProprietario.setBounds(375, 124, 60, 14);
	contentPane.add(lblProprietario);

	JLabel lblHorarioDeFuncionamento = new JLabel("Hor\u00E1rio de \r\nFuncionamento");
	lblHorarioDeFuncionamento.setFont(new Font("Arial", Font.PLAIN, 11));
	lblHorarioDeFuncionamento.setBounds(52, 244, 126, 14);
	contentPane.add(lblHorarioDeFuncionamento);

	jtfNome = new JTextField();
	jtfNome.setColumns(10);
	jtfNome.setBounds(52, 89, 275, 24);
	contentPane.add(jtfNome);

	jtfCnpj = new JTextField();
	jtfCnpj.setColumns(10);
	jtfCnpj.setBounds(52, 149, 275, 24);
	contentPane.add(jtfCnpj);

	jtfTelefone = new JTextField();
	jtfTelefone.setColumns(10);
	jtfTelefone.setBounds(52, 209, 275, 24);
	contentPane.add(jtfTelefone);

	jtfRamoDeAtividade = new JTextField();
	jtfRamoDeAtividade.setColumns(10);
	jtfRamoDeAtividade.setBounds(375, 89, 275, 24);
	contentPane.add(jtfRamoDeAtividade);

	jtfEnderecoNoCampus = new JTextField();
	jtfEnderecoNoCampus.setColumns(10);
	jtfEnderecoNoCampus.setBounds(375, 209, 275, 24);
	contentPane.add(jtfEnderecoNoCampus);

	jtfProprietario = new JTextField();
	jtfProprietario.setColumns(10);
	jtfProprietario.setBounds(375, 149, 275, 24);
	contentPane.add(jtfProprietario);

	jtfHorarioDeFuncionamento = new JTextField();
	jtfHorarioDeFuncionamento.setColumns(10);
	jtfHorarioDeFuncionamento.setBounds(52, 269, 275, 24);
	contentPane.add(jtfHorarioDeFuncionamento);

	JLabel lblCamposObrigatorios = new JLabel("* Campos obrigat\u00F3rios");
	lblCamposObrigatorios.setForeground(SystemColor.controlShadow);
	lblCamposObrigatorios.setFont(new Font("Arial", Font.PLAIN, 10));
	lblCamposObrigatorios.setBounds(52, 369, 237, 23);
	contentPane.add(lblCamposObrigatorios);

	JButton btnExcluirCadastro = new JButton("EXCLUIR CADASTRO");
	btnExcluirCadastro.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
			estabelecimentobean.setNome(jtfNome.getText());
	    	estabelecimentobean.setCnpj(jtfCnpj.getText());
	    	estabelecimentobean.setTelefone(jtfTelefone.getText());
	    	estabelecimentobean.setRamodeatividade(jtfRamoDeAtividade.getText());
	    	estabelecimentobean.setEndereconocampus(jtfEnderecoNoCampus.getText());
	    	estabelecimentobean.setProprietario(jtfProprietario.getText());
	    	estabelecimentobean.setHorariodefuncionamento(jtfHorarioDeFuncionamento.getText());
	    	
	    	EstabelecimentoBean.excluirDadosEst(estabelecimentobean.getIdEstabelecimento());
	    	ManagerExcluirEstabelecimento.limparDadosEst(estabelecimentobean, jtfNome, jtfCnpj, jtfTelefone, jtfRamoDeAtividade,
					jtfEnderecoNoCampus, jtfProprietario, jtfHorarioDeFuncionamento);
			estabelecimentobean=null;
		    }
		});
	btnExcluirCadastro.setBounds(183, 335, 179, 23);
	contentPane.add(btnExcluirCadastro);
	
	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String nomeEstabelecimento = JOptionPane.showInputDialog(null, "Digite o nome do estabelecimento ");
			InseriEstabelecimento.BuscarDados(nomeEstabelecimento, EstBin);
			jtfNome.setText(EstBin.getNome());
			jtfCnpj.setText(EstBin.getCnpj());
			jtfTelefone.setText(EstBin.getTelefone());
			jtfRamoDeAtividade.setText(EstBin.getRamodeatividade());
			jtfEnderecoNoCampus.setText(EstBin.getEndereconocampus());
			jtfProprietario.setText(EstBin.getProprietario());
			jtfHorarioDeFuncionamento.setText(EstBin.getHorariodefuncionamento());
		    }
	});

	btnBuscar.setBounds(300, 24, 106, 23);
	contentPane.add(btnBuscar);
	
	JLabel lblSelecionarEstabelecimento = new JLabel("Selecionar Estabelecimento:");
	lblSelecionarEstabelecimento.setForeground(SystemColor.controlDkShadow);
	lblSelecionarEstabelecimento.setFont(new Font("Arial", Font.PLAIN, 11));
	lblSelecionarEstabelecimento.setBounds(141, 24, 136, 23);
	contentPane.add(lblSelecionarEstabelecimento);
	
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
	btnLimpar.setBounds(400, 335, 106, 23);
	contentPane.add(btnLimpar);
    }
}
