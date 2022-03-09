import java.util.Scanner;

class BMI{
    public static void main(String[] args){
        double weight;
        double height;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: \n");
        weight = scnr.nextDouble();
        System.out.print("Enter the height in inches: \n");
        height = scnr.nextDouble();

        double bmi_calc = (weight / (height * height) * 703);
        System.out.printf("BMI is %.2f",  bmi_calc);

        scnr.close();
        }
}
