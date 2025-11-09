import greenfoot.*;

public class MyWorld extends World {
    private int score = 0;
    private static int highScore = 0; 
    private int spawnTimer = 0;

    public MyWorld() {
        super(600, 400, 1);
        prepare();
        updateScoreboard();
    }

    private void prepare() {
        addObject(new Frog(), 300, 200);
    }

    public void act() {
        spawnTimer++;

        if (spawnTimer >= 250) { 
            addObject(new Bug(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            spawnTimer = 0;
        }
    }

    public void increaseScore() {
        score++;
        if (score > highScore) {
            highScore = score;
        }
        updateScoreboard();
    }

    private void updateScoreboard() {
        showText("Score: " + score, 70, 30);
        showText("High Score: " + highScore, 500, 30);
    }
}
    