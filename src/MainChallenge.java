public class MainChallenge {

    public static void main(String[] args) throws Exception {
        

        // Code example 1. Gamer Score with Bonus
        // -----------------------------------------------
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        
        int finalScore = score;
        
        if (gameOver) { // is the same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // which is short for: finalScore = finalScore + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        
        // Code example 2. Code Challenge 
        // -----------------------------------------------
        // boolean newGameOver = true;
        // int newScore = 10000;
        // int newLevelCompleted = 8;
        // int newBonus = 200;


        // int newFinalScore = newScore;

        // if (newGameOver) {
        //     newFinalScore += (newLevelCompleted * newBonus);
        //     System.out.println("Your final score was " + newFinalScore);
        // }



        // Using the orginal code block we can re assign the variables for reuse instead of declaring new varaibles. This saves memory
        // Code example 3 
        // -----------------------------------------------
        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        finalScore = score;

        if (gameOver) { // is the same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // which is short for: finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
