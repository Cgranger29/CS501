import java.util.Scanner;

public class PlayerRoster{

    private static int[] jerseyNums = new int[5];
    private static int[] playerRatings = new int[5];


    public static void displayMenu(){
        //displays menu
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");

        System.out.println("");

    }

    public static void getInfo(Scanner scnr){
        // inital prompt for 5 jersey numbers and ratings
        for (int i = 0; i < 5; i++){

            System.out.println("Enter player " + (i + 1) + "'s jersey number:");
            int jerseyNum = scnr.nextInt();
            System.out.println("Enter player " + (i + 1) + "'s rating:");
            int playerRating = scnr.nextInt();

            jerseyNums[i] = jerseyNum;
            playerRatings[i] = playerRating;

            System.out.println("");

        }

    }

    public static void outputRoster(){
        System.out.println("ROSTER");
        for (int i = 0; i < jerseyNums.length; i++){
            System.out.println("Player " + (i + 1) + " -- " + "Jersey number: " + jerseyNums[i] + ", " + "Rating: " + playerRatings[i]);
        }

        System.out.println("");
    }

    public static void updatePlayerRating(Scanner scnr){
        System.out.println("Enter a jersey number:");
        int newNum = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        int newRating = scnr.nextInt();

        for(int i = 0; i < jerseyNums.length; i++){
            if (jerseyNums[i] == newNum){
                jerseyNums[i] = newNum;
                playerRatings[i] = newRating;
            }
        }

        
    }

    public static void outputPlayerAboveRating(Scanner scnr){
        System.out.println("Enter a rating:");
        int aboveRating = scnr.nextInt();

        System.out.println("ABOVE " + aboveRating);
        for (int i = 0; i < playerRatings.length; i++){
            if(playerRatings[i] > aboveRating){
                System.out.println("Player " + (i+1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + playerRatings[i]);
            }
        }

        System.out.println("");


    }

    public static void replacePlayer(Scanner scnr){
        System.out.println("Enter a jersey number:");
        int jerseySearch = scnr.nextInt();

        for(int i = 0; i < jerseyNums.length; i++){
            if (jerseyNums[i] == jerseySearch){
                System.out.println("Enter a new jersey number: ");
                int newNum = scnr.nextInt();
                System.out.println("Enter a rating for the new player:");
                int newRating = scnr.nextInt();
                jerseyNums[i] = newNum;
                playerRatings[i] = newRating;
                break;
            }
        }

        System.out.println("");


    }
    public static void main(String args[]){
        //Driver funtion
        Scanner scnr = new Scanner(System.in);

        getInfo(scnr);

        outputRoster();

        displayMenu();

        System.out.println("Choose an option:");

        String userOption = scnr.next();

        while(!userOption.equals("q")){
            if(userOption.equals("u")){
                updatePlayerRating(scnr);
            } else if(userOption.equals("a")){
                outputPlayerAboveRating(scnr);

            } else if(userOption.equals("r")){
                replacePlayer(scnr);
            } else if(userOption.equals("o")){
                outputRoster();
            }  else if(userOption.equals("q")){
                System.out.println("Quitting");
                break;
            } else {

            }
            displayMenu();
            System.out.println("Choose an option:");
            userOption = scnr.next();
        }


        scnr.close();


    }
}