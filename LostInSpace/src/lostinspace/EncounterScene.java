/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Etienne
 */
public class EncounterScene implements Serializable{
    
    // class instance variables
    private String Attribute;

    public EncounterScene() {
    }

    public String getAttribute() {
        return Attribute;
    }

    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Attribute);
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
        final EncounterScene other = (EncounterScene) obj;
        if (!Objects.equals(this.Attribute, other.Attribute)) {
            return false;
        }
        return true;
        
    }

    @Override
    public String toString() {
        return "EncounterScene{" + "Attribute=" + Attribute + '}';
    }
    
    
}
