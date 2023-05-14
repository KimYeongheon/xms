package TeamprojectFurniture;

import java.util.Scanner;

public class WoodFurniture extends Furniture implements FurnitureInput {
    
    public WoodFurniture (FurnitureKind kind){
    	super(kind);
    }
	
	public void getUserInput(Scanner input){
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        this.setId(id);
        
        System.out.print("Furniture name :");
        input.nextLine();
        String funiture = input.nextLine();
        this.setFuniture(funiture);
        
        System.out.print("Furniture brand :");
        String brand = input.nextLine();
        this.setBrand(brand);
        
        System.out.print("Furniture cost :");
        int price = input.nextInt();
        this.setPrice(price);
        
        System.out.print("Furniture caution :");
        input.nextLine();
        String caution = input.nextLine();
        this.setCaution(caution);
    }
	
    public void printInfo(){
    	String skind = "none";
    	switch(this.kind) {
    	case Wood:
    		skind = "Wood.";
    		break;
    	case Metal:
    		skind = "Metal";
    		break;
    	case Plastic:
    		skind = "Plastic";
    		break;
    	case Glass:
    		skind = "Glass";
    		break;
    	default:
    	}
        System.out.println("kind:"+skind+" id:"+id+" funiture: "+funiture+" brand: "+brand+" price: "+price+" caution: "+caution);
    }
}
