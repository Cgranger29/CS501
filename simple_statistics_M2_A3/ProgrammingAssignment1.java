import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

class ProgrammingAssignment1 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
  
    int num1 = scnr.nextInt();
    int num2 = scnr.nextInt();
    int num3 = scnr.nextInt();
    int num4 = scnr.nextInt();

    int numProduct = num1*num2*num3*num4;
    int numAverage = (num1 + num2 + num3 + num4) / 4;

    System.out.println(numProduct + " " + numAverage);

    double float_numProduct = (double)num1 * (double)num2 *(double)num3 * (double)num4;
    double float_numAverage = ((float)num1 + (float)num2 +(float)num3 +(float)num4)/4;

    System.out.printf("%.3f ", float_numProduct);
    System.out.printf("%.3f\n", float_numAverage);
}
}