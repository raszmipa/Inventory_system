public class GoldGenThread extends Thread{
    private Player player;
    public GoldGenThread(Player player) {
        this.player = player;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            player.addGold(5);
            System.out.println(player.getGold());
        }
    }
}
