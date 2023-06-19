package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Teamproject.FurnitureManager;
import listeners.FurnitureAdderCancelListener;
import listeners.FurnitureAdderListener;

public class FurnitureAdder extends JPanel {
	
	WindowFrame frame;
	FurnitureManager furnitureManager;
	
	public FurnitureAdder(WindowFrame frame, FurnitureManager furnitureManager) {
		this.frame = frame;
		this.furnitureManager = furnitureManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelBrand = new JLabel("Brand: ", JLabel.TRAILING);
		JTextField fieldBrand = new JTextField(10);
		labelBrand.setLabelFor(fieldBrand);
		panel.add(labelBrand);
		panel.add(fieldBrand);
		
		JLabel labelCost = new JLabel("Cost: ", JLabel.TRAILING);
		JTextField fieldCost = new JTextField(10);
		labelCost.setLabelFor(fieldCost);
		panel.add(labelCost);
		panel.add(fieldCost);
		
		JLabel labelCaution = new JLabel("Caution: ", JLabel.TRAILING);
		JTextField fieldCaution = new JTextField(10);
		labelCaution.setLabelFor(fieldCaution);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new FurnitureAdderListener(fieldID, fieldName, fieldBrand, fieldCost, fieldCaution, furnitureManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new FurnitureAdderCancelListener(frame));
		
		panel.add(labelCaution);
		panel.add(fieldCaution);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
