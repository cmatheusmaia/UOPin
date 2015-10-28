package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home{

    private JFrame frmUnfiorFerramenta;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    home window = new home();
		    window.frmUnfiorFerramenta.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public home() {
	initComponents();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initComponents() {

	frmUnfiorFerramenta = new JFrame();
	frmUnfiorFerramenta.setVisible(true);
	frmUnfiorFerramenta.setResizable(false);
	frmUnfiorFerramenta.setIconImage(Toolkit.getDefaultToolkit().getImage(home.class.getResource("/img/unifor_logo.png")));
	frmUnfiorFerramenta.setTitle("UNIFOR - FERRAMENTA DE GEST\u00C3O - 1.0.1");
	frmUnfiorFerramenta.getContentPane().setBackground(Color.WHITE);
	frmUnfiorFerramenta.setBounds(100, 100, 761, 501);
	frmUnfiorFerramenta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frmUnfiorFerramenta.getContentPane().setLayout(null);

	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon(home.class.getResource("/img/uniforGray.png")));
	lblNewLabel.setBounds(228, 95, 280, 251);
	frmUnfiorFerramenta.getContentPane().add(lblNewLabel);

	JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
	label.setForeground(SystemColor.controlShadow);
	label.setFont(new Font("Arial", Font.PLAIN, 10));
	label.setBounds(256, 417, 231, 23);
	frmUnfiorFerramenta.getContentPane().add(label);

	JMenuBar menuBar = new JMenuBar();
	frmUnfiorFerramenta.setJMenuBar(menuBar);

	JMenu mnNewMenu = new JMenu("Arquivo");
	mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu.setIcon(new ImageIcon(home.class.getResource("/img/Download.png")));
	menuBar.add(mnNewMenu);

	JMenuItem mntmSair = new JMenuItem("Sair");
	mntmSair.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			negocio.sairdoSistema.sair();
		}
	});
	mntmSair.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSair.setIcon(new ImageIcon(home.class.getResource("/img/Exit.png")));
	mnNewMenu.add(mntmSair);

	JMenu mnNewMenu_1 = new JMenu("Cadastro");
	mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_1.setIcon(new ImageIcon(home.class.getResource("/img/Create.png")));
	menuBar.add(mnNewMenu_1);

	JMenu mnEstabelecimento = new JMenu("Estabelecimento");
	mnEstabelecimento.setFont(new Font("Arial", Font.PLAIN, 12));
	mnEstabelecimento.setIcon(new ImageIcon(home.class.getResource("/img/Company.png")));
	mnNewMenu_1.add(mnEstabelecimento);

	JMenuItem mntmAdicionar_1 = new JMenuItem("Adicionar");
	mntmAdicionar_1.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmAdicionar_1.setIcon(new ImageIcon(home.class.getResource("/img/Create.png")));
	mnEstabelecimento.add(mntmAdicionar_1);

	JMenuItem mntmEditar_2 = new JMenuItem("Editar");
	mntmEditar_2.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEditar_2.setIcon(new ImageIcon(home.class.getResource("/img/Redo.png")));
	mnEstabelecimento.add(mntmEditar_2);

	JMenuItem mntmExcluir_2 = new JMenuItem("Excluir");
	mntmExcluir_2.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmExcluir_2.setIcon(new ImageIcon(home.class.getResource("/img/Company.png")));
	mnEstabelecimento.add(mntmExcluir_2);

	JMenu mnEvento = new JMenu("Evento");
	mnEvento.setFont(new Font("Arial", Font.PLAIN, 12));
	mnEvento.setIcon(new ImageIcon(home.class.getResource("/img/History.png")));
	mnNewMenu_1.add(mnEvento);

	JMenuItem mntmAdcionar = new JMenuItem("Adcionar");
	mntmAdcionar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    negocio.managerCadastrarEvento.chamarRotina(null);
		}
	});
	mntmAdcionar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmAdcionar.setIcon(new ImageIcon(home.class.getResource("/img/Create.png")));
	mnEvento.add(mntmAdcionar);

	JMenuItem mntmEditar_1 = new JMenuItem("Editar");
	mntmEditar_1.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEditar_1.setIcon(new ImageIcon(home.class.getResource("/img/Redo.png")));
	mnEvento.add(mntmEditar_1);

	JMenuItem mntmExcluir_1 = new JMenuItem("Excluir");
	mntmExcluir_1.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmExcluir_1.setIcon(new ImageIcon(home.class.getResource("/img/Delete.png")));
	mnEvento.add(mntmExcluir_1);

	JMenu mnUsurio = new JMenu("Usu\u00E1rio");
	mnUsurio.setFont(new Font("Arial", Font.PLAIN, 12));
	mnUsurio.setIcon(new ImageIcon(home.class.getResource("/img/People.png")));
	mnNewMenu_1.add(mnUsurio);

	JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
	mntmAdicionar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmAdicionar.setIcon(new ImageIcon(home.class.getResource("/img/Create.png")));
	mnUsurio.add(mntmAdicionar);

	JMenuItem mntmEditar = new JMenuItem("Editar");
	mntmEditar.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmEditar.setIcon(new ImageIcon(home.class.getResource("/img/Redo.png")));
	mnUsurio.add(mntmEditar);

	JMenuItem mntmExcluir = new JMenuItem("Excluir");
	mntmExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmExcluir.setIcon(new ImageIcon(home.class.getResource("/img/Delete.png")));
	mnUsurio.add(mntmExcluir);

	JMenu mnNewMenu_2 = new JMenu("Relat\u00F3rio");
	mnNewMenu_2.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_2.setIcon(new ImageIcon(home.class.getResource("/img/Text_preview.png")));
	menuBar.add(mnNewMenu_2);

	JMenuItem mntmNewMenuItem = new JMenuItem("\u00DAltimos eventos realizados");
	mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmNewMenuItem.setIcon(new ImageIcon(home.class.getResource("/img/Text_preview.png")));
	mnNewMenu_2.add(mntmNewMenuItem);

	JMenuItem mntmUsuriosCadastrados = new JMenuItem("Usu\u00E1rios cadastrados");
	mntmUsuriosCadastrados.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmUsuriosCadastrados.setIcon(new ImageIcon(home.class.getResource("/img/Text_preview.png")));
	mnNewMenu_2.add(mntmUsuriosCadastrados);

	JMenu mnNewMenu_3 = new JMenu("Sobre");
	mnNewMenu_3.setFont(new Font("Arial", Font.PLAIN, 12));
	mnNewMenu_3.setIcon(new ImageIcon(home.class.getResource("/img/Info.png")));
	menuBar.add(mnNewMenu_3);

	JMenuItem mntmUniforOnline = new JMenuItem("Unifor Online");
	mntmUniforOnline.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmUniforOnline.setIcon(new ImageIcon(home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmUniforOnline);

	JMenuItem mntmSobreOSistema = new JMenuItem("Sobre o sistema");
	mntmSobreOSistema.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmSobreOSistema.setIcon(new ImageIcon(home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmSobreOSistema);

	JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
	mntmVerso.setFont(new Font("Arial", Font.PLAIN, 12));
	mntmVerso.setIcon(new ImageIcon(home.class.getResource("/img/Info.png")));
	mnNewMenu_3.add(mntmVerso);
    }

}
