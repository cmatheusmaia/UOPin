package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.PadroesDeTelas;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class telaSobreSistema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaSobreSistema frame = new telaSobreSistema();
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
	public telaSobreSistema() {
		setTitle("SOBRE O SISTEMA - 1.0.1");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setIcon(new ImageIcon(telaSobreSistema.class.getResource("/img/Info.png")));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmOQueMudou = new JMenuItem("O que mudou?");
		mnAjuda.add(mntmOQueMudou);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("VERS\u00C3O DO SISTEMA 1.0.1 - BUILDER 2015");
		label.setForeground(SystemColor.controlShadow);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBounds(239, 416, 231, 23);
		contentPane.add(label);
		
		JTextPane txtpnSaSaS = new JTextPane();
		txtpnSaSaS.setText("O UNIFOR mobile, vers\u00E3o desktop \u00E9 um software para gest\u00E3o do Unifor Mobile, onde existe a intera\u00E7\u00E3o do aplicativo com a vers\u00E3o Desktop.\r\n\r\nOnde ser\u00E1 poss\u00EDvel realizar a inclus\u00E3o, edi\u00E7\u00E3o, exclus\u00E3o de estabelecimentos\u00B9, usu\u00E1rios\u00B2 e eventos\u00B3.\r\n\r\nOnde tamb\u00E9m estar\u00E1 sendo poss\u00EDvel ser realizada a emiss\u00E3o de relat\u00F3rios para melhoria da gest\u00E3o da ferramenta.\r\n\r\n1. Estabelecimentos:\r\n- \u00C9 poss\u00EDvel cadastrar, editar, excluir estabelecimentos do sistema.\r\n- Essa funcionalidade dever\u00E1 ser realizada por um usu\u00E1rio previamente autenticado, onde ele ir\u00E1 preencher os campos necess\u00E1rios para que haja o resultado esperado.\r\n\r\n2. Usu\u00E1rio:\r\n- Onde haver\u00E1 a gest\u00E3o de todos os usu\u00E1rios do sistema, onde tamb\u00E9m iremos fazer a valida\u00E7\u00E3o de seguran\u00E7a do mesmo.\r\n\r\n3. Eventos:\r\n- Podemos dizer que a sua principal funcionalidade \u00E9 cadastrar evento e divulgar o que acontece, assim como fazer as devidas corre\u00E7\u00F5es casa haja alguma necess\u00E1ria.\r\n\r\nO sistema est\u00E1 atualmente na vers\u00E3o 1.0.1, onde foi desenvolvida por Matheus Maia, Samuel Santiago e Jardel Sampaio.\r\n\r\nNossas atualiza\u00E7\u00F5es do sistema ocorrer\u00E1 em dois momentos. Sendo eles, o momento um, falha no sistema, onde ocorrer\u00E1 manuten\u00E7\u00E3o imediata ou at\u00E9 mesmo suspens\u00E3o da rotina. Momento dois, sendo realizado periodicamente a cada 2 meses. Onde estaremos implementando casos de necessidades de nossos usu\u00E1rios, trazendo para ferramenta suas reais necessidades.");
		txtpnSaSaS.setEditable(false);
		txtpnSaSaS.setFont(new Font("Arial", Font.PLAIN, 11));
		txtpnSaSaS.setBounds(10, 11, 644, 342);
		contentPane.add(txtpnSaSaS);
	}
}
