public class HealthPotion extends Item implements Usable {
    private int healAmount;

    public HealthPotion(int id, String name, int price, int healAmount) {
        super(id, name, price, 0);
        this.healAmount = healAmount;
    }

    public int getHealAmount() {
        return healAmount;
    }

    @Override
    public void use(Player player) {
        player.heal(healAmount);
        System.out.println("You used " + this.getName() + " and healed for " + healAmount + " HP.");
    }
}
