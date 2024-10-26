import java.util.HashSet;
import java.util.Set;

public class Player {
    private Set<Item> inventory = new HashSet<>();

    public Player() {};

    public Set<Item> getInventory() {
        return inventory;
    }

    public void setInventory(Set<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "inventory=" + inventory +
                '}';
    }
}
