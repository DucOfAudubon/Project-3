
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
    public int placeBets() {
        //places bets and decreases bet from bank
    }

    public void reset() {
        bank = initialBank;
    }
}
