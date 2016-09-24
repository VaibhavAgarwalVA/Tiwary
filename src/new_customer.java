import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class new_customer {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

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
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the League !");
		lblWelcomeToThe.setFont(new Font("L M Roman Caps10", Font.BOLD, 15));
		lblWelcomeToThe.setBounds(113, 12, 237, 15);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(74, 72, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setBounds(74, 104, 87, 15);
		frame.getContentPane().add(lblRoomNo);
		
		JLabel lblRollNo = new JLabel("Mobile No");
		lblRollNo.setBounds(74, 136, 105, 15);
		frame.getContentPane().add(lblRollNo);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(74, 168, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(182, 70, 220, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 102, 220, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 134, 220, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 166, 220, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnAddMe = new JButton("Add me !");
		btnAddMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User new_user = new User();
				new_user.set_amount(0);
				new_user.set_mobile(textField_2.getText());
				new_user.set_room(textField_1.getText());
				new_user.set_name(textField.getText());
				new_user.set_password(passwordField.getText());
				
				main.vec.addElement(new_user);
				
				JOptionPane.showMessageDialog(null, "Added Successfully !!");
				
				decision_root window = new decision_root();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnAddMe.setBounds(165, 207, 117, 25);
		frame.getContentPane().add(btnAddMe);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decision_root window = new decision_root();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(395, 8, 43, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
