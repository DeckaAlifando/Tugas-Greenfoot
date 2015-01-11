import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanScore extends Actor
{
    private GreenfootImage img1=new GreenfootImage(103,30);
    private Waktu waktu = new Waktu();
    private int timer;
    /**
     * Act - do whatever the PapanScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        img1.clear();
        buatPapanScore();
    }   
    
    public PapanScore(){
        buatPapanScore();
        setImage(img1);
        
    }
    private void buatPapanScore(){
        img1.setColor(java.awt.Color.YELLOW);
        img1.fillRect(1,1,198,48);
        
        img1.setColor(java.awt.Color.BLACK);
        timer++;
        if(timer>=100){
            timer=0;
            waktu.detikUp();
    }
            
        img1.setColor(java.awt.Color.BLUE);
        img1.drawString("Timer :" + waktu.toString(),6,20);
    }
}
