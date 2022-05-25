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
    int level =1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Create camel object and place in world
        Camel c = new Camel();
        addObject(c, 300, 350);
        
        //add Label and apple
        addObject(scoreLabel, 50, 50);
        spawnApple();
    }
    
    //method for spawning apple. Also has level changer built into this method
    public void spawnApple(){
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Apple apple = new Apple();
        apple.setSpeed(level);
        addObject(apple, x, y);
    }
    
    //Increases score and also level for every 5 apples eaten 
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score); 
        
        if(score%5 == 0){
            level+=1;
        }
    }
    //game over method 
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
