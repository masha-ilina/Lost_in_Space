/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lost_in_space;

import byui.cit260.lost_in_space.model.Player;
import byui.cit260.lost_in_space.model.Item;
import byui.cit260.lost_in_space.model.Alien;
import byui.cit260.lost_in_space.model.Ship;
import byui.cit260.lost_in_space.model.Actor;

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
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Item Class
        Item laser = new Item();
        
        // Alien Class
        Alien zoidberg = new Alien();
        
       zoidberg.setName("Dr.Zoidberg");
       zoidberg.
        
        // Ship CLass
        Ship express = new Ship();
        
        // Actor Class
        Actor generic = new Actor();
    }
    
}
