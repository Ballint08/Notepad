package asd;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Functions {
	
	JColorChooser choosecolor;
	JFrame GUI;
	JButton button;
	Window window;
	public Functions(Window window)
	{
		this.window = window;
	}
	
	public void NewFunctionItem()
	{
		window.textfield.setText("New notes");
		window.window.setTitle("New");
	}
	
	
	public void BgColor()
	{
		GUI = new JFrame("Pick your color");
		GUI.setSize(400, 250);
		GUI.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
		GUI.setVisible(true);
		
		choosecolor = new JColorChooser();
		
		
		GUI.add(choosecolor);
		
		
		
		
	}
}
