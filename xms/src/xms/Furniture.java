package xms;

public class Furniture {
    int id;
    String funiture;
    String brand;
    int price;
    String material;
    String caution;

    public Furniture(){

    }
    public Furniture(int id, String funiture){

    }

    public Furniture(int id, String funiture,String brand,int price,String material, String caution){
        this.id=id;
        this.funiture=funiture;
        this.brand=brand;
        this.price=price;
        this.material=material;
        this.caution=caution;
    }
    public void printInfo(){
        System.out.println("id:"+id+" funiture: "+funiture+" brand: "+brand+" price: "+price+" material: "+material+" caution: "+caution);
    }
}