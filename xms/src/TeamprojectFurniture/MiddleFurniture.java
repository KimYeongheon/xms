package TeamprojectFurniture;

import java.util.Scanner;

import exception.CautionFormatException;

public abstract class MiddleFurniture extends Furniture {
	
    public MiddleFurniture(FurnitureKind kind){
    	super(kind);
    }

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
    public void printInfo(){
    	String skind = getKindString();
        System.out.println("kind:"+skind+" id:"+id+" funiture: "+funiture+" brand: "+brand+" price: "+price+" caution: "+caution);
    }
	
    public void setFurnitureCautionwithYN(Scanner input) {
        char answer='x';
        while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N'){
            System.out.println("Do you have any caution? (Y/N)");
            answer=input.next().charAt(0);
            try {
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
            catch(CautionFormatException e) {
            	System.out.println("Incorrect Caution Format. Fill it out in detail.");
            }
        } 
    }
}