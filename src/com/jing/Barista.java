package com.jing;

import java.util.Scanner;

public class Barista {
    private Menu menu;
    private Inventory inventory;
    public Barista()
    {
           menu = new Menu();
           inventory = new Inventory(10);
    }

    public void displayMenu()
    {
        menu.display(inventory);
    }

    public void displayInventory()
    {
        inventory.display();
    }
    public void restock()
    {
        inventory.restock(10);
        displayInventory();
        displayMenu();
    }
    public void dispenseDrink(int index)
    {
        inventory.dispense(menu.getDrinkByIndex(index));
        displayMenu();
        displayInventory();
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("\'R\' or \'r\' - restock the inventory and redisplay the menu");
        System.out.println("\'Q\' or \'q\' - quit the application");
        System.out.println("[1-6] - order the drink with the corresponding number in the menu");
        Barista coffeeMachine = new Barista();
        Scanner in = new Scanner(System.in);
        while(true)
        {
            String input = in.nextLine();
            if (input.toLowerCase().compareTo("q") == 0 )
                System.exit(0);
            if (input.toLowerCase().compareTo("r") == 0 )
            {
                coffeeMachine.restock();
                continue;
            }

            if (input.matches("[1-6]"))
            {
                coffeeMachine.dispenseDrink(Integer.parseInt(input)-1);
                continue;


            }
            System.out.println("Invalid selection: " + input);

        }

    }
}
