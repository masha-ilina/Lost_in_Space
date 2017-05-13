package byui.cit260.lost_in_space.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Actor implements Serializable {

    private String name;
    private String description;
    private String status;
    private int health;
    private int[] coordinates;

    public Actor() {
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

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates[0] = coordinates[0];
        this.coordinates[1] = coordinates[1];
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", status=" + status + ", health=" + health + ", coordinates=" + coordinates[0] + "," + coordinates[1] + '}';
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}