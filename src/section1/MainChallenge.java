package section1;
// Code Blocks Challenge
public class MainChallenge {

    // set score to 10_000
    // set levelCompleted to 8
    // set bonus to 200
    // if gameOver == true, do given calculation

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
