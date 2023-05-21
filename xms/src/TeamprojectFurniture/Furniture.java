package TeamprojectFurniture;

import TeamprojectFurniture.FurnitureKind;
import exception.CautionFormatException;

import java.util.Scanner;

public abstract class Furniture implements FurnitureInput { //abstract를 붙임으로서 더이상 Furniture라는 객체를 생성하지 않는다는 뜻
    protected FurnitureKind kind = FurnitureKind.Wood;
    protected int id;
    protected String funiture;
    protected String brand;
    protected int price;
    protected String caution;

    public Furniture(){

    }
    
    public Furniture(FurnitureKind kind){
    	this.kind=kind;
    }
    
    public Furniture(int id, String funiture){

    }

    public Furniture(int id, String funiture,String brand,int price, String caution){
        this.id=id;
        this.funiture=funiture;
        this.brand=brand;
        this.price=price;
        this.caution=caution;
    }
    
    public Furniture(FurnitureKind kind, int id, String funiture,String brand,int price, String caution){
        this.kind = kind;
    	this.id=id;
        this.funiture=funiture;
        this.brand=brand;
        this.price=price;
        this.caution=caution;
    }
    
    public String getCaution() {
        return caution;
    }

    public void setCaution(String caution) throws CautionFormatException {
    	if (caution.length() < 3 && !caution.equals("")) {
    		throw new CautionFormatException();
    	}
        this.caution = caution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuniture() {
        return funiture;
    }

    public void setFuniture(String funiture) {
        this.funiture = funiture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public FurnitureKind getKind() {
        return kind;
    }

    public void setKind(FurnitureKind kind) {
        this.kind = kind;
    }
    
    public abstract void printInfo();
    
    public void setFurnitureID(Scanner input) {
        System.out.println("Furniture ID: ");
        int furnitureid = input.nextInt();
        this.setId(furnitureid);
    }
    
    public void setFurnitureName(Scanner input) {
        System.out.println("Furniture Name: ");
        input.nextLine();
        String funiture = input.nextLine();
        this.setFuniture(funiture);
    }
    
    public void setFurnitureBrand(Scanner input) {
        System.out.println("Furniture Brand: ");
        String brand = input.nextLine();
        this.setBrand(brand);
    }
    
    public void setFurnitureCost(Scanner input) {
        System.out.println("Furniture Cost: ");
        int price = input.nextInt();
        this.setPrice(price);
    }
    
    public void setFurnitureCaution(Scanner input) {
    	String caution = "";
    	input.nextLine();
    	while (caution.length() < 3) {
	        System.out.println("Furniture Caution: ");
	        caution = input.nextLine();
	        try {
	        	this.setCaution(caution);
	        } catch (CautionFormatException e) {
	        	System.out.println("Incorrect Caution Format. Fill it out in detail.");
	        }
        }
    }
    
    public String getKindString() {
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
    	return skind;
    }
}