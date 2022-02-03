import java.util.Scanner;

class DrawRightTriangle{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        char triangleChar;
        int triangleHeight;
        
        System.out.println("Enter a character:");
        triangleChar = scnr.next().charAt(0);   
        
        System.out.println("Enter triangle height:");
        triangleHeight = scnr.nextInt();
        int start = 0;
        while (start <= triangleHeight -1){
            for(int i = 0; i < start; i++){
                System.out.print(triangleChar + " ");
            }
            start +=1;
            System.out.println(triangleChar);
        }
    }
}