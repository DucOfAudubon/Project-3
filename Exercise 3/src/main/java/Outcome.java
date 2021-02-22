public class Outcome {
    private boolean win;

    public boolean Compare(Bin result, Bet playersBet){
        if((result.isEven() & playersBet.isEven()) ||
                (result.isOdd() & playersBet.isOdd()) ||
                (result.isRed() & playersBet.isRed()) ||
                (result.isFirstThird() & playersBet.isFirstThird()) ||
                (result.isSecondThird() & playersBet.isSecondThird()) ||
                (result.isFirstHalf() & playersBet.isFirstHalf()) ||
                (result.isSecondHalf() & playersBet.isSecondHalf()) ||
                (result.getNumber() & playersBet.getBinNumber())){
            this.win = true;
        }
        else{
            this.win = false;
        }
    }

    public int Payout(Bet playersBet){
        if(win == true){
            return playersBet.getPayout();
        }
    }
}
