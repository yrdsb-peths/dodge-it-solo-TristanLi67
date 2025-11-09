import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        move(1);
        if (Greenfoot.getRandomNumber(100) < 5) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}// Add your action code here.

