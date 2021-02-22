import java.util;
public class Player {
    private int bet;
    private int initialBank;
    private int bank;

    public Player(int ini) {
        bank = ini;
        initialBank = ini;
    }

    public boolean stillPlaying(){
        if(this.bank > 15) {
            return true;
        }
        return false;
    }
    public Bet[] placeBets(int numOfBets) {
        //places bets and decreases bet from bank
        Bet[] allBets = new Bet[numOfBets];
        for(int i = 0; i < numOfBets; i++){ //creates an array of Bet objects
            this.bank -= 15;
            Object guess = aup.cs.Table.RandomBet();
            Bet[i] = Bet(15, guess);
        }
        return allBets;
    }

    public void reset() {
        bank = initialBank;
    }
}
