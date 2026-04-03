//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Player hero = new Player("Adam", 5);

    Weapon staff = new Weapon("Staff", 10, 3, "Magic");
    Weapon sword = new Weapon("Sword", 12, 4, "Physical");

    Armor robe = new Armor("Robe", 8, 2, "Cloth");

    hero.addItemToInventory(staff);
    hero.addItemToInventory(sword);
    hero.addItemToInventory(robe);

    hero.displayInventory();

    hero.equipWeapon(staff);
    hero.equipArmor(robe);

    System.out.println("Total Stats: " + hero.getTotalStats());
    hero.displayInventory();
}
