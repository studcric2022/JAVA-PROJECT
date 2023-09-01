# JAVA-PROJECT
package gui;
<br>
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
<br>
public class FirstGui {

	public static void main(String[] args) {
		Addition obj= new Addition();
		

	}

}
<br>
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

package gui;
import gui.Addition;


import java.awt.GridLayout;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 

public class CreateAccount {

	public static void main(String[] args) {
		Details sb= new Details();

	}

}
class Details extends JFrame
{
  JLabel l1,l2,l3,l4;
  JButton b;
  JTextField t1,t4,t2,t3;
 int pass,conpass;
  
  public Details()
  {
	  JFrame f=new JFrame("CREATE ACCOUNT");
	  
	  
	  l1= new JLabel("USERNAME");
	  l1.setBounds(550,200,150,40);
		l2=new JLabel("PASSWORD");
		l2.setBounds(550,300,150,40);
		l3= new JLabel("CONFIRM PASSWORD");
		l3.setBounds(550,400,150,40);
		l4=new JLabel("EMAIL ID OR PHONE NUM");
		l4.setBounds(550,500,150,40);
		f.setVisible(true);
		f.setSize(1500,1000);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		t1= new JTextField();
		t1.setBounds(750,200,300,40);
		t2= new JTextField();
		t2.setBounds(750,300,300,40);
		t3= new JTextField();
		t3.setBounds(750,400,300,40);
		t4= new JTextField();
		t4.setBounds(750,500,300,40);
		
		b= new JButton("SIGN UP");
		b.setBounds(700,600,100,50);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b);
		
		b.addActionListener(ae->{
			String pass = t2.getText();
			String conpass= t3.getText();
			if(pass.equals(conpass))
			{
			JOptionPane.showMessageDialog(b,"YOUR ACCOUNT IS SUCCESSFULLY CREATED");
			new Addition();
			}
			else
				JOptionPane.showMessageDialog(b,"SORRY\nYOUR GIVEN PASSWORD AND CONFIRM PASSWORD IS NOT MATCHING");
		});
		f.add(b);
		
  }
}


