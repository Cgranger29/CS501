import java.util.Scanner;

class TestAverage{
    public static void main(String[] args){
        int test_score_1;
        int test_score_2;
        int test_score_3;
        float avg;

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the first test score: ");
        test_score_1 = scnr.nextInt();

        while(test_score_1 < 0 || test_score_1 > 100){
            System.out.println("Please enter a number > 0 or a number < 100");
            test_score_1 = scnr.nextInt();
        }
        System.out.println("Please enter the second test score: ");
        test_score_2 = scnr.nextInt();
        while(test_score_2 < 0 || test_score_2 > 100){
            System.out.println("Please enter a number > 0 or a number < 100");
            test_score_2 = scnr.nextInt();
        }
        System.out.println("Please enter the third test score: ");
        test_score_3 = scnr.nextInt();
        while(test_score_3 < 0 || test_score_3 > 100){
            System.out.println("Please enter a number > 0 or a number < 100");
            test_score_3 = scnr.nextInt();
        }

        avg = (float)(test_score_1 + test_score_2 + test_score_3) / 3;
        
        System.out.printf("Your average test score is %.2f\n", avg);
        scnr.close();
    }
}
