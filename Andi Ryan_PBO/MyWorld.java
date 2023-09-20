import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {Counter counter = new Counter();
        addObject(counter,56,19);
        bola bola = new bola();
        addObject(bola,60,95);
        bola bola2 = new bola();
        addObject(bola2,166,72);
        bola bola3 = new bola();
        addObject(bola3,299,54);
        bola bola4 = new bola();
        addObject(bola4,127,183);
        bola bola5 = new bola();
        addObject(bola5,230,160);
        bola bola6 = new bola();
        addObject(bola6,371,136);
        bola bola7 = new bola();
        addObject(bola7,282,215);
        bola bola8 = new bola();
        addObject(bola8,469,83);
        bola bola9 = new bola();
        addObject(bola9,467,220);
        bola bola10 = new bola();
        addObject(bola10,148,307);
        rocket rocket = new rocket();
        addObject(rocket,51,364);
        bola9.setLocation(722,176);
        bola7.setLocation(306,286);
        rocket.setLocation(82,487);
        bola5.setLocation(584,109);
        bola6.setLocation(284,157);
        bola3.setLocation(367,107);
        bola7.setLocation(202,222);
        bola4.setLocation(119,358);
        bola6.setLocation(308,137);
        bola2.setLocation(258,170);
        bola2.setLocation(258,170);
        bola7.setLocation(212,218);
        bola.setLocation(181,258);
        bola9.setLocation(668,141);
        bola4.setLocation(415,204);
        bola3.setLocation(490,125);
        bola2.setLocation(306,248);
        bola7.setLocation(338,277);
        bola.setLocation(372,300);
        bola10.setLocation(404,303);
        bola9.setLocation(444,290);
        bola5.setLocation(503,264);
        bola3.setLocation(549,224);
        bola8.setLocation(488,112);
        bola3.setLocation(543,228);
        bola2.setLocation(286,228);
        bola bola11 = new bola();
        addObject(bola11,286,228);
        bola4.setLocation(408,183);
        bola4.setLocation(417,203);
        bola11.setLocation(278,222);
        bola11.setLocation(255,444);
        bola2.setLocation(75,184);
        bola7.setLocation(314,232);
        bola.setLocation(589,353);
        bola5.setLocation(675,103);
        bola3.setLocation(637,215);
        bola9.setLocation(185,318);
        bola10.setLocation(434,438);
        bola4.setLocation(334,504);
        bola10.setLocation(460,449);
        bola.setLocation(564,348);
        bola7.setLocation(392,275);
    }
        
}
