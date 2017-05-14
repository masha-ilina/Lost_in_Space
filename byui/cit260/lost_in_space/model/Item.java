package byui.cit260.lost_in_space.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Item implements Serializable {

    private String type;
    private String name;
    private String description;
    private int quantity;
    private int[] damage = new int[2];

    public Item() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int[] getDamage() {
        return damage;
    }

    public void setDamage(int min, int max) {
        this.damage[0] = min;
        this.damage[1] = max;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.quantity;
        hash = 53 * hash + Arrays.hashCode(this.damage);
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
        final Item other = (Item) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.equals(this.damage, other.damage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", name=" + name + "description=" + description + ", quantity=" + quantity + ", damage=" + damage[0] + ", " + damage[1] + '}';
    }

}
