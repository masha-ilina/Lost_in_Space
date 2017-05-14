package byui.cit260.lost_in_space.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Item implements Serializable {
    
    private String type;
    private String description;
    private int quantity;
    private int[] damage = new int[2];
    
}