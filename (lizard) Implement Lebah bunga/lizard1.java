import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lakon utama game ini
 * 
 * @author Decka A.S 
 * @version 1.0
 */
public class lizard1 extends Animal
{
    private int lalatDimakan = 0;
    /**
     * Act - do whatever the lizard1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        movement();
        eatFly();
        point();
    } 

    public void movement()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(2);
        } 
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
        } 
    }

    public void eatFly()
    {
        Actor fly = getOneObjectAtOffset(0, 0, fly1.class);

        if(fly != null)
        {
            getWorld().removeObject(fly);
            lalatDimakan++;
            Greenfoot.playSound("eat.mp3");
            if(lalatDimakan == 6)
            {
                gameOver();
            }
        }
    }
    
    public int point()
    {
        return lalatDimakan;
    }
    
    public void gameOver()
    {
        Greenfoot.stop();
        Greenfoot.playSound("tada.wav");
    }
}
