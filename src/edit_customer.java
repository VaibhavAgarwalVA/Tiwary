import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class edit_customer {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public edit_customer() {
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
		
		JLabel lblEditDetails = new JLabel("Edit Details !");
		lblEditDetails.setFont(new Font("LM Roman 6", Font.BOLD, 14));
		lblEditDetails.setBounds(157, 12, 125, 15);
		frame.getContentPane().add(lblEditDetails);
		
		JLabel lblEnterRoomNumber = new JLabel("Enter room number");
		lblEnterRoomNumber.setBounds(67, 102, 153, 15);
		frame.getContentPane().add(lblEnterRoomNumber);
		
		textField = new JTextField();
		textField.setBounds(241, 100, 125, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setBounds(67, 143, 164, 15);
		frame.getContentPane().add(lblEnterYourPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 141, 125, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnFindMyAc = new JButton("Find my A/C");
		btnFindMyAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String room_no = textField.getText();
				int n = main.vec.size();
				int j=-1;
				for(int i=0;i<n;i++){
					if(main.vec.elementAt(i).get_room() == room_no){
						j=i;
						break;
					}
				}
				if(j>-1){
					String passkey = passwordField.getText();
					if(main.vec.elementAt(j).get_password() == passkey){
						edit_page window = new edit_page(j);
						frame.setVisible(false);
						window.frame.setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Password.");
						edit_customer window = new edit_customer();
						frame.setVisible(false);
						window.frame.setVisible(true);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "No record found !");
					decision_root window = new decision_root();
					frame.setVisible(false);
					window.frame.setVisible(true);
				}
			}
		});
		btnFindMyAc.setBounds(157, 210, 117, 25);
		frame.getContentPane().add(btnFindMyAc);
	}

}
