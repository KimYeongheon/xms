/*package xms;

import java.util.Scanner;

public class MenuManager2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FurnitureManager furnitureManager = new FurnitureManager(input);

        int num = -1;
        while (num != 5) {
            System.out.println("*** Furniture Management System Menu ***");
            System.out.println("1. Add Furnitures");
            System.out.println("2. Delete Furnitures");
            System.out.println("3. Edit Furnitures");
            System.out.println("4. View Furnitures");
            System.out.println("5. Exit");
            System.out.println("Select one number between 1 - 5:");
            num = input.nextInt();
            if (num == 1) {
                furnitureManager.addFurniture();
            } else if (num == 2) {
                furnitureManager.deleteFurniture();
            } else if (num == 3) {
                furnitureManager.editFurniture();
            } else if (num == 4) {
                furnitureManager.viewFurniture();
            } else {
                continue;
            }
        }
    }
}*/