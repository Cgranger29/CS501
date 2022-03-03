import java.util.Scanner;


public class ContactNode {
    private String contactName;
    private String contactPhoneNumber;
    private ContactNode nextNodePtr;

    public ContactNode(Scanner scnr){
        
        System.out.println("Enter name: ");
        contactName = scnr.nextLine();
        System.out.println("Enter phone number: ");
        contactPhoneNumber = scnr.nextLine();

    }
    public String getName(){
        return contactName;

    }

    public String getPhoneNumber(){
        return contactPhoneNumber;
    }

    public void insertAfter(ContactNode currentNode){
        nextNodePtr = currentNode;

    }

    public ContactNode getNext(){
        return nextNodePtr;
    }

    public void printContactNode(){
        System.out.println("Name: " + contactName);
        System.out.println("Phone number: " + contactPhoneNumber);
    }

    // public static void main(String[] args){
    //     Scanner scnr = new Scanner(System.in);
    //     ContactNode contact1 = new ContactNode(scnr);
    //     System.out.println(contact1.getName());
    //     System.out.println(contact1.getPhoneNumber());
    //     contact1.printContactNode();
    //     scnr.close();

    // }
}
