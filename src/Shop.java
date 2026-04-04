import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Item> itemsForSale;
    public Shop() {
        itemsForSale = new ArrayList<>();
    }

    public void addItemToShop(Item item) {
        itemsForSale.add(item);
    }

    public void displayShop() {
        System.out.println("----------Shop----------");
        for (Item item : itemsForSale) {
            System.out.println("Nazwa: " + item.getName() + ", Cena: " + item.getPrice() + ", Bonus: " + item.getStatBonus());
        }
    }

    public void buyItem(Item item, Player player) {
        if(itemsForSale.contains(item)) {
            if(player.getGold() >= item.getPrice()) {
                itemsForSale.remove(item);
                player.substractGold(item.getPrice());
                player.addItemToInventory(item);
                System.out.println("Kupiono " + item.getName());
            } else {
                System.out.println("Za mało złota");
            }
        }

    }
}
