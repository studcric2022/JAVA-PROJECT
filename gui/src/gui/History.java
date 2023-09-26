package gui;
import gui.Login;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class His1 extends JFrame{
	JPanel p;
	public His1()
	{
		JFrame f=new JFrame("HISTORY");
		f.setVisible(true);
		f.setSize(400,400);
		p=new JPanel();
		p.setBounds(100,100,100,50);
		JTextArea jta = new JTextArea();
		
		p.setBackground(Color.black);
		f.add(p);
		for(int j=0;j<k;j++) {
			
		}
	}
}

public class History {
	public static void main(String args[]) {
		His1 his1= new His1();
	}

}
