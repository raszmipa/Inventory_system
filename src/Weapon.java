public class Weapon extends Item{
    private String damageType;

    //konstruktor
    public Weapon(String name, int price, int statBonus, String damageType) {
        super(name, price, statBonus);
        this.damageType = damageType;
    }

    //getter
    public String getDamageType() {
        return damageType;
    }
}
