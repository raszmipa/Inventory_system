public class Enemy {
    private String name;
    private int currentHealth;
    private int maxHealth;
    private int attackPower;
    private static int totalEnemiesCreated;

    public Enemy(String name, int maxHealth, int attackPower) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attackPower = attackPower;
        totalEnemiesCreated++;
    }

    public String getName() {
        return name;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public static int getTotalEnemiesCreated() {
        return totalEnemiesCreated;
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
        } else  {
            currentHealth = maxHealth;
        }
    }

    public void attack(Player player) {
        player.takeDamage(this.attackPower);
        System.out.println("Przciwnik atakuje gracz za: " + this.attackPower);
    }

    public boolean isAlive() {
        return this.currentHealth > 0;
    }
}
