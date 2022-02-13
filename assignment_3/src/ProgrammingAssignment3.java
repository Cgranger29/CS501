import java.util.Scanner;

public class ProgrammingAssignment3 {
    
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userValue = scnr.nextInt();

        if (userValue >= 11 && userValue <= 100){
            
            boolean checkDigit = (userValue % 10) == (userValue / 10);
            while(!checkDigit){
            System.out.print(userValue + " ");
            userValue -=1;
            checkDigit = (userValue % 10) == (userValue / 10);
        }
    
            System.out.println(userValue + " ");
    } else {

            System.out.println("Input must be 11-100");
        }

        scnr.close();
    

        }
 
        
    }
