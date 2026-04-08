public class Weapon extends Item{
    private String damageType;

    //konstruktor
    public Weapon(int id, String name, int price, int statBonus, String damageType) {
        super(id, name, price, statBonus);
        this.damageType = damageType;
    }

    //getter
    public String getDamageType() {
        return damageType;
    }
}
