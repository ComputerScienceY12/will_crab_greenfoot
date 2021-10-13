import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 5
 * 
 * In this version, the crab behaves as before, but we add animation of the 
 * image.
 */

public class Crab extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten = 0;
    }
        
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           switchImage();
           checkKeypress();
           move();
           lookForWorm();
           if(wormsEaten == 8){
               Greenfoot.stop();
            }
    }
    
    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            // Use the command: setImage(<image name>);
        }
        else
        {
            // Set the other image
        }
    }
            
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(40);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(-40);
        }
    }
    
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if ( canSee(Worm.class) ) 
        {
            eat(Worm.class);
            Greenfoot.playSound("finns.wav");
            
            wormsEaten = wormsEaten + 1;
            
            // play "fanfare.wav" and then stop if you've reached 8 worms

        }
    }
    
    public int getWormsEaten()
    {
        return wormsEaten;
       
    
    }
}