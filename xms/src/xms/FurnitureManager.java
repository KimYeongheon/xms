package xms;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureManager {
    ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
    Scanner input;

    FurnitureManager(Scanner input) {
        this.input = input;
    }

    public void addFurniture() {
        Furniture furniture = new Furniture();
        furniture = new Furniture();
        System.out.print("Furniture identification number :");
        furniture.id = input.nextInt();
        System.out.print("Furniture name :");
        input.nextLine();
        furniture.funiture = input.nextLine();
        System.out.print("Furniture brand :");
        furniture.brand = input.nextLine();
        System.out.print("Furniture cost :");
        furniture.price = input.nextInt();
        System.out.print("Furniture material :");
        input.nextLine();
        furniture.material = input.nextLine();
        System.out.print("Furniture caution :");
        furniture.caution = input.nextLine();
        furnitures.add(furniture);
    }

    public void deleteFurniture() {
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        int index = -1;
        for (int i = 0; i < furnitures.size(); i++) {
            if (furnitures.get(i).id == id) {
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
            if (furniture.id == id) {
                int num = -1;
                while (num != 7) {
                    System.out.println("*** Furniture Info Edit Menu ***");
                    System.out.println("1. Edit Id");
                    System.out.println("2. Edit Name");
                    System.out.println("3. Edit Brand");
                    System.out.println("4. Edit Cost");
                    System.out.println("5. Edit Material");
                    System.out.println("6. Edit Caution");
                    System.out.println("7. Exit");
                    System.out.println("Select one number between 1 - 7:");
                    num = input.nextInt();
                    if (num == 1) {
                        System.out.println("Furniture ID: ");
                        furniture.id = input.nextInt();
                    } else if (num == 2) {
                        System.out.println("Furniture Name: ");
                        input.nextLine();
                        furniture.funiture = input.nextLine();
                    } else if (num == 3) {
                        System.out.println("Furniture Brand: ");
                        input.nextLine();
                        furniture.brand = input.nextLine();
                    } else if (num == 4) {
                        System.out.println("Furniture Cost: ");
                        furniture.price = input.nextInt();
                    } else if (num == 5) {
                        System.out.println("Furniture Material: ");
                        input.nextLine();
                        furniture.material = input.nextLine();
                    } else if (num == 6) {
                        System.out.println("Furniture Caution: ");
                        input.nextLine();
                        furniture.caution = input.nextLine();
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
        for (int i = 0; i < furnitures.size(); i++) {
            furnitures.get(i).printInfo();
        }
    }
}