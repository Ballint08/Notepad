package asd;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Window implements ActionListener {
	
	JFrame window;
	JTextArea textfield;
	JScrollPane ScrollPane;
	JMenuBar Menu;
	JMenu menuFile, menuEdit, menuFormat;
	JMenuItem Inew, Iopen, Isave, Isearch, Ifontsize, Ifontcolor, Ibgcolor, IWpaper; 
	
	Functions func = new Functions(this);
	
	
	public static void main(String[] args)
	{
		new Window();
	}

	public Window()
	{
		CreateWindow();
		CreateTextField();
		CreateMenuBar();
		CreateFileMenu();
		CreateEditMenu();
		CreateFormatMenu();
		window.setVisible(true);
	}
	
	
	
	
	public void CreateWindow()
	{
		window = new JFrame("Notepad");
		window.setSize(700, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void CreateTextField()
	{
		textfield = new JTextArea();
		ScrollPane = new JScrollPane(textfield, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		window.add(ScrollPane);
		ScrollPane.setBorder(BorderFactory.createEmptyBorder());
		
	}
	
	
	public void CreateMenuBar()
	{
		Menu = new JMenuBar();
		window.setJMenuBar(Menu);
		
		
		menuFile = new JMenu("File");
		Menu.add(menuFile);

		menuEdit = new JMenu("Edit");
		Menu.add(menuEdit);
		
		menuFormat = new JMenu("Format");
		Menu.add(menuFormat);
		
		
	}
	
	public void CreateFileMenu()
	{
		Inew = new JMenuItem("New");
		Inew.addActionListener(this);
		Inew.setActionCommand("New");
		menuFile.add(Inew);
		
		Iopen = new JMenuItem("Open");
		menuFile.add(Iopen);
		
		Isave = new JMenuItem("Save");
		menuFile.add(Isave);
		
		Isearch = new JMenuItem("Search");
		menuFile.add(Isearch);
		
		
		//Iopen, Isave, Isearch, Ifontsize, Ifontcolor, Ibgcolor, IWpaper
	}
	
	public void CreateEditMenu()
	{
		Ifontsize = new JMenuItem("Font Size");
		menuEdit.add(Ifontsize);
		
		Ifontcolor  = new JMenuItem("Font Color");
		menuEdit.add(Ifontcolor);
	}
	
	public void CreateFormatMenu()
	{
		Ibgcolor = new JMenuItem("Background Color");
		menuFormat.add(Ibgcolor);
		Ibgcolor.addActionListener(this);
		Ibgcolor.setActionCommand("BgColor");
		
		IWpaper = new JMenuItem("Change Wallpaper");
		
		menuFormat.add(IWpaper);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String command = e.getActionCommand();
		switch(command)
		{
		case "New": func.NewFunctionItem(); break;
		
		case "BgColor": func.BgColor(); break;
		}
	}
	
	
}
