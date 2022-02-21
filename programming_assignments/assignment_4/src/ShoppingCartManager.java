import java.util.Scanner;

class ShoppingCartManager{

    public static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args){

        
        String customerName;
        String date;

        System.out.println("Enter Customers Name:");
        customerName = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        date = scnr.next();
        
        System.out.println("");
        System.out.println("Customers name: " + customerName);
        System.out.println("Today's Date: " + date);

        ShoppingCart customerCart = new ShoppingCart(customerName, date);

        printMenu(customerCart);
        scnr.close();



    }

    public static void printMenu(ShoppingCart cart){

        char answer = 'z';
        
        while(answer != 'q'){
            System.out.println("");
            System.out.println("MENU");
            System.out.println("a - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit");  
            answer = scnr.next().charAt(0);

            if(answer == 'a'){
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                scnr.nextLine();
                String itemName = scnr.nextLine();

                System.out.println("Enter the item description:");
                String itemDescription = scnr.nextLine();
                System.out.println("Enter the item price:");
                int itemPrice = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                int itemQty = scnr.nextInt();

                ItemToPurchase itemToAdd = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQty);

                cart.addItem(itemToAdd);

            } else if(answer == 'd'){
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                scnr.nextLine();
                String itemToRemove = scnr.nextLine();
                cart.removeItem(itemToRemove);

            } else if(answer == 'c'){
              System.out.println("CHANGE ITEM QUANTIY");
              System.out.println("Enter the item name:");
              scnr.nextLine();
              String itemDesc = scnr.nextLine();
              System.out.println("Enter the new quantity:");
              int amt = scnr.nextInt();
              
              ItemToPurchase targetItem = new ItemToPurchase();

              targetItem = cart.getItem(itemDesc);

              cart.modifyItem(targetItem, amt);

            } else if (answer == 'i'){
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();

            } else if (answer == 'o'){
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
            }
        }
        
    }

}