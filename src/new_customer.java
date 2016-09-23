import java.awt.EventQueue;

import javax.swing.JFrame;

public class new_customer {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public new_customer() {
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
