import java.util.Random;


public class GameIsland {
        
    public static void main(String[] args) throws Exception {
        System.out.println("Guess the Island country!");
        System.out.println("The fewer hints you need to identify the Island country, the more points you earn.");
        int score = 0;

        //array of all islads
        int numOfIC = 48;
        Island[] ICArray = new Island[numOfIC];
        
        //Creates subset of 10 Island Countries for use in this round
        Random rand = new Random();
        Island[] ICSubset = new Island[numOfIC];
        int randomNum = rand.nextInt(48);
            //need to get this to select 10 unique numbers

        

        

    }

}
