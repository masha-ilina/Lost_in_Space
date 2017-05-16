/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lost_in_space.model;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Etienne
 */
public class Combat implements Serializable{
    
    // class instance variables
    private String playerLightAttack;

    public Combat() {
    }

    public String getPlayerLightAttack() {
        return playerLightAttack;
    }

    public void setPlayerLightAttack(String playerLightAttack) {
        this.playerLightAttack = playerLightAttack;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.playerLightAttack);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Combat other = (Combat) obj;
        if (!Objects.equals(this.playerLightAttack, other.playerLightAttack)) {
            return false;
        }
        return true;
        
    }

    @Override
    public String toString() {
        return "Combat{" + "playerLightAttack=" + playerLightAttack + '}';
    }
    
    
    
    
}
