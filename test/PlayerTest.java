import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void takeDamageMoreThanCurrentHealth() {
        Player player = new Player("john", 5, 20);
        player.takeDamage(30);
        assertEquals(0,player.getCurrentHealth());
    }

    @Test
    void healAboveMaxHealth() {
        Player player = new Player("john", 5, 20);
        player.takeDamage(10);
        player.heal(20);
        assertEquals(20,player.getCurrentHealth());
    }

    @Test
    void correctStats() {
        Player player = new Player("john", 5, 20);
        Weapon sword = new Weapon(0,"sword", 10, 3, "physical");
        Armor helmet = new Armor(1,"helmet", 10, 1, "helmet");
        player.addItemToInventory(sword);
        player.addItemToInventory(helmet);
        player.equipWeapon(sword);
        player.equipArmor(helmet);

        Enemy enemy = new Enemy("goblin", 10,4);

        player.attack(enemy);

        assertEquals(9,player.getTotalStats());
        assertEquals(1,enemy.getCurrentHealth());
    }

}