import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The character where the veiwer plays.
 * 
 * @author (Tristan) 
 * @version (a version number or a date)
 */

import greenfoot.*;

public class Frog extends Actor {
    public void act() {
        moveFrog();
        checkCollision();
    }

    private void moveFrog() {
        if (Greenfoot.isKeyDown("w")) setLocation(getX(), getY() - 4);
        if (Greenfoot.isKeyDown("s")) setLocation(getX(), getY() + 4);
        if (Greenfoot.isKeyDown("a")) setLocation(getX() - 4, getY());
        if (Greenfoot.isKeyDown("d")) setLocation(getX() + 4, getY());
    }

    private void checkCollision() {
        Bug bug = (Bug)getOneIntersectingObject(Bug.class);
        if (bug != null) {
            getWorld().removeObject(bug);
            ((MyWorld)getWorld()).increaseScore();
        }
    }
}