import java.util;
public class Player {
    private int bet;
    private int initialBank;
    private int bank;

    /**
     * Create a Player instance with its initial bank amount
     * @param ini this is the inital amount for the bank
     */
    public Player(int ini) {
        bank = ini;
        initialBank = ini;
    }

    /**
     * Tests whether or not the player will continue to play based on the amount left in its bank
     * @return true if its bank has enough, false if its bank is too low
     */
    public boolean stillPlaying(){
        if(this.bank >= 15) {
            return true;
        }
        return false;
    }

    /**
     * creates an array of Bet objects
     * @param numOfBets this determines how many Bet objects it creates
     *                  this also determines the number of times the bet amount is decreased from the bank
     * @return the array of Bets the player creates
     */
    public Bet[] placeBets(int numOfBets) {
        //places bets and decreases bet from bank
        Bet[] allBets = new Bet[numOfBets];
        for(int i = 0; i < numOfBets; i++){ //creates an array of Bet objects
            this.bank -= 15; //adjust the bank for how much the player has bet
            Object guess = aup.cs.Table.RandomBet();
            Bet[i] = new Bet(15, guess);
        }
        return allBets;
    }

    /**
     * This does exactly what it sounds like
     */
    public void reset() {
        bank = initialBank;
    }
}
