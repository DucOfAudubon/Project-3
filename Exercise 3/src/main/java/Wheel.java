
import java.util.Random;

public class Wheel {
    private int currentNumber = -1;
    // Shows last number spun by the wheel
    private Bin resultBin;


    public Wheel(){
    // creates new wheel instance. No passed in requirements
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    /**
     * This spins the wheel, creating a Bin based on a random integer from 0-36
     */
    public void spin() {
        // simulates one spin on the wheel
        Random random = new Random();
        int number = random.nextInt(37);
        // bound is NOT inclusive
        this.resultBin = new Bin(number);
        this.currentNumber = random;
    }
}
