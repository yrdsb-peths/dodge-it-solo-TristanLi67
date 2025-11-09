import greenfoot.*;

public class MyWorld extends World {
<<<<<<< Updated upstream
    private int score;
=======
    private int score = 0;
    private int spawnTimer = 0;

>>>>>>> Stashed changes
    public MyWorld() {
        super(600, 400, 1);
        score = 0;
        prepare();
    }
<<<<<<< Updated upstream
    private void prepare(){
        frog frog = new frog();
        addObject(frog, 300, 200);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100) < 1){
            bug bug = new bug();
            addObject(bug, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        showText("Score: " + score, 70, 25);
    }
    public void addScore(int points){
        score += points;
    }
}
=======

    private void prepare() {
        addObject(new Frog(), 300, 200);
    }

    public void act() {
        spawnTimer++;
        if (spawnTimer >= 150) { 
            addObject(new Bug(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            spawnTimer = 0;
        }
    }

    public void increaseScore() {
        score++;
        showText("Score: " + score, 70, 30);
    }
}

>>>>>>> Stashed changes
