import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bug.
 * 
 * @author (Tristan) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) -45);
        }// Add your action code here.
        if(isAtEdge()) turn(180);
    }
}
