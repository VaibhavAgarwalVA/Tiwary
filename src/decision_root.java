import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class decision_root {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public decision_root() {
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
		
		JLabel lblWhatDoYou = new JLabel("What do you want to do ??");
		lblWhatDoYou.setFont(new Font("Droid Sans", Font.BOLD | Font.ITALIC, 13));
		lblWhatDoYou.setBounds(127, 12, 243, 23);
		frame.getContentPane().add(lblWhatDoYou);
		
		JButton btnANewCustomer = new JButton("A NEW customer on the floor !!");
		btnANewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new_customer window = new new_customer();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnANewCustomer.setBounds(72, 67, 298, 25);
		frame.getContentPane().add(btnANewCustomer);
		
		JButton btnListOfConnoisseurs = new JButton("LIST of connoisseurs !!");
		btnListOfConnoisseurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list_customers window = new list_customers();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnListOfConnoisseurs.setBounds(72, 109, 298, 25);
		frame.getContentPane().add(btnListOfConnoisseurs);
		
		JButton btnSomeoneWantsAn = new JButton("Someone wants an EDIT !!");
		btnSomeoneWantsAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				edit_customer window = new edit_customer();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnSomeoneWantsAn.setBounds(72, 148, 298, 25);
		frame.getContentPane().add(btnSomeoneWantsAn);
		
		JButton btnAddMoreMoments = new JButton("ADD more moments of fun !!");
		btnAddMoreMoments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_order window = new add_order();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnAddMoreMoments.setBounds(72, 191, 298, 48);
		frame.getContentPane().add(btnAddMoreMoments);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.RED);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				intro_page window = new intro_page();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnX.setBounds(376, 11, 48, 25);
		frame.getContentPane().add(btnX);
	}

}
