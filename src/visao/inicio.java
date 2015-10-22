package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class inicio {

	protected static final String MAXIMIZED_BOTH = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}

	public void setExtendedState(String maximized_BOTH2) {
		// TODO Auto-generated method stub
		
	}

}
