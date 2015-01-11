import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tumbuh1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tumbuh1 extends Actor
{
    private Counter counter;
    /**
     * Act - do whatever the tumbuh1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        eat();
    }   

    public void eat()
    {
        Actor ant;
        ant = getOneObjectAtOffset(100,100, ant.class);
        if(ant != null)
        {
            World world;
            world = getWorld();
            world.removeObject(ant);

            counter.add(-5);
        }
    }

}
