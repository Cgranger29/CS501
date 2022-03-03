import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class testing {

    public static void main(String[] args){
        FileInputStream fbStream = null; 
        Scanner inFS = null;         
        int value = 0;                             
        fbStream = new FileInputStream("data.txt");
        inFS = new Scanner(fbStream);
        value = inFS.nextInt();
        System.out.println("Value: " + value);
        fbStream.close();

    }

}
