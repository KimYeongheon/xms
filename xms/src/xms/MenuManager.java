/*package xms;

import java.util.Scanner;

public class MenuManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;

        while (num != 6) {
        	System.out.println("*** Furniture Management System Menu ***");
            System.out.println("1. Add Furnitures");
            System.out.println("2. Delete Furnitures");
            System.out.println("3. Edit Furnitures");
            System.out.println("4. View Furnitures");
            System.out.println("5. Show a menu");
            System.out.println("6. Exit");
            System.out.println("Select one number between 1 - 6:");
            num = input.nextInt();
            if (num == 1) {
                addFurniture();
            }
            else if (num == 2){
                deleteFurniture();
            }
            else if (num == 3){
                editFurniture();
            }
            else if (num == 4){
                viewFurniture();
            }
            else {
            	continue;
            }
        }
    }
    
    public static void addFurniture() {
        Scanner input = new Scanner(System.in);
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
        System.out.print("Furniture name :");
        input.nextLine();
        String furniture = input.nextLine();
        System.out.print("Furniture brand :");
        String brand= input.nextLine();
        System.out.print("Furniture cost :");
        int price = input.nextInt();
        System.out.println(price); //입력받은 가격을 한번 더 출력
        System.out.print("Furniture material :");
        input.nextLine();
        String material = input.nextLine();
        System.out.print("Furniture caution :");
        String caution = input.nextLine();
        System.out.println(caution); //입력받은 주의사항을 한번 더 출력
    }
    
    public static void deleteFurniture() {
        Scanner input = new Scanner(System.in);
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
    }
    
    public static void editFurniture() {
        Scanner input = new Scanner(System.in);
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
    }
    
    public static void viewFurniture() {
        Scanner input = new Scanner(System.in);
        System.out.print("Furniture identification number :");
        int id = input.nextInt();
    }
}*/