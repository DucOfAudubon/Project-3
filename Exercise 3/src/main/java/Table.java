package aup.cs;

public class Table {
    /**
     * The table represents all the bets available to the player
     */
    private Object[] possibleBets = {int 0, int 1, int 2, int 3, int 4, int 5, int 6, int 7, int 8,
    int 9, int 10, int 11, int 12, int 13, int 14, int 15, int 16, int 17, int 18, int 19, int 20,
    int 21, int 22, int 23, int 24, int 25, int 26, int 27, int 28, int 29, int 30, int 31, int 32,
    int 33, int 34, int 35, int 36, String "Even", String "Odd", String "Red", String "Black",
    String "First Third", String "Second Third", String "Third Third", String "First Half", String "Second Half"};

    /**
     * this allows the player to 'throw' their bet onto a random bet on the table
     * it takes a random element from the array of possibleBets
     * @return one of the bets
     */
    public Object randomBet(){
        int rnd = new java.util.Random().nextInt(possibleBets.length);
        return possibleBets[rnd];
    }
}
