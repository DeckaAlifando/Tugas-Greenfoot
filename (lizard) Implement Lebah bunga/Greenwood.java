import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Greenwood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Greenwood extends World
{

    /**
     * Constructor for objects of class Greenwood.
     * 
     */
    public Greenwood()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        lizard1 lizard1 = new lizard1();
        addObject(lizard1, 47, 204);
        snake1 snake1 = new snake1();
        addObject(snake1, 238, 209);
        lizard1.setLocation(286, 41);
        snake1 snake12 = new snake1();
        addObject(snake12, 383, 119);
        snake1 snake13 = new snake1();
        addObject(snake13, 572, 351);
        snake1.setLocation(240, 227);
        snake1.setLocation(238, 232);
        fly1 fly1 = new fly1();
        addObject(fly1, 64, 179);
        fly1 fly12 = new fly1();
        addObject(fly12, 566, 126);
        fly1 fly13 = new fly1();
        addObject(fly13, 415, 293);
        fly1 fly14 = new fly1();
        addObject(fly14, 74, 363);
        snake12.setLocation(336, 120);
        snake13.setLocation(505, 363);
        snake12.setLocation(357, 118);
        fly13.setLocation(432, 295);
        fly12.setLocation(564, 369);
        fly13.setLocation(447, 50);
        snake12.setLocation(380, 111);
        fly1.setLocation(313, 206);
        fly14.setLocation(505, 197);
        lizard1.setLocation(38, 189);
        lizard1.setLocation(38, 206);
        fly1.setLocation(312, 207);
        snake1 snake14 = new snake1();
        addObject(snake14, 130, 115);
        fly1 fly15 = new fly1();
        addObject(fly15, 231, 59);
        fly1 fly16 = new fly1();
        addObject(fly16, 141, 335);
        snake1.setLocation(267, 227);
        snake1.setLocation(253, 240);
        snake14.setLocation(116, 119);
        fly16.setLocation(179, 331);
        snake1.setLocation(235, 242);
        snake12.setLocation(373, 110);
        snake13.setLocation(501, 365);
        fly14.setLocation(497, 196);
    }
    
 
}
