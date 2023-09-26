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
