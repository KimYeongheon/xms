package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Teamproject.FurnitureManager;
import gui.FurnitureViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		FurnitureViewer furnitureViewer = frame.getFurnitureviewer();
		FurnitureManager furnitureManager = getObject("furnituremanager.ser");
		furnitureViewer.setFurnitureManager(furnitureManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(furnitureViewer);
		frame.revalidate();
		frame.repaint();
	}
	
    public static FurnitureManager getObject(String filename) {
    	FurnitureManager furnitureManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			furnitureManager = (FurnitureManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return furnitureManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return furnitureManager;
    }
}