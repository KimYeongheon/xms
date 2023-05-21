package TeamprojectFurniture;

import java.util.Scanner;

import exception.CautionFormatException;

public interface FurnitureInput {
	
    public int getId();
    
    public void setId(int id);
    
    public void setFuniture(String funiture);
    
    public void setBrand(String brand);
    
    public void setPrice(int price);
    
    public void setCaution(String caution) throws CautionFormatException;
	
	public void getUserInput(Scanner input);
	
    public void printInfo();
    
    public void setFurnitureID(Scanner input);
    
    public void setFurnitureName(Scanner input);
    
    public void setFurnitureBrand(Scanner input);
    
    public void setFurnitureCost(Scanner input);
    
    public void setFurnitureCaution(Scanner input);
}