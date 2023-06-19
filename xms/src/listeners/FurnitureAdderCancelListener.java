package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.FurnitureAdder;
import gui.FurnitureViewer;
import gui.WindowFrame;

public class FurnitureAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public FurnitureAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}