package gui;
import gui.Addition;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Scanner;
import java.awt.Font.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		
		Contacts con= new Contacts();

	}

}
class Contacts extends JFrame
{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JPanel p,p1,p3,p4,p5,p6,p7;
	JButton send,send1,send2,send3,send4,back,clear,clear1,clear2,clear3,clear4,game;
	int msg,msg1,msg2,msg3,msg4;
    JTextField text,text1,text2,text3,text4;
    String[] history= new String[10];
	public Contacts()
	{
		
		
		
		JFrame f= new JFrame();
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		setSize(200,200);
		l= new JLabel("CHATS");
		f.setTitle("WELCOME TO SITE");
		
		
		f.setVisible(true);
		f.setSize(800,800);
		p= new JPanel();
		p.setBounds(350,10,100,30);
		p.setBackground(Color.GREEN);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		back=new JButton("BACK ");
		back.setBounds(350,700,100,30);
		p1= new JPanel();
		text=new JTextField(20);
        clear = new JButton("CLEAR");
        clear.setBounds(700,150,50,70);
        clear1 = new JButton("CLEAR");
        clear1.setBounds(700,150,50,70);
        clear2= new JButton("CLEAR");
        clear2.setBounds(700,150,50,70);
        clear3 = new JButton("CLEAR");
        clear3.setBounds(700,150,50,70);
        
        clear4= new JButton("CLEAR");
        clear4.setBounds(700,150,50,70);
        
        text.setBorder(BorderFactory.createLineBorder(Color.black));
		text.setBounds(205,128,300,40);
		p1.setBounds(200,125,500,100);
		p1.setBackground(Color.cyan);
		l1= new JLabel("NITIN");
		l1.setBounds(25,135,100,50);
		l1.setBorder(BorderFactory.createLineBorder(Color.black));
		send=new JButton("SEND");
		send.setBounds(700,150,50,70);
		l2= new JLabel("SENT");
		l2.setBounds(150,255,400,30);
		l2.setBorder(BorderFactory.createLineBorder(Color.white));
		p3= new JPanel();
		p3.setBounds(100,250,650,400);
		p3.setBackground(Color.cyan);
		p3.setBorder(BorderFactory.createLineBorder(Color.red));
		p4= new JPanel();
		text1=new JTextField(20);
        text1.setBorder(BorderFactory.createLineBorder(Color.black));
		text1.setBounds(205,128,300,40);
		p4.setBounds(200,235,500,80);
		p4.setBackground(Color.cyan);
		l3= new JLabel("DEVAYANI");
		l3.setBounds(25,235,100,50);
		l3.setBorder(BorderFactory.createLineBorder(Color.black));
		send1=new JButton("SEND");
		send1.setBounds(700,150,50,70);
		l4= new JLabel("SENT");
		l4.setBounds(150,255,400,30);
		l4.setBorder(BorderFactory.createLineBorder(Color.white));
		p5= new JPanel();
		text2=new JTextField(20);
        text2.setBorder(BorderFactory.createLineBorder(Color.black));
		text2.setBounds(205,128,300,40);
		p5.setBounds(200,335,500,80);
		p5.setBackground(Color.cyan);
		l5= new JLabel("ADITYA BARI");
		l5.setBounds(25,335,100,50);
		l5.setBorder(BorderFactory.createLineBorder(Color.black));
		send2=new JButton("SEND");
		send2.setBounds(700,150,50,70);
		l6= new JLabel("SENT");
		l6.setBounds(150,255,400,30);
		l6.setBorder(BorderFactory.createLineBorder(Color.white));
		p6= new JPanel();
		text3=new JTextField(20);
        text3.setBorder(BorderFactory.createLineBorder(Color.black));
		text3.setBounds(205,128,300,40);
		p6.setBounds(200,435,500,100);
		p6.setBackground(Color.cyan);
		l7= new JLabel("ROHIT SINGH");
		l7.setBounds(25,435,100,50);
		l7.setBorder(BorderFactory.createLineBorder(Color.black));
		send3=new JButton("SEND");
		send3.setBounds(700,150,50,70);
		l8= new JLabel("SENT");
		l8.setBounds(150,255,400,30);
		l8.setBorder(BorderFactory.createLineBorder(Color.white));
		p7= new JPanel();
		text4=new JTextField(20);
        text4.setBorder(BorderFactory.createLineBorder(Color.black));
		text4.setBounds(205,128,300,40);
		p7.setBounds(200,545,500,100);
		p7.setBackground(Color.cyan);
		l9= new JLabel("SUMIT");
		l9.setBounds(25,535,100,50);
		l9.setBorder(BorderFactory.createLineBorder(Color.black));
		send4=new JButton("SEND");
		send4.setBounds(700,150,50,70);
		l10= new JLabel("SENT");
		l10.setBounds(150,255,400,30);
		l10.setBorder(BorderFactory.createLineBorder(Color.white));
		game=new JButton("GAME");
		game.setBounds(600,700,100,30);
		f.add(p);
		p.add(l);
		f.add(p1);
		p1.add(text);
		
		
		
		f.add(l1);
		
		p1.add(send);
		p1.add(clear);
		
		
		p1.add(l2);
		f.add(l3);
		f.add(p4);
		p4.add(text1);
		p4.add(send1);
		p4.add(clear1);
		p4.add(l4);
		f.add(l5);
		f.add(p5);
		p5.add(text2);
		p5.add(send2);
		p5.add(clear2);
		p5.add(l6);
		f.add(l7);
		f.add(p6);
		p6.add(text3);
		p6.add(send3);
		p6.add(clear3);
		p6.add(l8);
		f.add(l9);
		f.add(p7);
		p7.add(text4);
		p7.add(send4);
		p7.add(clear4);
		p7.add(l10);
		f.add(back);
		f.add(game);
		send.addActionListener(ae ->{
			JOptionPane.showMessageDialog(send,"MESSAGE SENT TO"+" "+"NITIN");
			
			
			for(int i=0;i<10;i++)
			{
				String msg= text.getText();
				history[i]= msg;
			
			l2.setText("Thank you for ur msg:"+" "+msg+"");
			}
		});
		clear.addActionListener(ae ->{
			
			text.setText("");
			l2.setText("");
		});
		
		
		p1.add(l2);
		send1.addActionListener(ae->{
			JOptionPane.showMessageDialog(send,"MESSAGE SENT TO"+" "+"DEVAYANI");
			String msg1= text1.getText();
			l4.setText("Thank you for ur msg:"+" "+msg1+"");
		});
		clear1.addActionListener(ae ->{
			text1.setText("");
			l4.setText("");
		});
		p4.add(l4);
		send2.addActionListener(ae->{
			JOptionPane.showMessageDialog(send,"MESSAGE SENT TO"+" "+"ADITYA BARI");
			String msg2= text2.getText();
			l6.setText("Thank you for ur msg:"+" "+msg2+"");
		});
		clear2.addActionListener(ae ->{
			text2.setText("");
			l6.setText("");
		});
		p5.add(l6);
		send3.addActionListener(ae->{
			JOptionPane.showMessageDialog(send,"MESSAGE SENT TO"+" "+"ROHIT SINGH");
			String msg3= text3.getText();
			l8.setText("Thank you for ur msg:"+" "+msg3+"");
		});
		clear3.addActionListener(ae ->{
			text3.setText("");
			l8.setText("");
		});
		p6.add(l8);
		send4.addActionListener(ae->{
			JOptionPane.showMessageDialog(send,"MESSAGE SENT TO"+" "+"SUMIT");
			String msg4= text4.getText();
			l10.setText("Thank you for ur msg:"+" "+msg4+"");
		});
		clear4.addActionListener(ae ->{
			text4.setText("");
			l10.setText("");
		});
		
		p7.add(l10);
		
		back.addActionListener(ae->{
			new Addition();
		});
	
		
		
	}
}
