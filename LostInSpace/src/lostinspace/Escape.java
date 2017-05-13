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
public class Escape implements Serializable{
    
    // class instance variables
    public String rollToEscape;

    public Escape() {
    }

    public String getRollToEscape() {
        return rollToEscape;
    }

    public void setRollToEscape(String rollToEscape) {
        this.rollToEscape = rollToEscape;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.rollToEscape);
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
        final Escape other = (Escape) obj;
        if (!Objects.equals(this.rollToEscape, other.rollToEscape)) {
            return false;
        }
        return true;
        
    }

    @Override
    public String toString() {
        return "Escape{" + "rollToEscape=" + rollToEscape + '}';
    }
    
    
}
