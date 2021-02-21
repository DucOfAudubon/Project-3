
public class Game {
    private Wheel wheel;
    // generate outcomes of spin

    public Game() {
        wheel = new Wheel();
    }

    public int calculatePayoutStraight(int bet) {
        //calculates payout on a straight bet
        return (bet * 35);
    }
    public int calculatePayoutOfTwo(int bet) {
        //calculates payout on a bet of even/odd or red/black
        return (bet * 2);
    }
    public void cycle(Player player) {
        int b = player.placeBets();
        wheel.spin();
        //TODO
        wheel.reset();
    }
}
