package Teamproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import TeamprojectFurniture.FurnitureInput;
import TeamprojectFurniture.FurnitureKind;
import TeamprojectFurniture.GlassFurniture;
import TeamprojectFurniture.MetalFurniture;
import TeamprojectFurniture.PlasticFurniture;
import TeamprojectFurniture.WoodFurniture;

public class FurnitureManager implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1585899128788056779L;
	
	ArrayList<FurnitureInput> furnitures = new ArrayList<FurnitureInput>();
    transient Scanner input;
    FurnitureManager(Scanner input) {
        this.input = input;
    }

    public void addFurniture() {
        int kind=0;
        FurnitureInput furnitureInput;
        while(kind < 1 || kind > 4) {
        	try {
	            System.out.println("1 for Wood");
	            System.out.println("2 for Metal");
	            System.out.println("3 for Plastic");
	            System.out.println("4 for Glass");
	            System.out.println("Select num 1, 2, 3 or 4 for Furniture Kind: ");
	            kind = input.nextInt();
	            if (kind == 1) {
	                furnitureInput=new WoodFurniture(FurnitureKind.Wood);
	                furnitureInput.getUserInput(input);
	                furnitures.add(furnitureInput);
	                break;
	            }
	            else if (kind == 2) {
	                furnitureInput=new MetalFurniture(FurnitureKind.Metal);
	                furnitureInput.getUserInput(input);
	                furnitures.add(furnitureInput);
	                break;
	            }
	            else if (kind==3){
	                furnitureInput=new PlasticFurniture(FurnitureKind.Plastic);
	                furnitureInput.getUserInput(input);
	                furnitures.add(furnitureInput);
	                break;
	            }
	            else if(kind==4){
	                furnitureInput=new GlassFurniture(FurnitureKind.Glass);
	                furnitureInput.getUserInput(input);
	                furnitures.add(furnitureInput);
	                break;
	            }
	            else {
	                System.out.println("Select num for Furniture Kind between 1 ~ 4: ");
	            }
        	} catch(InputMismatchException e) {
        		System.out.println("Please put an integer between 1 and 4!");
        		if (input.hasNext()){
        			input.next();
        		}
        		kind = -1;
        	}
        }
    }

    public void deleteFurniture() {
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        int index = findIndex(id);
        removefromFurnitures(index, id);
    }
    
    public int findIndex(int id) {
        int index = -1;
        for (int i = 0; i < furnitures.size(); i++) {
            if (furnitures.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    public int removefromFurnitures(int index, int id) {
        if (index >= 0) {
            furnitures.remove(index);
            System.out.println("the furniture " + id + " is deleted");
            return 1;
        } else {
            System.out.println("the furniture has not been registered.");
            return -1;
        }
    }

    public void editFurniture() {
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        for (int i = 0; i < furnitures.size(); i++) {
            FurnitureInput furniture = furnitures.get(i);
            if (furniture.getId() == id) {
                int num = -1;
                while (num != 6) {
                	showEditMenu();
                    num = input.nextInt();
                    switch(num) {
                    case 1:
                    	furniture.setFurnitureID(input);
                    	break;
                    case 2:
                    	furniture.setFurnitureName(input);
                    	break;
                    case 3:
                    	furniture.setFurnitureBrand(input);
                    	break;
                    case 4:
                    	furniture.setFurnitureCost(input);
                    	break;
                    case 5:
                    	furniture.setFurnitureCaution(input);
                    	break;
                    default:
                    	continue;
                    }
                }//while
                break;
            }//if
        }//for
    }

    public void viewFurniture() {
        System.out.println("# of registered furnitures:"+furnitures.size());
        for (int i = 0; i < furnitures.size(); i++) {
            furnitures.get(i).printInfo();
        }
    }
    

    
    public void showEditMenu() {
        System.out.println("*** Furniture Info Edit Menu ***");
        System.out.println("1. Edit Id");
        System.out.println("2. Edit Name");
        System.out.println("3. Edit Brand");
        System.out.println("4. Edit Cost");
        System.out.println("5. Edit Caution");
        System.out.println("6. Exit");
        System.out.println("Select one number between 1 - 7:");
    }
}