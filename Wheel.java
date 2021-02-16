import java.util.Random;

public class Wheel {
    private int currentNumber;
    // Shows last number spun by the wheel
    private boolean isZero;
    // checks if number is zero because zero is not even, odd, red, black, or in any third
    private boolean isRed;
    // Shows if the color is red
    private boolean isBlack;
    // Shows if color is black
    private boolean isEven;
    // zero is not even
    private boolean isOdd;
    //
    private int third;
    // 1-12 is first, 13-24 is second, 25-36 is third
    private int half;
    // 1st or 2nd half in table.


    public Wheel() {
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
    public int getThird() {
        return third;
    }
    public int getHalf() {
        return half;
    }

    public void spin() {
        Random random = new Random();
        int number = random.nextInt(4);
    }

}
