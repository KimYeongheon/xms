package TeamprojectFurniture;

import java.util.Scanner;

import exception.CautionFormatException;

public class GlassFurniture extends MiddleFurniture {
    
	protected String specialBrand;
    protected String specialCaution;
    
    public GlassFurniture(FurnitureKind kind){
    	super(kind);
    }
	
	public void getUserInput(Scanner input){
		setFurnitureID(input);
		setFurnitureName(input);
		setFurnitureBrand(input);
		setFurnitureCost(input);
		setFurnitureCautionwithYN(input);
		setParentCautionwithYN(input);
    }
	
    public void setParentCautionwithYN(Scanner input) {
        char answer='x';
        while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N'){
            System.out.println("Do you have special cautions? (Y/N)");
            answer=input.next().charAt(0);
            try {
	            if(answer=='y'||answer=='Y'){
	            	setFurnitureCaution(input);
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
	
    public void printInfo(){
    	String skind = getKindString();
        System.out.println("kind:"+skind+" id:"+id+" funiture: "+funiture+" brand: "+brand+" price: "+price+" caution: "+caution + " special brand: "+brand+" special caution: "+caution);
    } 
}