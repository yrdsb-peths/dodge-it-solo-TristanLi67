import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Frog that moves and eats bug
 * 
 * @author (Tristan) 
 * @version (a version number or a date)
 */
<<<<<<< Updated upstream
public class frog extends Actor
{
    /**
     * Act - do whatever the frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eatBug();
    }

    private void moveAround() {
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
            move(4);
        }
    }

    private void eatBug() {
        bug bug = (bug) getOneIntersectingObject(bug.class);
        if (bug != null) {
            World world = getWorld();
            world.removeObject(bug);
            ((MyWorld) world).addScore(10);
        }
    }
}// Add your action code here.
=======
public class Frog extends Actor {
    public void act() {
        moveFrog();
        checkCollision();
    }

    private void moveFrog() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
        }
    }

    private void checkCollision() {
        Bug bug = (Bug)getOneIntersectingObject(Bug.class);
        if (bug != null) {
            getWorld().removeObject(bug);
            MyWorld world = (MyWorld)getWorld();
            world.increaseScore();
        }
    }
}
>>>>>>> Stashed changes
