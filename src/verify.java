import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verify {

	public JFrame frame;
	private JPasswordField passwordField;
	
	/**
	 * Create the application.
	 */
	public verify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPasswordAuthentication = new JLabel("Password Authentication !");
		lblPasswordAuthentication.setFont(new Font("DejaVu Serif", Font.BOLD, 16));
		lblPasswordAuthentication.setBounds(94, 24, 248, 24);
		frame.getContentPane().add(lblPasswordAuthentication);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password to finish :");
		lblEnterYourPassword.setBounds(107, 97, 235, 15);
		frame.getContentPane().add(lblEnterYourPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 129, 123, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnBooya = new JButton("Boo-Ya !");
		btnBooya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//action
				
				decision_root window = new decision_root();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnBooya.setBounds(146, 160, 123, 25);
		frame.getContentPane().add(btnBooya);
	}
}
