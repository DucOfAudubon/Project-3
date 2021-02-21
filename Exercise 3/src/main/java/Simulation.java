import java.util.Random;

public class Simulation {
    private static Game game;
    // roulette and rules of roulette
    // Take a player's bet and wheel outcome to calculate payout based on rules
    private static Player player;
    // Player's bank
    // Player's bet
    private static Strategy strategy;
    // Dictates how player acts
    private int maximalStake;
    private int maxStakeRound;
    private int totalRounds;
    private int stakeAtEnd;

    public static void main(String[] args) {

    }

    public Simulation(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    private void session() {
        int numRounds = 0;
        while(player.stillPlaying()) {
            game.cycle(player);
            numRounds++;
        }
        player.reset();
    }
}
