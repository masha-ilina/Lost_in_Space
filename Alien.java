package byui.cit260.lost_in_space.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Alien implements Serializable {

    private String name;
    private String description;
    private int[] damage;
    private int health;

    public Alien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getDamgage() {
        return damage;
    }

    public void setDamage(int[] damage) {
        this.damage = damage;
    }
}
