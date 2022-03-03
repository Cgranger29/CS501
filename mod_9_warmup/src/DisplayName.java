import java.util.Scanner;

public class DisplayName{

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String input_string = "";
        System.out.println("Enter input string:");


        while(!input_string.equals("q")){
            input_string = scnr.nextLine();
            if (input_string.equals("q")){
                break;
            }
            String first_name = "";
            String last_name = "";
            if(input_string.contains(",")){
                int curr = 0;
                for(int i = 0; i < input_string.length(); i++){
                    if(Character.isLetter(input_string.charAt(i))){
                        first_name += input_string.charAt(i);
                    } else {
                        break;
                    }
                    curr += 1;
                }

                for (int i = curr; i < input_string.length(); i++){
                    if(Character.isLetter(input_string.charAt(i))){
                        last_name += input_string.charAt(i);
                    }
                }
                System.out.println("First word: " + first_name);
                System.out.println("Second word: " + last_name);
            } else {
                System.out.println("Error: no comma in string.");
            }
            System.out.println("");
            System.out.println("Enter input string:");
        }
        
    }
}