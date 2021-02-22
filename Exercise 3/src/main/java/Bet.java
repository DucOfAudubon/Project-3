public class Bet {
    /**
     * This class will need all the characteristics of the bet that the player places
     */
    private int betAmount;
    private String betResult;
    private int payout;
    private int binNumber;
    private boolean isRed;
    private boolean isBlack;
    private boolean isEven;
    private boolean isOdd;
    private boolean isFirstThird;
    private boolean isSecondThird;
    private boolean isThirdThird;
    private boolean isFirstHalf;
    private boolean isSecondHalf;
    // This is just a convenient array form of the above booleans
    private boolean[] arrayForm = {isEven, isOdd, isBlack, isRed, isFirstThird, isSecondThird, isThirdThird, isFirstHalf, isSecondHalf};

    /**
     * This is a constructor if the Bet is placed on a specific number result
     * It adjusts the payout appropriately
     * It sets all the booleans appropriately based on the number
     * @param amount this is the amount the player bet
     * @param betNumber this is the result that the bet is placed on
     */
    public Bet(int amount, int betNumber){
        this.binNumber = betNumber;
        this.betAmount = amount;
        this.payout = 36 * betAmount;
        if(betNumber == 0){
            this.isRed = false;
            this.isBlack = false;
            this.isEven = false;
            this.isOdd = false;
            this.isFirstThird = false;
            this.isSecondThird = false;
            this.isThirdThird = false;
            this.isFirstHalf = false;
            this.isSecondHalf = false;
        }
        else{
            if(betNumber % 2 == 0){
                this.isEven = true;
                this.isOdd = false;
                this.isRed = true;
                this.isBlack = false;
            }
            if(betNumber % 2 == 1){
                this.isEven = false;
                this.isOdd = true;
                this.isRed = false;
                this.isBlack = true;
            }
            if(betNumber < 13){
                this.isFirstThird = true;
                this.isSecondThird = false;
                this.isThirdThird = false;
            }
            if((betNumber > 12) & (betNumber < 25)){
                this.isFirstThird = false;
                this.isSecondThird = true;
                this.isThirdThird = false;
            }
            if(betNumber > 24){
                this.isFirstThird = false;
                this.isSecondThird = false;
                this.isThirdThird = true;
            }
            if(betNumber < 19){
                this.isFirstHalf = true;
                this.isSecondHalf = false;
            }
            if(betNumber > 18){
                this.isFirstHalf = false;
                this.isSecondHalf = true;
            }
        }
    }

    /**
     * This is a constructor if the Bet is placed on one of the 'categorical' results
     * It takes that category as a string
     * It adjusts the payout appropriately, based on the odds of each category
     * It sets all the booleans appropriately based on the category. Any unaddressed booleans default to false.
     * @param amount this is the amount the player bet
     * @param betString this is the category that the bet is placed on
     */
    public Bet(int amount, String betString){
        this.betAmount = amount;
        this.betResult = betString;
        if(betResult.equals("Even")){
            this.isEven = true;
            this.isOdd = false;
            this.payout = 2 * betAmount;
        }
        if(betResult.equals("Odd")){
            this.isEven = false;
            this.isOdd = true;
            this.payout = 2 * betAmount;
        }
        if(betResult.equals("Red")){
            this.isRed = true;
            this.isBlack = false;
            this.payout = 2 * betAmount;
        }
        if(betResult.equals("Black")){
            this.isRed = false;
            this.isBlack = true;
            this.payout = 2 * betAmount;
        }
        if(betResult.equals("First Third")){
            this.isFirstThird = true;
            this.isSecondThird = false;
            this.isThirdThird = false;
            this.payout = 3 * betAmount;
        }
        if(betResult.equals("Second Third")){
            this.isFirstThird = false;
            this.isSecondThird = true;
            this.isThirdThird = false;
            this.payout = 3 * betAmount;
        }
        if(betResult.equals("Third Third")){
            this.isFirstThird = false;
            this.isSecondThird = false;
            this.isThirdThird = true;
            this.payout = 3 * betAmount;
        }
        if(betResult.equals("First Half")){
            this.isFirstHalf = true;
            this.isSecondHalf = false;
            this.payout = 2 * betAmount;
        }
        if(betResult.equals("Second Half")){
            this.isFirstHalf = false;
            this.isSecondHalf = true;
            this.payout = 2 * betAmount;
        }
    }

    public int getBinNumber() {
        return binNumber;
    }

    public boolean isEven() {
        return isEven;
    }

    public boolean isOdd() {
        return isOdd;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isFirstHalf() {
        return isFirstHalf;
    }

    public boolean isSecondHalf() {
        return isSecondHalf;
    }

    public boolean isFirstThird() {
        return isFirstThird;
    }

    public boolean isSecondThird() {
        return isSecondThird;
    }

    public boolean isThirdThird() {
        return isThirdThird;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public int getPayout() {
        return payout;
    }

    public String getBetResult() {
        return betResult;
    }

    public boolean[] getArrayForm() {
        return arrayForm[];
    }
}
