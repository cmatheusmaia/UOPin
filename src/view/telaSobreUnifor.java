package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class telaSobreUnifor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaSobreUnifor frame = new telaSobreUnifor();
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
	public telaSobreUnifor() {
		setTitle("UNIFOR ONLINE - 1.0.1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(217, 437, 231, 23);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telaSobreUnifor.class.getResource("/img/unifor.gif")));
		lblNewLabel.setBounds(224, 21, 257, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblSejaBemvindo = new JLabel("Seja bem-vindo \u00E0 Universidade de Fortaleza.");
		lblSejaBemvindo.setBounds(10, 113, 674, 14);
		contentPane.add(lblSejaBemvindo);
		
		JLabel lbleducaoGnero = new JLabel("\"Educa\u00E7\u00E3o \u00E9 g\u00EAnero de primeira necessidade e investimento priorit\u00E1rio\", palavras do criador da Unifor, chanceler Edson Queiroz, por ");
		lbleducaoGnero.setFont(new Font("Arial", Font.PLAIN, 10));
		lbleducaoGnero.setBounds(10, 132, 674, 23);
		contentPane.add(lbleducaoGnero);
		
		JLabel lblOcasioDoDiscurso = new JLabel("ocasi\u00E3o do discurso de inaugura\u00E7\u00E3o da Universidade de Fortaleza, em 1973, representam a mais viva express\u00E3o de responsabilidade");
		lblOcasioDoDiscurso.setFont(new Font("Arial", Font.PLAIN, 10));
		lblOcasioDoDiscurso.setBounds(12, 151, 674, 14);
		contentPane.add(lblOcasioDoDiscurso);
		
		JLabel lblECompromissoPara = new JLabel(" e compromisso para com sua terra e sua gente.");
		lblECompromissoPara.setFont(new Font("Arial", Font.PLAIN, 10));
		lblECompromissoPara.setBounds(10, 165, 674, 14);
		contentPane.add(lblECompromissoPara);
		
		JLabel lblAIdeiaDa = new JLabel("A ideia da cria\u00E7\u00E3o da Universidade de Fortaleza, concebida pelo industrial Edson Queiroz, n\u00E3o foi motivada meramente");
		lblAIdeiaDa.setFont(new Font("Arial", Font.PLAIN, 10));
		lblAIdeiaDa.setBounds(10, 190, 674, 14);
		contentPane.add(lblAIdeiaDa);
		
		JLabel lblPorEstudos = new JLabel("por estudos  de mercado que revelavam a car\u00EAncia do sistema educacional do estado. ");
		lblPorEstudos.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPorEstudos.setBounds(10, 205, 674, 14);
		contentPane.add(lblPorEstudos);
		
		JLabel lblEdsonQueirozSeu = new JLabel("Edson Queiroz, seu primeiro chanceler, planejava uma institui\u00E7\u00E3o 'viva' atuando decisivamente no processo de desenvolvimento da regi\u00E3o.");
		lblEdsonQueirozSeu.setFont(new Font("Arial", Font.PLAIN, 10));
		lblEdsonQueirozSeu.setBounds(10, 220, 674, 14);
		contentPane.add(lblEdsonQueirozSeu);
		
		JLabel lblEleAQueria = new JLabel("Ele a queria para provocar a mudan\u00E7a do status social e econ\u00F4mico de seus benefici\u00E1rios, com efeitos positivos para as fam\u00EDlias e");
		lblEleAQueria.setFont(new Font("Arial", Font.PLAIN, 10));
		lblEleAQueria.setBounds(10, 247, 674, 14);
		contentPane.add(lblEleAQueria);
		
		JLabel lblParaAComunidade = new JLabel("para a comunidade. ");
		lblParaAComunidade.setFont(new Font("Arial", Font.PLAIN, 10));
		lblParaAComunidade.setBounds(10, 262, 674, 14);
		contentPane.add(lblParaAComunidade);
		
		JLabel lblParaEdsonQueiroz = new JLabel("Para Edson Queiroz, \"a Universidade de Fortaleza n\u00E3o pertence \u00E0 Funda\u00E7\u00E3o Edson Queiroz: pertence a todos. A obra \u00E9 de cunho nacional");
		lblParaEdsonQueiroz.setFont(new Font("Arial", Font.PLAIN, 10));
		lblParaEdsonQueiroz.setBounds(10, 284, 674, 14);
		contentPane.add(lblParaEdsonQueiroz);
		
		JLabel lblSobreAUnifor = new JLabel("Sobre a Unifor, o chanceler Edson Queiroz declarou: \"N\u00E3o quero que falem agora da Universidade,");
		lblSobreAUnifor.setFont(new Font("Arial", Font.PLAIN, 10));
		lblSobreAUnifor.setBounds(10, 309, 674, 14);
		contentPane.add(lblSobreAUnifor);
		
		JLabel lblMasSimDaqui = new JLabel("mas sim daqui a dez, vinte anos, quando talvez eu n\u00E3o esteja mais aqui\".");
		lblMasSimDaqui.setFont(new Font("Arial", Font.PLAIN, 10));
		lblMasSimDaqui.setBounds(10, 323, 674, 14);
		contentPane.add(lblMasSimDaqui);
		
		JLabel lblPassadosQuarentaAnos = new JLabel("Passados quarenta anos, muito pode ser dito sobre a Institui\u00E7\u00E3o. No entanto, o que mais concretamente deve ser considerado \u00E9 o");
		lblPassadosQuarentaAnos.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPassadosQuarentaAnos.setBounds(10, 336, 674, 14);
		contentPane.add(lblPassadosQuarentaAnos);
		
		JLabel lblIncontestvelValor = new JLabel(" incontest\u00E1vel valor que hoje representa a Universidade de Fortaleza no cen\u00E1rio da educa\u00E7\u00E3o brasileira.");
		lblIncontestvelValor.setFont(new Font("Arial", Font.PLAIN, 10));
		lblIncontestvelValor.setBounds(10, 350, 674, 14);
		contentPane.add(lblIncontestvelValor);
	}
}
