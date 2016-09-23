import java.awt.EventQueue;

import javax.swing.JFrame;

public class list_customers {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public list_customers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

}
