import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class main implements java.io.Serializable{

	private JFrame frame;
	public static Vector <User> vec = new Vector <User>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try{
			FileInputStream fileIn = new FileInputStream("data.ser");
     	  	ObjectInputStream in = null; 
     	  	
  			File file = new File("data.ser");
  			boolean isEmpty = file.length()<10;
    	   	if(!isEmpty){
    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
    	   		vec = (Vector<User>) in.readObject();
    	   	}
			if(in!=null){
				in.close();
			}
			fileIn.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error in file handling !");
		}
		
		try {
			intro_page window = new intro_page();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
