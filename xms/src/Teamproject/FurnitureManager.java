package Teamproject;

import TeamprojectFurniture.Furniture;
import TeamprojectFurniture.GlassFurniture;
import TeamprojectFurniture.MetalFurniture;
import TeamprojectFurniture.PlasticFurniture;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureManager {
    ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
    Scanner input;

    FurnitureManager(Scanner input) {
        this.input = input;
    }

    public void addFurniture() {
        int kind=0;
        Furniture furniture;
        while(kind!=1&&kind!=2&&kind!=3&&kind!=4) {
            System.out.println("1 for Wood");
            System.out.println("2 for Metal");
            System.out.println("3 for Plastic");
            System.out.println("4 for Glass");
            System.out.println("Select num for Furniture Kind: ");
            kind = input.nextInt();
            if (kind == 1) {
                furniture=new Furniture();
                furniture.getUserInput(input);
                furnitures.add(furniture);
                break;
            }
            else if (kind == 2) {
                furniture=new MetalFurniture();
                furniture.getUserInput(input);
                furnitures.add(furniture);
                break;
            }
            else if (kind==3){
                furniture=new PlasticFurniture();
                furniture.getUserInput(input);
                furnitures.add(furniture);
                break;
            }
            else if(kind==4){
                furniture=new GlassFurniture();
                furniture.getUserInput(input);
                furnitures.add(furniture);
                break;
            }
            else {
                System.out.println("Select num for Furniture Kind between 1 ~ 4: ");
            }
        }
    }

    public void deleteFurniture() {
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        int index = -1;
        for (int i = 0; i < furnitures.size(); i++) {
            if (furnitures.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            furnitures.remove(index);
            System.out.println("the furniture " + id + " is deleted");
        } else {
            System.out.println("the furniture has not been registered.");
            return;
        }
    }

    public void editFurniture() {
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        for (int i = 0; i < furnitures.size(); i++) {
            Furniture furniture = furnitures.get(i);
            if (furniture.getId() == id) {
                int num = -1;
                while (num != 6) {
                    System.out.println("*** Furniture Info Edit Menu ***");
                    System.out.println("1. Edit Id");
                    System.out.println("2. Edit Name");
                    System.out.println("3. Edit Brand");
                    System.out.println("4. Edit Cost");
                    System.out.println("5. Edit Caution");
                    System.out.println("6. Exit");
                    System.out.println("Select one number between 1 - 7:");
                    num = input.nextInt();
                    if (num == 1) {
                        System.out.println("Furniture ID: ");
                        int furnitureid = input.nextInt();
                        furniture.setId(furnitureid);
                    } else if (num == 2) {
                        System.out.println("Furniture Name: ");
                        input.nextLine();
                        String funiture = input.nextLine();
                        furniture.setFuniture(funiture);
                    } else if (num == 3) {
                        System.out.println("Furniture Brand: ");
                        input.nextLine();
                        String brand = input.nextLine();
                        furniture.setBrand(brand);
                    } else if (num == 4) {
                        System.out.println("Furniture Cost: ");
                        int price = input.nextInt();
                        furniture.setPrice(price);
                    }
                      else if (num == 5) {
                        System.out.println("Furniture Caution: ");
                        input.nextLine();
                        String caution = input.nextLine();
                        furniture.setCaution(caution);
                    } else {
                        continue;
                    }//if
                }//while
                break;
            }//if
        }//for
    }

    public void viewFurniture() {
//        System.out.println("Furniture ID:");
//        int id=input.nextInt();
        System.out.println("# of registered furnitures:"+furnitures.size());
        for (int i = 0; i < furnitures.size(); i++) {
            furnitures.get(i).printInfo();
        }
    }
}