package asd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import javax.swing.JFileChooser;

public class File_Functions {
	
	JFileChooser Save;
	Window window;
	
	public File_Functions(Window window)
	{
		this.window = window;
	}
	
	public void NewFunctionItem()
	{
		
		window.window.setTitle("New Note");

		
		
		//Saving
		Save = new JFileChooser();
		Save.setDialogTitle("Save your file");
		int saving = Save.showSaveDialog(null);
		if (saving == JFileChooser.APPROVE_OPTION) {
			File fileToSave = Save.getSelectedFile();
			if (!fileToSave.getName().toLowerCase().endsWith(".txt")) {
				fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
			}
			
			try (BufferedWriter saver = new BufferedWriter(new FileWriter(fileToSave))) {
				saver.write(window.textfield.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
	}
	
	
	
}
