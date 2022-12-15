package section1;

// create two methods
    // first method is named displayHighScorePosition
        // should have 2 params, one for a players name, one for a players position in a high score list
        // should print "Tim managed to get into position 2 on the high score list"
    // second method is named calculateHighScorePosition
        // should have only one param, the players score
        // should return a number between 1 & 4, based on the score values shown below:
            // Score >= 1000 --> 1
            // Score >= 500, but < 1000 --> 2
            // Score >= 100, but < 500 --> 3
            // All other scores --> 4
// finally, call both methods & display the results for the following scores: 1500, 1000, 500, 100, and 25

public class MethodChallenge {
    public static void main(String[] args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(1000));
        displayHighScorePosition("Tim", calculateHighScorePosition(500));
        displayHighScorePosition("Tim", calculateHighScorePosition(100));
        displayHighScorePosition("Tim", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
