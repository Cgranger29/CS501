import java.util.Scanner;

public class ContactList {

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        // ContactNode currNode;

        
        // System.out.println("Person 1");
        // ContactNode Person1 = new ContactNode(scnr);
        // currNode = Person1;
        // System.out.println("Person 2");
        // ContactNode Person2 = new ContactNode(scnr);
        // Person1.insertAfter(Person2);
        // System.out.println("Person 3");
        // ContactNode Person3 = new ContactNode(scnr);
        // Person2.insertAfter(Person3);

        // System.out.println("CONTACT LIST");
        // while(currNode != null){
        //     currNode.printContactNode();
        //     System.out.println("");
        //     currNode = currNode.getNext();
        // }
        // scnr.close();

        ContactNode test;
        ContactNode test2 = new ContactNode(scnr);
        test = test2;
        System.out.print(test);
        System.out.print(test2);

        
    }

}
