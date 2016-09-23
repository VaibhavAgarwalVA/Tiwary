import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class intro_page {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public intro_page() {
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
		
		JLabel lblTiwarys = new JLabel("Tiwary's");
		lblTiwarys.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTiwarys.setBounds(156, 22, 127, 33);
		frame.getContentPane().add(lblTiwarys);
		
		JLabel lblMsHallIit = new JLabel("MS Hall, IIT Kharagpur");
		lblMsHallIit.setBounds(127, 67, 213, 15);
		frame.getContentPane().add(lblMsHallIit);
		
		JLabel lblShopManagementSoftware = new JLabel("Shop Management Software ");
		lblShopManagementSoftware.setFont(new Font("Courier 10 Pitch", Font.ITALIC, 16));
		lblShopManagementSoftware.setBounds(89, 139, 266, 15);
		frame.getContentPane().add(lblShopManagementSoftware);
		
		JLabel lblDevelopedBy = new JLabel("Developed by :");
		lblDevelopedBy.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDevelopedBy.setBounds(287, 216, 110, 15);
		frame.getContentPane().add(lblDevelopedBy);
		
		JLabel lblVaBaggyPate = new JLabel("VA, Baggy, Ved !");
		lblVaBaggyPate.setBounds(275, 231, 134, 17);
		frame.getContentPane().add(lblVaBaggyPate);
		
		JButton btnPressToContinue = new JButton("Press to continue");
		btnPressToContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decision_root window = new decision_root();
				window.frame.setVisible(true);
			}
		});
		btnPressToContinue.setBackground(Color.DARK_GRAY);
		btnPressToContinue.setForeground(Color.LIGHT_GRAY);
		btnPressToContinue.setBounds(127, 166, 159, 25);
		frame.getContentPane().add(btnPressToContinue);
	}
}
