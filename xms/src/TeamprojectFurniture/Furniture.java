package TeamprojectFurniture;

import TeamprojectFurniture.FurnitureKind;

import java.util.Scanner;

public class Furniture {
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

    public void setCaution(String caution) {
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
}