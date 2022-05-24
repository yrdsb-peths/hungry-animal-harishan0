import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("The Camel", 70);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 200, 100);
        prepare();
    }

    public void act(){
        //start game if user presses space bar
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Camel camel = new Camel();
        addObject(camel,484,92);
        Label label = new Label("Press 'A' and 'D' to Move", 45);
        addObject(label,300,243);
        Label label2 = new Label("Press Space to Start", 50);
        addObject(label2,289,329);
        label.setLocation(309,227);
        label2.setLocation(333,292);
        camel.setLocation(426,115);
        label2.setLocation(437,291);
        label.setLocation(418,229);
        label2.setLocation(468,281);
        label2.setLocation(342,312);
        label.setLocation(263,246);
        label2.setLocation(393,309);
    }
}
