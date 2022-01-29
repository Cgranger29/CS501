import java.util.Scanner;

class ProgrammingAssignment1 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);  // Create a Scanner object
    double num1;
    double num2;
    double num3;
    double num4;

    num1 = scnr.nextInt();
    num2 = scnr.nextInt();
    num3 = scnr.nextInt();
    num4 = scnr.nextInt();

    double numProduct = num1*num2*num3*num4;
    double numAverage = (num1 + num2 + num3 + num4) / 4;

    int numProduct_round = (int)numProduct;
    int numAverage_round = (int)numAverage;
    System.out.print(numProduct_round);
    System.out.println(" " + numAverage_round);

    System.out.printf("%.3f " , numProduct);
    System.out.printf("%.3f", numAverage);
  }
}