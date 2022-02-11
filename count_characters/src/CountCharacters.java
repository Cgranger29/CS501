import java.util.Scanner;

// incomplete b/c all basic stuff
public class CountCharacters {

    public static String getInput(){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter a sentence or phrase: ");
        String userStr =  scnr.nextLine();
        scnr.close();
        return userStr;
    }

    public static void main(String[] args){
        System.out.println(getInput());

    }


}
