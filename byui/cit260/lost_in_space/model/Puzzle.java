/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lost_in_space.model;

import java.io.Serializable;
/**
 *
 * @author Marya
 */
public class Puzzle implements Serializable{
    private double amountOfFuel;

    public Puzzle() {
    }

    public double getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(double amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    @Override
    public String toString() {
        return "Puzzle{" + "amountOfFuel=" + amountOfFuel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amountOfFuel) ^ (Double.doubleToLongBits(this.amountOfFuel) >>> 32));
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
        final Puzzle other = (Puzzle) obj;
        if (Double.doubleToLongBits(this.amountOfFuel) != Double.doubleToLongBits(other.amountOfFuel)) {
            return false;
        }
        return true;
    }


}
