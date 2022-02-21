import java.util.ArrayList;

class ShoppingCart{
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

    public ShoppingCart(){
        this.customerName = "none";
        this.currentDate = "January 1, 2016";

    }

    public ShoppingCart(String name, String date){
        this.customerName = name;
        this.currentDate = date;

    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getDate(){
        return this.currentDate;
    }

    public void addItem(ItemToPurchase item){
        this.cartItems.add(item);

    }

    public void removeItem(String item){

        boolean itemFound = false;
        for(int i = 0; i < this.cartItems.size(); i++){
            if(this.cartItems.get(i).itemName.equals(item)){
                this.cartItems.remove(i);
                itemFound = true;
                break;
            }
        }

        if(!itemFound){
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public boolean checkForItem(ItemToPurchase item){
        for(int i = 0; i < this.cartItems.size(); i++){
            if(this.cartItems.get(i).itemName == item.itemName){
                return true;
            }
        }

        return false;
    }

    public ItemToPurchase getItem(String itemName){
        ItemToPurchase itemToReturn = new ItemToPurchase();
        for(int i = 0; i < this.cartItems.size(); i++){
            if(this.cartItems.get(i).getItemName().equals(itemName)){
                itemToReturn = this.cartItems.get(i);
                return itemToReturn;
            }
        }
        return itemToReturn;
    }

    public void modifyItem(ItemToPurchase item, String description){
        if(checkForItem(item)){
            item.setDescription(description);
        } else{
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }
    public void modifyItem(ItemToPurchase item, int quantity){
        if(checkForItem(item)){
            item.quantity = quantity;
        } else{
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public int getNumItemsInCart(){

        int itemTotal = 0;
        for (int i = 0; i < this.cartItems.size(); i++){
            itemTotal += this.cartItems.get(i).quantity;
        }

        return itemTotal;
    }

    public double getCostOfCart(){
        double totalCost = 0.0;
        for (int i = 0; i < this.cartItems.size(); i++){
            double costOfItem = (this.cartItems.get(i).quantity * this.cartItems.get(i).price);
            totalCost += costOfItem;
        }

        return totalCost;
    }

    public void printTotal(){

        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        if(this.cartItems.size() <= 0){
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            System.out.println("Number of items: " + this.getNumItemsInCart());
            System.out.println("");
            for (int i = 0; i < this.cartItems.size(); i++){
                this.cartItems.get(i).printItemCost();
            }
            System.out.println("\n");
            System.out.println("Total: " + this.getCostOfCart());

        }  
        
    }
    

    public void printDescriptions(){
        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        if(this.cartItems.size() <= 0){
            System.out.println("SHOPPING CART IS EMPTY");
           
        } else { 
        System.out.println("");
        System.out.println("Item Descriptions");
        for(int i = 0; i < this.cartItems.size(); i++){
            this.cartItems.get(i).printItemDescription();
        }
    }

}

}