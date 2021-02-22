public class Bin {
    private int number;
    private boolean isRed;
    private boolean isBlack;
    private boolean isEven;
    private boolean isOdd;
    private boolean isFirstThird;
    private boolean isSecondThird;
    private boolean isThirdThird;
    private boolean isFirstHalf;
    private boolean isSecondHalf;
    private boolean[] arrayForm = {isEven, isOdd, isBlack, isRed, isFirstThird, isSecondThird, isThirdThird, isFirstHalf, isSecondHalf};

    /**
     * This constructor takes a number and creates a bin with the appropriate booleans for that number
     * @param numResult this is the numerical value of the bin
     */
    public Bin(int numResult){
        this.number = numResult;
        if(numResult == 0){ // a result of 0 is false on all booleans
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
        else{ //the rest only gets tested if it is not 0
            if(numResult % 2 == 0){ // If the number is even
                this.isEven = true;
                this.isOdd = false;
                this.isRed = true;
                this.isOdd = false;
            }
            if(numResult % 2 == 1){ // If the number is odd
                this.isEven = false;
                this.isOdd = true;
                this.isRed = false;
                this.isOdd = true;
            }
            if(numResult < 13){ // If the number is from 1-12, it is in the first third
                this.isFirstThird = true;
                this.isSecondThird = false;
                this.isThirdThird = false;
            }
            if((numResult > 12) & (numResult < 25)){ // From 13 - 24, it is in the second third
                this.isFirstThird = false;
                this.isSecondThird = true;
                this.isThirdThird = false;
            }
            if(numResult > 24){ // from 25-36, it is in the third third
                this.isFirstThird = false;
                this.isSecondThird = false;
                this.isThirdThird = true;
            }
            if(numResult < 19){ //from 1-18, it is in the first half (this does not interact with any of the previous tests)
                this.isFirstHalf = true;
                this.isSecondHalf = false;
            }
            if(numResult > 18){ //from 19-36, it is in the second half
                this.isFirstHalf = false;
                this.isSecondHalf = true;
            }
        }
    }

    /**
     * getters from here on out
     */
    public int getNumber() {
        return number;
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

    public boolean[] getArrayForm() {
        return arrayForm[];
    }
}
