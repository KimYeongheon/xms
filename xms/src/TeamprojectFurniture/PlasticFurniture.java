package TeamprojectFurniture;

import java.util.Scanner;

public class PlasticFurniture extends MiddleFurniture {
	
    public PlasticFurniture(FurnitureKind kind){
    	super(kind);
    }
	
    public void getUserInput(Scanner input){
		setFurnitureID(input);
		setFurnitureName(input);
		setFurnitureBrand(input);
		setFurnitureCost(input);
		setFurnitureCautionwithYN(input);
    }
}