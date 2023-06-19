package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Teamproject.FurnitureManager;
import TeamprojectFurniture.Furniture;
import TeamprojectFurniture.FurnitureInput;
import TeamprojectFurniture.FurnitureKind;
import TeamprojectFurniture.WoodFurniture;
import exception.CautionFormatException;

public class FurnitureAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldBrand;
	JTextField fieldCost;
	JTextField fieldCaution;
	
	FurnitureManager furnitureManager;
	
	public FurnitureAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldBrand, 
			JTextField fieldCost,
			JTextField fieldCaution, FurnitureManager furnitureManager) {		
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldBrand = fieldBrand;
		this.fieldCost = fieldCost;
		this.fieldCaution = fieldCaution;
		this.furnitureManager = furnitureManager;
	}
	
	public void actionPerformed(ActionEvent e) {
		FurnitureInput furniture = new WoodFurniture(FurnitureKind.Wood);
		try {
			furniture.setId(Integer.parseInt(fieldID.getText()));
			furniture.setFuniture(fieldName.getName());
			furniture.setBrand(fieldBrand.getText());
			furniture.setPrice(Integer.parseInt(fieldCost.getText()));
			furniture.setCaution(fieldCaution.getText());
			furnitureManager.addFurniture(furniture);
			putObject(furnitureManager, "furnituremanager.ser");
			furniture.printInfo();
		} catch (CautionFormatException e1) {
			e1.printStackTrace();
		}
	}
	
    public static void putObject(FurnitureManager furnitureManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(furnitureManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
