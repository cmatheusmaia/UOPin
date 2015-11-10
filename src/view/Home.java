package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import negocio.ChamarTelas;
import negocio.ControleDeAcesso;
import negocio.ManagerSairDoSistema;

import java.awt.Font;
import java.awt.Point;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

    private JFrame frmUniforFerramenta;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Home window = new Home();
		    window.frmUniforFerramenta.setVisible(true);
		    window.frmUniforFerramenta.setLocationRelativeTo(null);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Home() {
	initComponents();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initComponents() {

	frmUniforFerramenta = new JFrame();
	frmUniforFerramenta.setResizable(false);
	frmUniforFerramenta
		.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/img/unifor_logo.png")));
	frmUniforFerramenta.setTitle("UNIFOR - FERRAMENTA DE GEST\u00C3O - 1.0.1");
	frmUniforFerramenta.getContentPane().setBackground(Color.WHITE);
	frmUniforFerramenta.setBounds(100, 100, 700, 500);
	frmUniforFerramenta.setLocationRelativeTo(null);
	frmUniforFerramenta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmUniforFerramenta.getContentPane().setLayout(null);
	frmUniforFerramenta.setVisible(true);

	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/img/uniforGray.png")));
	lblNewLabel.setBounds(222, 95, 280, 251);
	frmUniforFerramenta.getContentPane().add(lblNewLabel);

	JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	label.setForeground(SystemColor.controlShadow);
	label.setFont(new Font("Arial", Font.PLAIN, 10));
	label.setBounds(250, 417, 231, 23);
	frmUniforFerramenta.getContentPane().add(label);

	JMenuBar menuBar = new JMenuBar();
	frmUniforFerramenta.setJMenuBar(menuBar);

	JMenu mnNewMenu = new JMenu("Arquivo");
	mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu.setIcon(new ImageIcon(Home.class.getResource("/img/Download.png")));
	menuBar.add(mnNewMenu);

	JMenuItem mntmSair = new JMenuItem("Sair");
	mntmSair.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		ManagerSairDoSistema.sair();
	    }
	});
	mntmSair.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSair.setIcon(new ImageIcon(Home.class.getResource("/img/Exit.png")));
	mnNewMenu.add(mntmSair);

	JMenu mnNewMenu_1 = new JMenu("Cadastro");
	mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_1.setIcon(new ImageIcon(Home.class.getResource("/img/Create.png")));
	menuBar.add(mnNewMenu_1);

	JMenu mnEstabelecimento = new JMenu("Estabelecimento");
	mnEstabelecimento.setFont(new Font("Arial", Font.PLAIN, 12));
	mnEstabelecimento.setIcon(new ImageIcon(Home.class.getResource("/img/Company.png")));
	mnNewMenu_1.add(mnEstabelecimento);

	JMenuItem mntmEstabelecimentoAdicionar = new JMenuItem("Adicionar");
	mntmEstabelecimentoAdicionar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.empresarioEAdministrador())
		    ChamarTelas.abrir(new TelaCadastroEstabelecimento());
	    }
	});
	mntmEstabelecimentoAdicionar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEstabelecimentoAdicionar.setIcon(new ImageIcon(Home.class.getResource("/img/Create.png")));
	mnEstabelecimento.add(mntmEstabelecimentoAdicionar);

	JMenuItem mntmEstabelecimentoEditar = new JMenuItem("Editar");
	mntmEstabelecimentoEditar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.empresarioEAdministrador())
		    ChamarTelas.abrir(new TelaEditarEstabelecimento());

	    }
	});
	mntmEstabelecimentoEditar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEstabelecimentoEditar.setIcon(new ImageIcon(Home.class.getResource("/img/Redo.png")));
	mnEstabelecimento.add(mntmEstabelecimentoEditar);

	JMenuItem mntmEstabelecimentoExcluir = new JMenuItem("Excluir");
	mntmEstabelecimentoExcluir.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.administrador())
		    ChamarTelas.abrir(new TelaExcluirEstabelecimento());
	    }
	});
	mntmEstabelecimentoExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEstabelecimentoExcluir.setIcon(new ImageIcon(Home.class.getResource("/img/Company.png")));
	mnEstabelecimento.add(mntmEstabelecimentoExcluir);

	JMenu mnEvento = new JMenu("Evento");
	mnEvento.setFont(new Font("Arial", Font.PLAIN, 12));
	mnEvento.setIcon(new ImageIcon(Home.class.getResource("/img/History.png")));
	mnNewMenu_1.add(mnEvento);

	JMenuItem mntmEventoAdcionar = new JMenuItem("Adcionar");
	mntmEventoAdcionar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaCadastroEvento());
	    }
	});
	mntmEventoAdcionar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEventoAdcionar.setIcon(new ImageIcon(Home.class.getResource("/img/Create.png")));
	mnEvento.add(mntmEventoAdcionar);

	JMenuItem mntmEventoEditar = new JMenuItem("Editar");
	mntmEventoEditar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaEditarEvento());
	    }
	});
	mntmEventoEditar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEventoEditar.setIcon(new ImageIcon(Home.class.getResource("/img/Redo.png")));
	mnEvento.add(mntmEventoEditar);

	JMenuItem mntmEventoExcluir = new JMenuItem("Excluir");
	mntmEventoExcluir.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.empresarioEAdministrador())
		    ChamarTelas.abrir(new TelaExcluirEvento());
	    }
	});
	mntmEventoExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEventoExcluir.setIcon(new ImageIcon(Home.class.getResource("/img/Delete.png")));
	mnEvento.add(mntmEventoExcluir);

	JMenu mnUsuario = new JMenu("Usu\u00E1rio");
	mnUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
	mnUsuario.setIcon(new ImageIcon(Home.class.getResource("/img/People.png")));
	mnNewMenu_1.add(mnUsuario);

	JMenuItem mntmUsuarioAdicionar = new JMenuItem("Adicionar");
	mntmUsuarioAdicionar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.administrador())
		    ChamarTelas.abrir(new TelaCadastroUsuario());
	    }
	});
	mntmUsuarioAdicionar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmUsuarioAdicionar.setIcon(new ImageIcon(Home.class.getResource("/img/Create.png")));
	mnUsuario.add(mntmUsuarioAdicionar);

	JMenuItem mntmUsuarioEditar = new JMenuItem("Editar");
	mntmUsuarioEditar.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.administrador())
		    ChamarTelas.abrir(new TelaEditarUsuario());
	    }
	});
	mntmUsuarioEditar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmUsuarioEditar.setIcon(new ImageIcon(Home.class.getResource("/img/Redo.png")));
	mnUsuario.add(mntmUsuarioEditar);

	JMenuItem mntmUsuarioExcluir = new JMenuItem("Excluir");
	mntmUsuarioExcluir.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.administrador())
		    ChamarTelas.abrir(new TelaExcluirUsuario());
	    }
	});
	mntmUsuarioExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmUsuarioExcluir.setIcon(new ImageIcon(Home.class.getResource("/img/Delete.png")));
	mnUsuario.add(mntmUsuarioExcluir);

	JMenu mnNewMenu_2 = new JMenu("Relat\u00F3rio");
	mnNewMenu_2.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_2.setIcon(new ImageIcon(Home.class.getResource("/img/Text_preview.png")));
	menuBar.add(mnNewMenu_2);

	JMenuItem mntmRelatorioUltimosEventosRealizados = new JMenuItem("\u00DAltimos eventos realizados");
	mntmRelatorioUltimosEventosRealizados.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaRelEventosRealizados());
	    }
	});
	mntmRelatorioUltimosEventosRealizados.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmRelatorioUltimosEventosRealizados.setIcon(new ImageIcon(Home.class.getResource("/img/Text_preview.png")));
	mnNewMenu_2.add(mntmRelatorioUltimosEventosRealizados);

	JMenuItem mntmRelatorioUltimosEventosUsuariosCadastrados = new JMenuItem("Usu\u00E1rios cadastrados");
	mntmRelatorioUltimosEventosUsuariosCadastrados.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.administrador())
		    ChamarTelas.abrir(new TelaRelUsuariosCadastros());
	    }
	});
	mntmRelatorioUltimosEventosUsuariosCadastrados.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmRelatorioUltimosEventosUsuariosCadastrados
		.setIcon(new ImageIcon(Home.class.getResource("/img/Text_preview.png")));
	mnNewMenu_2.add(mntmRelatorioUltimosEventosUsuariosCadastrados);

	JMenu mnNewMenu_3 = new JMenu("Sobre");
	mnNewMenu_3.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_3.setIcon(new ImageIcon(Home.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu_3);

	JMenuItem mntmSobreUniforOnline = new JMenuItem("Unifor Online");
	mntmSobreUniforOnline.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaSobreUnifor());
	    }
	});
	mntmSobreUniforOnline.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSobreUniforOnline.setIcon(new ImageIcon(Home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmSobreUniforOnline);

	JMenuItem mntmSobreOSistema = new JMenuItem("Sobre o sistema");
	mntmSobreOSistema.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaSobreSistema());
	    }
	});
	mntmSobreOSistema.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSobreOSistema.setIcon(new ImageIcon(Home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmSobreOSistema);

	JMenuItem mntmSobreVersao = new JMenuItem("Vers\u00E3o");
	mntmSobreVersao.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		if (ControleDeAcesso.funcionarioEmpresarioEAdministrador())
		    ChamarTelas.abrir(new TelaVersao());
	    }
	});
	mntmSobreVersao.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSobreVersao.setIcon(new ImageIcon(Home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmSobreVersao);
    }

}
