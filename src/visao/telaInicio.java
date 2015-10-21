package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.text.Normalizer.Form;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButtonMenuItem;

public class telaInicio extends JFrame {

	private JPanel contentPane;
	private Form form1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicio frame = new telaInicio();
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
	public telaInicio() {
		initComponentes();
		createEvents();
	}
	
	private void initComponentes(){
		setBackground(Color.WHITE);
		setTitle("UniforOnline - Para desktops");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setFont(new Font("Arial", Font.PLAIN, 12));
		mnArquivo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		menuBar.add(mnArquivo);
		
		JMenuItem btnSair = new JMenuItem("Sair");
		btnSair.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Exit.png")));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnArquivo.add(btnSair);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnCadastrar);
		
		JMenu mnUsurio = new JMenu("Usu\u00E1rio");
		mnUsurio.setFont(new Font("Arial", Font.PLAIN, 12));
		mnUsurio.setIcon(new ImageIcon(telaInicio.class.getResource("/img/People.png")));
		mnCadastrar.add(mnUsurio);
		
		JMenuItem mntmNovoUsurio = new JMenuItem("Novo usu\u00E1rio");
		mntmNovoUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mntmNovoUsurio.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Create.png")));
		mnUsurio.add(mntmNovoUsurio);
		
		JMenuItem mntmEditarUsurio = new JMenuItem("Editar usu\u00E1rio");
		mntmEditarUsurio.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Redo.png")));
		mnUsurio.add(mntmEditarUsurio);
		
		JMenuItem mntmExcluirUsurio = new JMenuItem("Excluir usu\u00E1rio");
		mntmExcluirUsurio.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Delete.png")));
		mnUsurio.add(mntmExcluirUsurio);
		
		JMenu mnEvento = new JMenu("Evento");
		mnEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEvento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Calendar.png")));
		mnCadastrar.add(mnEvento);
		
		JMenuItem mntmCadastrarEvento = new JMenuItem("Cadastrar evento");
		mntmCadastrarEvento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Create.png")));
		mnEvento.add(mntmCadastrarEvento);
		
		JRadioButtonMenuItem rdbtnmntmEditarEvento = new JRadioButtonMenuItem("Editar evento");
		rdbtnmntmEditarEvento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Redo.png")));
		mnEvento.add(rdbtnmntmEditarEvento);
		
		JRadioButtonMenuItem rdbtnmntmExcluirEvento = new JRadioButtonMenuItem("Excluir evento");
		rdbtnmntmExcluirEvento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Delete.png")));
		mnEvento.add(rdbtnmntmExcluirEvento);
		
		JMenu mnEstabelecimento = new JMenu("Estabelecimento");
		mnEstabelecimento.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEstabelecimento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Company.png")));
		mnCadastrar.add(mnEstabelecimento);
		
		JMenuItem mntmCadastrarEstabelecimento = new JMenuItem("Cadastrar estabelecimento");
		mntmCadastrarEstabelecimento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Create.png")));
		mnEstabelecimento.add(mntmCadastrarEstabelecimento);
		
		JMenuItem mntmEditarEstabelecimento = new JMenuItem("Editar estabelecimento");
		mntmEditarEstabelecimento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Redo.png")));
		mnEstabelecimento.add(mntmEditarEstabelecimento);
		
		JMenuItem mntmExcluirEstabelecimento = new JMenuItem("Excluir estabelecimento");
		mntmExcluirEstabelecimento.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Delete.png")));
		mnEstabelecimento.add(mntmExcluirEstabelecimento);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		mnRelatrios.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnRelatrios);
		
		JMenu mnNewMenu_3 = new JMenu("Usu\u00E1rios");
		mnNewMenu_3.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_3.setIcon(new ImageIcon(telaInicio.class.getResource("/img/People.png")));
		mnRelatrios.add(mnNewMenu_3);
		
		JMenuItem mntmEstatisticasDeUsurios = new JMenuItem("Estatisticas de usu\u00E1rios");
		mntmEstatisticasDeUsurios.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Report.png")));
		mnNewMenu_3.add(mntmEstatisticasDeUsurios);
		
		JMenu mnNewMenu_4 = new JMenu("Estabelecimento");
		mnNewMenu_4.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_4.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Company.png")));
		mnRelatrios.add(mnNewMenu_4);
		
		JMenuItem mntmEstabelecimentosMaisVisitados = new JMenuItem("Estabelecimentos mais visitados");
		mntmEstabelecimentosMaisVisitados.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Report.png")));
		mnNewMenu_4.add(mntmEstabelecimentosMaisVisitados);
		
		JMenu mnNewMenu_5 = new JMenu("Eventos");
		mnNewMenu_5.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_5.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Calendar.png")));
		mnRelatrios.add(mnNewMenu_5);
		
		JMenuItem mntmltimosEventos = new JMenuItem("\u00DAltimos eventos");
		mntmltimosEventos.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Report.png")));
		mnNewMenu_5.add(mntmltimosEventos);
		
		JMenu mnEditar = new JMenu("Editar");
		mnEditar.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnEditar);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnSobre);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Unifor");
		mntmNewMenuItem.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Info.png")));
		mnSobre.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sobre o programa");
		mntmNewMenuItem_2.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Info.png")));
		mnSobre.add(mntmNewMenuItem_2);
		
		JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
		mntmVerso.setIcon(new ImageIcon(telaInicio.class.getResource("/img/Info.png")));
		mnSobre.add(mntmVerso);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void createEvents(){
	}
}
