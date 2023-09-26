package gui;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class Game {

	public static void main(String[] args) {
		Play dot=new Play();

	}

}
class Play extends JFrame 
{
	JFrame f;
     Play()
	{
    	 f= new JFrame("GAME");
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		add(f);
	
	}
}
