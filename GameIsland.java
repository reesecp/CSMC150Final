import java.util.*;


public class GameIsland {
    public static void arrayShuffler (Island[] allIslands) {
        Random rand = new Random();
        for (int i = 0; i < allIslands.length - 1; i++) {
			int randomIndex = i + 1 + rand.nextInt(allIslands.length - i - 1);
			Island placeHolder = new Island();
            placeHolder = allIslands[i];
            allIslands[i] = allIslands[randomIndex];
            allIslands[randomIndex] = placeHolder;
        }
	}

    public static boolean guessChecker (Island answer, String guessCountry){
        String answerCountry = answer.getCountry(); 
        answerCountry = answerCountry.toLowerCase();
        guessCountry = guessCountry.toLowerCase();
        return((guessCountry.equals(answerCountry)));
    }
        
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
         
        //constructors for all island objects
        Island Antigua = new Island();
        Island Bahamas = new Island(1, "the Bahamas", 
            "Nassau", "the Caribbean Sea"); 
        Island Bahrain = new Island(2, "Bahrain",
            "Manama", "the Persian Gulf");
        Island Barbados = new Island(3, "Barbados",
            "Bridgetown", "the Caribbean Sea");
        Island CapeVerde = new Island(4, "Cape Verde",
            "Praia", "the Atlantic Ocean");
        Island Comoros = new Island(5, "the Comoros",
            "Moroni", "the Indian Ocean");
        Island Cuba = new Island(6, "Cuba",
            "Havana", "the Caribbean Sea");
        Island Cyprus = new Island(7, "Cyprus",
            "Nicosia", "the Mediterranean Sea");
        Island Dominica = new Island(8, "Dominica",
            "Roseau", "the Caribbean Sea");
        Island Fiji = new Island(9, "Fiji",
            "Suva", "the Pacific Ocean");
        Island Grenada = new Island(10, "Grenada",
            "St. George's", "the Caribbean Sea");
        Island Iceland = new Island(11, "Iceland", 
            "Reykjavík", "the Atlantic Ocean"); 
        Island Jamaica = new Island(12, "Jamaica", 
            "Kingston", "the Caribbean Sea"); 
        Island Japan = new Island(13, "Japan", 
            "Tokyo", "the Pacific Ocean"); 
        Island Kiribati = new Island(14, "Kiribati", 
            "South Tarawa", "the Pacific Ocean"); 
        Island Madagascar = new Island(15, "Madagascar", 
            "Antananarivo", "the Indian Ocean"); 
        Island Maldives = new Island(16, "the Maldives", 
            "Malé", "the Indian Ocean");


        //array of all the above island countries
        Island[] allIslands = {Antigua, Bahamas, Bahrain, Barbados, CapeVerde, 
            Comoros, Cuba, Cyprus, Dominica, Fiji, Grenada, Iceland, Jamaica, 
            Japan, Kiribati, Madagascar, Maldives};
        arrayShuffler(allIslands);

        //code for gameplay
        System.out.println("Guess the island country!");
        System.out.println("The fewer hints you need to identify the Island country, the more points you earn.");
        int score = 0;
        for(int i = 0; i < allIslands.length; i++){
            System.out.print("This country's captial is ");
            allIslands[i].printCapital();
            System.out.println("");
            String guess1 = in.nextLine();

            if (guessChecker(allIslands[i], guess1)){
                System.out.println("Correct!!!");
                score += 10;
                if(i == allIslands.length-1){
                    System.out.println("GAME OVER");
                    System.out.println("Your score was: " + score + ". Great work!");
                } else { 
                    System.out.println("Proceeding to the next Country");
                    System.out.println("");
                }
            } else {
                System.out.println("incorrect :(");
                System.out.print("Hint: this island country lies on ");
                allIslands[i].printBofw();
                System.out.println("");
                String guess2 = in.nextLine();
                
                if (guessChecker(allIslands[i], guess2)){
                    System.out.println("Correct!!");
                    score += 7;
                        if(i == allIslands.length-1){
                            System.out.println("GAME OVER");
                            System.out.println("You scored" + score + " points! Great work!!!");
                        } else { 
                            System.out.println("Proceeding to the next Country");
                            System.out.println("");
                        }
                } else {
                    System.out.println("incorrect :(");
                    System.out.print("The answer was ");
                    allIslands[i].printCountry();
                    System.out.println(".");
                    if(i == allIslands.length-1){
                        System.out.println();
                        System.out.println("GAME OVER");
                        System.out.println("SCORE:" + score + ". Great work!");
                    } else { 
                        System.out.println("Proceeding to the next Country");
                        System.out.println("");
                    }                
                }
            }
        }
    }
}