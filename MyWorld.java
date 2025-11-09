import greenfoot.*;

public class MyWorld extends World {
    private int score = 0;
    private int spawnTimer = 0;

    public MyWorld() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        addObject(new Frog(), 300, 200);
    }

    public void act() {
        spawnTimer++;
        if (spawnTimer >= 150) { // Spawns less often
            addObject(new Bug(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            spawnTimer = 0;
        }
    }

    public void increaseScore() {
        score++;
        showText("Score: " + score, 70, 30);
    }
}
    

