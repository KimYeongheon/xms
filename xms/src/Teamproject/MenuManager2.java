package Teamproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FurnitureManager furnitureManager = new FurnitureManager(input);
        
        selectMenu(input, furnitureManager);
    }

    public static void selectMenu(Scanner input, FurnitureManager furnitureManager) {
        int num = -1;
        while (num != 5){
        	try {
	        	showMenu();
	            num = input.nextInt();
	            switch(num) {
	            case 1:
	            	furnitureManager.addFurniture();
	            	break;
	            case 2:
	            	furnitureManager.deleteFurniture();
	            	break;
	            case 3:
	            	furnitureManager.editFurniture();
	            	break;
	            case 4:
	            	furnitureManager.viewFurniture();
	            	break;
	            default:
	                continue;
	            }
        	}
        	catch(InputMismatchException e) {
        		System.out.println("Please put an integer between 1 and 5!");
        		if (input.hasNext()){
        			input.next();
        		}
        		num = -1;
        	}
        }
    }
    
    public static void showMenu() {
        System.out.println("*** Furniture Management System Menu ***");
        System.out.println("1. Add Furnitures");
        System.out.println("2. Delete Furnitures");
        System.out.println("3. Edit Furnitures");
        System.out.println("4. View Furnitures");
        System.out.println("5. Exit");
        System.out.println("Select one number between 1 - 5:");
    }
}