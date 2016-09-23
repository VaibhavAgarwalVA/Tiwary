import java.awt.EventQueue;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

public class User implements java.io.Serializable{
	
	private String name;
	private String room;
	private String mobile;
	private String password;
	private double amount;
	
	//getters
	String get_name(){
		return name;
	}
	
	String get_room(){
		return room;
	}
	
	String get_mobile(){
		return mobile;
	}
	
	String get_password(){
		return password;
	}
	
	double get_amount(){
		return amount;
	}
	
	//
	//setters
	void set_name(String x){
		name = x;
	}
	
	void set_room(String x){
		room = x;
	}
	
	void set_mobile(String x){
		mobile = x;
	}
	
	void set_password(String x){
		password = x;
	}
	
	void set_amount(double x){
		amount = x;
	}
}
