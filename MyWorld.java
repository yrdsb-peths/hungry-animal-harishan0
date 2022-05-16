import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    
    public Label scoreLabel = new Label(0,50);

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Camel c = new Camel();
        addObject(c, 300, 350);
        
        addObject(scoreLabel, 50, 50);
        
        spawnApple();
    }
    
    public void spawnApple(){
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Apple apple = new Apple();
        addObject(apple, x, y);
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score); 
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over!", 50);
        addObject(gameOverLabel, 300, 300);
    }
}
