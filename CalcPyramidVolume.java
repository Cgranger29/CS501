import java.util.Scanner;

public class CalcPyramidVolume {

   /* Your solution goes here  */
   public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight){
      double base_area = baseLength * baseWidth;
      
      double volume = base_area * pyramidHeight * (1/3.0);

      return volume;
      
      }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double userLength;
      double userWidth;
      double userHeight;

      userLength = scnr.nextDouble();
      userWidth = scnr.nextDouble();
      userHeight = scnr.nextDouble();

      System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
   }
}