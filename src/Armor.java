public class Armor extends Item{
    private String armorType;

    //konstruktor
    public Armor(String name, int price, int stats, String armorType) {
        super(name, price, stats);
        this.armorType = armorType;
    }

    //getter
    public String getArmorType() {
        return armorType;
    }
}
