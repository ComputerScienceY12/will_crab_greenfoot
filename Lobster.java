import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A lobster. Lobsters live on the beach. They like to eat crabs. (Well, in our game
 * they do...)
 * 
 * Version: 2
 * 
 * The lobster walks around randomly. If it runs into a crab it eats it.
 * In this version, we have added a sound effect, and the game stops when
 * a lobster eats the crab.
 */

public class Lobster extends Animal
{
    /**
     * Do whatever lobsters do.
     */
    public void act()
    {
        randomTurn();
        turnAtEdge();
        move();
        eatTheCrab();
        
        
    }

    /**
     * Check whether we are at the edge of the world. If we are, turn a bit.
     * If not, do nothing.
     */
    public void turnAtEdge()
    {
        if ( atWorldEdge() ) 
        {
            turn(17);
        }
    }

    /**
     * Randomly decide to turn from the current direction, or not. If we turn
     * turn a bit left or right by a random degree.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    public void eatTheCrab()
    {   
        if ( canSee(Crab.class) ) 
        {
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
            
            
            // play "fanfare.wav" and then stop if you've reached 8 worms

        }
    }
}