import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Camel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camel extends Actor
{
    /**
     * Act - do whatever the Camel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound camelSound = new GreenfootSound("camel6.mp3");
    GreenfootImage[] camelRunRight = new GreenfootImage[12];
    GreenfootImage[] camelRunLeft = new GreenfootImage[12];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer(); 
    
    public Camel(){
        for(int i=0;i<camelRunRight.length;i++){
           camelRunRight[i] = new GreenfootImage("run"+(i+1));  
           camelRunRight[i].scale(50,50);
        }
        
        
        for(int i=0;i<camelRunLeft.length;i++){
           camelRunLeft[i] = new GreenfootImage("run"+(i+1)); 
           camelRunLeft[i].mirrorHorizontally();
           camelRunLeft[i].scale(50,50);
        }
        
        animationTimer.mark();
        setImage(camelRunRight[0]);
    }
    
    /** animate Camel 
     * 
     * 
     */
    int imageIndex = 0;
    public void animateCamel(){
        if(animationTimer.millisElapsed()<100){
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right")){
            setImage(camelRunRight[imageIndex]);
            imageIndex= (imageIndex+1) % camelRunRight.length;
        }
        else{
            setImage(camelRunLeft[imageIndex]);
            imageIndex= (imageIndex+1) % camelRunLeft.length;
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            move(-2);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d")){
            move(2);
            facing = "right";
        }
        
        eat();
        
        animateCamel();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
            camelSound.play();
        }
    }
}
