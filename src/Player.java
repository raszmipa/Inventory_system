import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int gold;
    private int baseStats;
    private int currentHealth;
    private int maxHealth;
    private List<Item> inventory;
    private Weapon equipedWeapon;
    private Armor equipedArmor;

    public Player(String name, int baseStats, int maxHealth) {
        this.gold = 100;
        this.name = name;
        this.baseStats = baseStats;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
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



    public int getCurrentHealth() {
        return this.currentHealth;
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

    public void takeDamage(int amount) {
        if(this.currentHealth > amount) {
            this.currentHealth -= amount;
        } else {
            this.currentHealth = 0;
        }
    }
    public void heal(int amount) {
        if(this.currentHealth + amount <= maxHealth) {
            this.currentHealth += amount;
        } else {
            this.currentHealth = maxHealth;
        }
    }

    public void attack(Enemy enemy) {
        int damage;
        if(Dice.roll(1,10) > 9){
            damage = this.getTotalStats() * 2;
        } else {
            damage = this.getTotalStats();
        }
        enemy.takeDamage(damage);
        System.out.println("Gracz atakuje przeciwnika za " + damage);
    }

    public void consumeItem(Item item) {
        if(inventory.contains(item) && item instanceof Usable) {
            ((Usable) item).use(this);
            removeItemFromInventory(item);
        } else {
            System.out.println("Nie można użyć tego przedmiotu");
        }
    }


    public boolean isAlive() {
        return currentHealth > 0;
    }
}
