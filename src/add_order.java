import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class add_order {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public add_order() {
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
		
		JLabel lblAddNewOrder = new JLabel("ADD new order to your pre-existing account !");
		lblAddNewOrder.setFont(new Font("Tibetan Machine Uni", Font.BOLD, 15));
		lblAddNewOrder.setBounds(24, 12, 426, 15);
		frame.getContentPane().add(lblAddNewOrder);
		
		JLabel lblRoomNo = new JLabel("Room No :");
		lblRoomNo.setBounds(106, 71, 78, 15);
		frame.getContentPane().add(lblRoomNo);
		
		textField = new JTextField();
		textField.setBounds(202, 69, 143, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAmountinr = new JLabel("Amount (INR) :");
		lblAmountinr.setBounds(76, 108, 108, 15);
		frame.getContentPane().add(lblAmountinr);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 106, 143, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddTheShiz = new JButton("Come-on add the shiz NOW !!");
		btnAddTheShiz.setForeground(UIManager.getColor("Button.background"));
		btnAddTheShiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verify window = new verify();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnAddTheShiz.setBackground(new Color(0, 102, 51));
		btnAddTheShiz.setBounds(64, 163, 314, 42);
		frame.getContentPane().add(btnAddTheShiz);
		
		JButton btnMaybeIllLet = new JButton("Maybe, I'll let it just PASS !");
		btnMaybeIllLet.setForeground(UIManager.getColor("Button.background"));
		btnMaybeIllLet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decision_root window = new decision_root();
				frame.setVisible(false);
				window.frame.setVisible(true);
			}
		});
		btnMaybeIllLet.setBackground(new Color(102, 0, 0));
		btnMaybeIllLet.setBounds(92, 217, 253, 25);
		frame.getContentPane().add(btnMaybeIllLet);
		
	}
}
