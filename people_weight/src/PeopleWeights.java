import java.util.Scanner;


public class PeopleWeights {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        final int NUM_WEIGHTS = 5;
        double[] userWeights = new double[NUM_WEIGHTS];
        
        double totalWeight = 0;
        double avgWeight;
        double maxWeight;

        for(int i = 0; i < NUM_WEIGHTS; i++){
            System.out.println("Enter a weight: ");
            userWeights[i] = scnr.nextDouble();
            totalWeight += userWeights[i];


        }

        avgWeight = totalWeight / NUM_WEIGHTS;

        maxWeight = userWeights[0];
        for(int i = 1; i < userWeights.length; i++){
            if(userWeights[i] > maxWeight){
                maxWeight = userWeights[i];
            }
        }


    }
}
