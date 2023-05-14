package TeamprojectFurniture;

import java.util.Scanner;

public class MetalFurniture extends Furniture implements FurnitureInput{
	
    public MetalFurniture(FurnitureKind kind){
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

        char answer='x';
        while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N'){
            System.out.println("Do you have any caution? (Y/N)");
            answer=input.next().charAt(0);
            if(answer=='y'||answer=='Y'){
                System.out.println("Furniture caution:");
                input.nextLine();
                String caution=input.nextLine();
                this.setCaution(caution);
                break;
            }
            else if(answer=='n'|| answer=='N'){
                this.setCaution("");
                break;
            }
            else{

            }
        }
        
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