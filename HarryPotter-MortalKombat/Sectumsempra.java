import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sectumsempra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sectumsempra extends Offensive
{
    public Sectumsempra() {
        int random = Greenfoot.getRandomNumber(2); 
        setDamage(-8);
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    
    /**
     * Act - do whatever the Sectumsempra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public int randomDamage() {
        int random = Greenfoot.getRandomNumber(4); 
        if (random == 0) {
            return -22; 
        }
        else {
            return -5; 
        }
    }
}
