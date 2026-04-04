import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int gold;
    private int baseStats;
    private List<Item> inventory;

    private Weapon equipedWeapon;
    private Armor equipedArmor;

    public Player(String name, int baseStats) {
        this.gold = 100;
        this.name = name;
        this.baseStats = baseStats;
        this.inventory = new ArrayList<Item>();
        this.equipedWeapon = null;
        this.equipedArmor = null;
    }


    public void equipWeapon(Weapon weapon) {
        if(inventory.contains(weapon)) {
            if(this.equipedWeapon != null) {
                addItemToInventory(this.equipedWeapon);
            }
            this.equipedWeapon = weapon;
            removeItemFromInventory(weapon);
        }
    }
    public void equipArmor(Armor armor) {
        if(inventory.contains(armor)) {
            if(this.equipedArmor != null) {
                addItemToInventory(this.equipedArmor);
            }
            this.equipedArmor = armor;
            removeItemFromInventory(armor);
        }
    }

    public int getTotalStats() {
        int totalStats = this.baseStats;

        if(equipedWeapon != null) {
            totalStats += equipedWeapon.getStatBonus();
        }
        if(equipedArmor != null) {
            totalStats += equipedArmor.getStatBonus();
        }
        return totalStats;
    }

    public int getGold() {
        return this.gold;
    }

    public void addItemToInventory(Item item) {
        this.inventory.add(item);
    }
    public void removeItemFromInventory(Item item) {
        this.inventory.remove(item);
    }

    public void displayInventory() {
        System.out.println("--------Inventory----Gold: " + gold);
        for(Item item : inventory) {
            System.out.println("Nazwa: " + item.getName() + ", Cena: " + item.getPrice() + ", Bonus: " + item.getStatBonus());
        }
    }

    public void substractGold(int amount) {
        this.gold -= amount;
    }

    public void addGold(int amount) {
        this.gold += amount;
    }
}
