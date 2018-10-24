import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button{

	static GraphicsConfiguration gc;

	

	public static void main(String[] args){
		JFrame frame= new JFrame(gc);	



		frame.setTitle("Button");
		frame.setSize(600, 400);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		JButton b = new JButton("PRESS ME");

		frame.add(b);
		

	}



}