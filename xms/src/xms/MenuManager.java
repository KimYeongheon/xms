package xms;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		 int num = 0;
		 Scanner input = new Scanner(System.in);

	     while (num != 6) {
	    	 System.out.println("1. Add Furnitures");
	         System.out.println("2. Delete Furnitures");
	         System.out.println("3. Edit Furnitures");
	         System.out.println("4. View Furnitures");
	         System.out.println("5. Show a menu");
	         System.out.println("6. Exit");
	         System.out.println("Select one number between 1-6");
	         num = input.nextInt();
	         switch (num) {
	         	case 1:
	         		System.out.println("Furniture identification number :");
	                int id = input.nextInt();
	                System.out.println("Furniture name :");
	                input.nextLine();
	                String furniture = input.nextLine();
	                System.out.println("Furniture brand :");
	                String brand= input.nextLine();
	                System.out.println("Furniture cost :");
	                int price = input.nextInt();
	                input.nextLine();
	                System.out.println("Furniture material :");
	                String material = input.nextLine();
	                System.out.println("Furniture caution :");
	                String caution = input.nextLine();
	                break;
	         	case 2:
	            case 3:
	            case 4:
	            	System.out.println("Furniture identification number :");
	                int id_2 = input.nextInt();
	         }
	     }
    }
}