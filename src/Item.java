public class Item {
    private String name;
    private int price;
    private int statBonus;

    public Item(String name, int price, int statBonus) {
        this.name = name;
        this.price = price;
        this.statBonus = statBonus;
    }
    //settery
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStatBonus() {
        return statBonus;
    }

    //gettery
    public void setPrice() {
        this.price = price;
    }
}
