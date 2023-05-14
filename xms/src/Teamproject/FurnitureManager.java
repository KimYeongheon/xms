package Teamproject;

import TeamprojectFurniture.Furniture;
import TeamprojectFurniture.FurnitureInput;
import TeamprojectFurniture.FurnitureKind;
import TeamprojectFurniture.GlassFurniture;
import TeamprojectFurniture.MetalFurniture;
import TeamprojectFurniture.PlasticFurniture;
import TeamprojectFurniture.WoodFurniture;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureManager {
    ArrayList<FurnitureInput> furnitures = new ArrayList<FurnitureInput>();
    Scanner input;

    FurnitureManager(Scanner input) {
        this.input = input;
    }

    public void addFurniture() {
        int kind=0;
        FurnitureInput furnitureInput;
        while(kind!=1&&kind!=2&&kind!=3&&kind!=4) {
            System.out.println("1 for Wood");
            System.out.println("2 for Metal");
            System.out.println("3 for Plastic");
            System.out.println("4 for Glass");
            System.out.println("Select num 1, 2, 3 or 4 for Furniture Kind: ");
            kind = input.nextInt();
            if (kind == 1) {
                furnitureInput=new WoodFurniture(FurnitureKind.Wood);
                furnitureInput.getUserInput(input);
                furnitures.add(furnitureInput);
                break;
            }
            else if (kind == 2) {
                furnitureInput=new MetalFurniture(FurnitureKind.Metal);
                furnitureInput.getUserInput(input);
                furnitures.add(furnitureInput);
                break;
            }
            else if (kind==3){
                furnitureInput=new PlasticFurniture(FurnitureKind.Plastic);
                furnitureInput.getUserInput(input);
                furnitures.add(furnitureInput);
                break;
            }
            else if(kind==4){
                furnitureInput=new GlassFurniture(FurnitureKind.Glass);
                furnitureInput.getUserInput(input);
                furnitures.add(furnitureInput);
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
            FurnitureInput furnitureInput = furnitures.get(i);
            if (furnitureInput.getId() == id) {
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
                        furnitureInput.setId(furnitureid);
                    } else if (num == 2) {
                        System.out.println("Furniture Name: ");
                        input.nextLine();
                        String funiture = input.nextLine();
                        furnitureInput.setFuniture(funiture);
                    } else if (num == 3) {
                        System.out.println("Furniture Brand: ");
                        input.nextLine();
                        String brand = input.nextLine();
                        furnitureInput.setBrand(brand);
                    } else if (num == 4) {
                        System.out.println("Furniture Cost: ");
                        int price = input.nextInt();
                        furnitureInput.setPrice(price);
                    }
                      else if (num == 5) {
                        System.out.println("Furniture Caution: ");
                        input.nextLine();
                        String caution = input.nextLine();
                        furnitureInput.setCaution(caution);
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