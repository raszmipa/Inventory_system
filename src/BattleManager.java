public class BattleManager {
    public void startBattle(Player player, Enemy enemy) {
        while(player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if(!enemy.isAlive()) {
                System.out.println("Gracz pokonał przeciwnika, koniec walki");
                break;
            }
            enemy.attack(player);
            if(!player.isAlive()) {
                System.out.println("Przeciwnik pokomał gracza");
                break;
            }
            showStats(player, enemy);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }

    private void showStats(Player player, Enemy enemy) {
        System.out.println("Gracz:");
        System.out.println("HP:" + player.getCurrentHealth() + "  |  obrażenia: " + player.getTotalStats());
        System.out.println();
        System.out.println("Przeciwnik:");
        System.out.println("HP:" + enemy.getCurrentHealth() + "  |  obrażenia: " + enemy.getAttackPower());
    }
}
