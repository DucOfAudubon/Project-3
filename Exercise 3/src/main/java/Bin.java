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

    public Bin(int numResult){
        this.number = numResult;
        if(numResult == 0){
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
            if(numResult % 2 == 0){
                this.isEven = true;
                this.isOdd = false;
                this.isRed = true;
                this.isOdd = false;
            }
            if(numResult % 2 == 1){
                this.isEven = false;
                this.isOdd = true;
                this.isRed = false;
                this.isOdd = true;
            }
            if(numResult < 13){
                this.isFirstThird = true;
                this.isSecondThird = false;
                this.isThirdThird = false;
            }
            if((numResult > 12) & (numResult < 25)){
                this.isFirstThird = false;
                this.isSecondThird = true;
                this.isThirdThird = false;
            }
            if(numResult > 24){
                this.isFirstThird = false;
                this.isSecondThird = false;
                this.isThirdThird = true;
            }
            if(numResult < 19){
                this.isFirstHalf = true;
                this.isSecondHalf = false;
            }
            if(numResult > 18){
                this.isFirstHalf = false;
                this.isSecondHalf = true;
            }
        }
    }

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
}
