import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class main {

	private JFrame frame;
	public static Vector <User> vec = new Vector <User>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			intro_page window = new intro_page();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
