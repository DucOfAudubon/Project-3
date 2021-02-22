public class Outcome {
    private boolean win = false;

    /**
     * This compares a Bin with a Bet
     * It first checks to see if they're the same number. If they are, then the outcome is a win
     * Then it checks if any of their booleans are both true by running a for loop through their array forms
     * If even just one of their booleans are both true, then it is a win
     * @param result this is the Bin that the roulette wheel spun up
     * @param playersBet this is the Bet that the player guessed at
     * @return true if the player bet on a winning bet, false if the player did not bet on a winning bet
     */
    public boolean Compare(Bin result, Bet playersBet){
        boolean[] resultArray = result.getArrayForm();
        boolean[] betArray = playersBet.getArrayForm();
        if(result.getNumber() == playersBet.getBinNumber()){
            this.win = true;
        }
        else{
            for(int i = 0; i < resultArray.length; i++){
                if(resultArray[i] && betArray[i]){
                    this.win = true;
                }
            }
        }
        return this.win;
    }

    /**
     * This returns the amount the player won, if they won
     * @param playersBet this is the Bet the player made
     * @return the payout of the player's bet
     */
    public int Payout(Bet playersBet){
        if(win == true){
            return playersBet.getPayout();
        }
    }
}
