import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The character where the veiwer plays.
 * 
 * @author (Tristan) 
 * @version (a version number or a date)
 */
public class frog extends Actor
{
    /**
     * Act - do whatever the frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkForBug();// Add your action code here.
    }
    private void moveAround() 
    {
        if(Greenfoot.isKeyDown("left")) move(-4);
        if(Greenfoot.isKeyDown("right")) move(4);
        if(Greenfoot.isKeyDown("up")) setLocation(getX(),getY() -4);
        if(Greenfoot.isKeyDown("down")) setLocation(getX(),getX() +4);
    }
    private void checkForBug()
    {
        Actor bug = getOneIntersectingObject(bug.class);
        if (bug != null)
        {
            getWorld().removeObject(bug);
        }
    }
}
