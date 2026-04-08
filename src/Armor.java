public class Armor extends Item{
    private String armorType;

    //konstruktor
    public Armor(int id, String name, int price, int stats, String armorType) {
        super(id, name, price, stats);
        this.armorType = armorType;
    }

    //getter
    public String getArmorType() {
        return armorType;
    }
}
