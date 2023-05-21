package TeamprojectFurniture;

import java.util.Scanner;

public class WoodFurniture extends Furniture {
    
    public WoodFurniture (FurnitureKind kind){
    	super(kind);
    }
	
	public void getUserInput(Scanner input){
		setFurnitureID(input);
		setFurnitureName(input);
		setFurnitureBrand(input);
		setFurnitureCost(input);
		setFurnitureCaution(input);
    }
	
    public void printInfo(){
    	String skind = getKindString();
        System.out.println("kind:"+skind+" id:"+id+" funiture: "+funiture+" brand: "+brand+" price: "+price+" caution: "+caution);
    }
}