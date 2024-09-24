// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 800, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 542, 91);
        Burger burger2 =  new  Burger();
        addObject(burger2, 315, 290);
        Burger burger3 =  new  Burger();
        addObject(burger3, 595, 499);
        Burger burger4 =  new  Burger();
        addObject(burger4, 109, 110);
        Burger burger5 =  new  Burger();
        addObject(burger5, 692, 244);
        Burger burger6 =  new  Burger();
        addObject(burger6, 92, 459);
        Burger burger7 =  new  Burger();
        addObject(burger7, 318, 660);
        Pig pig =  new  Pig();
        addObject(pig, 107, 660);
        Snake snake =  new  Snake();
        addObject(snake, 683, 49);
    }
}
