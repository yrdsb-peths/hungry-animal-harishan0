import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public void act()
    {
        //Code for setting location of the apple, and it falling.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        
        //if the apple touches the ground, the game is over and apple is removed
        if (getY() == getWorld().getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    //setter method for speed
    public void setSpeed(int spd){
        speed = spd;
    }
}
