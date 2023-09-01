# JAVA-PROJECT
package gui;
import java.util.*;




import gui.CreateAccount;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.Login;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FirstGui {

	public static void main(String[] args) {
		Addition obj= new Addition();
		

	}

}
class Addition extends JFrame 
{
	JTextField t1,t2;
	JButton b,b1;
	JLabel l,l1;
	JPasswordField p;
	JRadioButton m,f1;
	public Addition()
	{
		JFrame F=new JFrame("SIGN IN PAGE");
		F.setVisible(true);
		F.setSize(1900,800);
		F.setLayout(null);
		
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1= new JTextField(10);
		t1.setBounds(800,100,200,20);
		p= new JPasswordField(10);
		p.setBounds(800,200,200,20);
		l= new JLabel("USERNAME");
		l.setBounds(650,100,200,20);
		l1=new JLabel("PASSWORD");
		l1.setBounds(650,200,200,20);
		 m= new JRadioButton("Male");
		 f1= new JRadioButton("Female");
		 m.setBounds(700,250,100,50);
		 f1.setBounds(800,250,100,50);
		 ButtonGroup bg=new ButtonGroup(); 
		 bg.add(m);
			bg.add(f1);
		b= new JButton("LOGIN");
		b.setBounds(725,300,200,20);
		b1= new JButton("CREATE ACCOUNT");
		b1.setBounds(725,350,200,20);
		F.add(l);
		F.add(t1);
		F.add(l1);
		F.add(p);
		F.add(m);
		F.add(f1);
		F.add(b);
		F.add(b1);		
		b.addActionListener(ae -> {
			if(m.isSelected())
			{
				JOptionPane.showMessageDialog(b,"you are successfully logged in"+"\n"+"Gender: "+"male");
			}
			if(f1.isSelected()) {
				JOptionPane.showMessageDialog(b,"you are successfully logged in"+"\n"+"Gender: "+"female");
			}
			new Contacts();
			dispose();
		});
		F.add(b);
		b1.addActionListener(ae -> {
			    new Details();
			    dispose();
		});
		F.add(b1);
	}
	
}

