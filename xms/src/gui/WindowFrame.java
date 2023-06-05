package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Teamproject.FurnitureManager;

public class WindowFrame extends JFrame {

	FurnitureManager furnitureManager;
	
	MenuSelection menuselection;
	FurnitureAdder furnitureAdder;
	FurnitureViewer furnitureviewer;

	public WindowFrame(FurnitureManager furnitureManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.furnitureManager = furnitureManager;
		menuselection = new MenuSelection(this);
		furnitureAdder = new FurnitureAdder(this);
		furnitureviewer = new FurnitureViewer(this, this.furnitureManager);
	
		this.setupPanel(menuselection);
		
		this.setVisible(true);  
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FurnitureAdder getFurnitureAdder() {
		return furnitureAdder;
	}

	public void setFurnitureAdder(FurnitureAdder furnitureAdder) {
		this.furnitureAdder = furnitureAdder;
	}

	public FurnitureViewer getFurnitureviewer() {
		return furnitureviewer;
	}

	public void setFurnitureviewer(FurnitureViewer furnitureviewer) {
		this.furnitureviewer = furnitureviewer;
	}

}
