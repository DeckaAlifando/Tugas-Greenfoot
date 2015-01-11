import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(2);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if(getX() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        } 
    }    
}
