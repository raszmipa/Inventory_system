import java.util.Random;

public class Dice {
    private Dice() {}

    public static int roll(int min, int max) {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(max-min+1) + min;
    }
}
