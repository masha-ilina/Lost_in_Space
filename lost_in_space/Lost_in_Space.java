/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lost_in_space;

import byui.cit260.lost_in_space.model.*;

/**
 * @author Jake
 * @author Marya
 */
public class Lost_in_Space {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Player Class
        Player playerOne = new Player();

        playerOne.setName("John Smith");
        playerOne.setBestTime(7.00);
        playerOne.setDescription("Some dude, totally not you. You look way cooler.");
        playerOne.setHealth(200);
        playerOne.setDamage(10, 20);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        // Item Class
        Item laser = new Item();
        
        laser.setType("Weapon");
        laser.setName("laser");
        laser.setQuantity(1);
        laser.setDamage(5, 10);
        
        System.out.println(laser.toString());

        // Alien Class
        Alien zoidberg = new Alien();

        zoidberg.setName("Dr.Zoidberg");
        zoidberg.setDescription("A smelly crab alien.");
        zoidberg.setStatus("Smelly");
        zoidberg.setHealth(200);
        zoidberg.setDamage(10, 20);

        System.out.println(zoidberg.toString());

        // Ship CLass
        Ship express = new Ship();

        express.setName("Express");
        express.setDescription("A humble delivery ship.");
        express.setHealth(10);
        express.setFuelLevel(500);
        express.setCoordinates(50, 60);

        System.out.println(express.toString());

        // Actor Class
        Actor generic = new Actor();

        generic.setName("person");
        generic.setDescription("Some dude.");
        generic.setStatus("Normal");
        generic.setCoordinates(10,80);
        generic.setHealth(150);
        
        System.out.println(generic.toString());
        
        // Game Class
        Game lis = new Game();
        lis.setTotalTime(60.00);
        lis.setNoPeople(2);
        
        String gameInfo = lis.toString();
        System.out.println(gameInfo);
        
        // BasicScene Class
        BasicScene bs = new BasicScene();
        bs.setBlocked(true);
        bs.setDescription("Let's go!");
        bs.setSymbol("^");
                
        String bsInfo = bs.toString();
        System.out.println(bsInfo); 
        
        // Puzzle Class
        Puzzle puzzle = new Puzzle();
        puzzle.setAmountOfFuel(0.75);
        
        String puzzleInfo = puzzle.toString();
        System.out.println(puzzleInfo);
        
        // Location Class
        Location loc = new Location();
        
        loc.setColumn(4);
        loc.setRow(2);
        loc.setVisited(false);
        loc.setDescription("Mars!");
        loc.setAmountRemaining(5);
        
        String locationInfo = loc.toString();
        System.out.println(locationInfo);
    }

}
