import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Karakter antagonis game ini
 * 
 * @author Decka A.S
 * @version 1.0
 */
public class snake1 extends obstacle
{
    int x = 0;
    public void act() 
    {
        movement();
        bump();
        eatLizard();
    }    

    public void movement()
    {   move(5);
        if (x == 0)
        {
            setRotation(90);
            x++;
        }
        
    }
    
    public void bump()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }

    public void eatLizard()
    {
        {
            Actor lizard = getOneObjectAtOffset(0, 0, lizard1.class);
            if(lizard != null)
            {
                getWorld().removeObject(lizard);
                Greenfoot.stop();
                Greenfoot.playSound("hiss.wav");
            }
        }
    }
}
