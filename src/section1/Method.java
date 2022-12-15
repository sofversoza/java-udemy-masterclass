package section1;
// creating a method
public class Method {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // invoking the method we created with arguments & assigning it to a variable
        int highsScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highsScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // invoking our method as an argument
        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

    // our new method outside the main method with parameters
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}
