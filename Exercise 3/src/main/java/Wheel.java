
import java.util.Random;

public class Wheel {
    private int currentNumber = -1;
    // Shows last number spun by the wheel
    private boolean isZero = false;
    // checks if number is zero because zero is not even, odd, red, black, or in any third
    private boolean isRed = false;
    // Shows if the color is red
    private boolean isBlack = false;
    // Shows if color is black
    private boolean isEven = false;
    // zero is not even
    private boolean isOdd = false;
    //
    //private int third;
    // 1-12 is first, 13-24 is second, 25-36 is third
    //private int half;
    // 1st or 2nd half in table.


    public Wheel(){
    // creates new wheel instance. No passed in requirements
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
    public boolean isZero() {
        return isZero;
    }
    public boolean isRed() {
        return isRed;
    }
    public boolean isBlack() {
        return isBlack;
    }
    public boolean isEven() {
        return isEven;
    }
    public boolean isOdd() {
        return isOdd;
    }
    /* public int getThird() {
        return third;
    }
    public int getHalf() {
        return half;
    } */

    public void spin() {
        // simulates one spin on the wheel
        Random random = new Random();
        int number = random.nextInt(37);
        // bound is NOT inclusive
        if(number == 0){
            isZero = true;
            return;
        }
        if(number%2 == 0) {
            isEven = true;
        }
        else {
            isOdd = true;
        }
        int color = random.nextInt(2);
        if (color == 1) {
            // 50% chance of even and color
            isRed = true;
        }
        else {
            isBlack = true;
        }
        // could include thirds and halfs if need be
    }

    public void reset() {
        //resets the wheel - sets all to default
        isZero = false;
        isEven = false;
        isOdd = false;
        isRed = false;
        isBlack = false;
    }

}
