import greenfoot.*;

public class MyWorld extends World {
    private int score;
    public MyWorld() {
        super(600, 400, 1);
        score = 0;
        prepare();
    }
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
