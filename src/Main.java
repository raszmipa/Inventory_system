
public static void main(String[] args) {
    Player hero = new Player("Adam", 5);
    Shop biedronka = new Shop();
    goldGenThread passiveGoldThread = new goldGenThread(hero);
    passiveGoldThread.start();

    Weapon staff = new Weapon(0,"Staff", 10, 3, "Magic");
    Weapon sword = new Weapon(1,"Sword", 12, 4, "Physical");
    Armor robe = new Armor(2,"Robe", 8, 2, "Cloth");

    biedronka.addItemToShop(staff);
    biedronka.addItemToShop(sword);
    biedronka.addItemToShop(robe);
    biedronka.buyItem(staff, hero);
    biedronka.buyItem(sword, hero);
    biedronka.buyItem(robe, hero);
    //hero.addItemToInventory(staff);
    //hero.addItemToInventory(sword);
    //hero.addItemToInventory(robe);

    hero.displayInventory();

    hero.equipWeapon(staff);
    hero.equipArmor(robe);

    System.out.println("Total Stats: " + hero.getTotalStats());
    hero.displayInventory();

}
