public class Item {
    private String name;
    private int price;
    private int statBonus;
    private int id;

    public Item(int id, String name, int price, int statBonus) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.statBonus = statBonus;
    }
    //getery
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStatBonus() {
        return statBonus;
    }
    public int getId() {
        return id;
    }

    //settery
    public void setPrice(int price) {
        this.price = price;
    }
}
