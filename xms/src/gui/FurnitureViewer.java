package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Teamproject.FurnitureManager;
import TeamprojectFurniture.FurnitureInput;

public class FurnitureViewer extends JPanel {
	
	WindowFrame frame;
	
	FurnitureManager furnitureManager;

	public FurnitureViewer(WindowFrame frame, FurnitureManager furnitureManager) {
		this.frame = frame;
		this.furnitureManager = furnitureManager;
		
		System.out.println("***" + furnitureManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Brand");
		model.addColumn("Cost");
		model.addColumn("Caution");
		
		for(int i = 0; i < furnitureManager.size(); i++) {
			Vector row = new Vector();
			FurnitureInput fi = furnitureManager.get(i);
			row.add(fi.getId());
			row.add(fi.getFuniture());
			row.add(fi.getBrand());
			row.add(fi.getPrice());
			row.add(fi.getCaution());
			model.addRow(row);
		}
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
