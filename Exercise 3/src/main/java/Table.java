package aup.cs;

public class Table {
    /**
     * The table represents all the bets available to the player
     */
    private Object[] possibleBets = {Integer 0, Integer 1, Integer 2, Integer 3, Integer 4, Integer 5, Integer 6, Integer 7, Integer 8,
            Integer 9, Integer 10, Integer 11, Integer 12, Integer 13, Integer 14, Integer 15, Integer 16, Integer 17, Integer 18, Integer 19, Integer 20,
            Integer 21, Integer 22, Integer 23, Integer 24, Integer 25, Integer 26, Integer 27, Integer 28, Integer 29, Integer 30, Integer 31, Integer 32,
            Integer 33, Integer 34, Integer 35, Integer 36, String "Even", String "Odd", String "Red", String "Black",
    String "First Third", String "Second Third", String "Third Third", String "First Half", String "Second Half"};

    /**
     * this allows the player to 'throw' their bet onto a random bet on the table
     * it takes a random element from the array of possibleBets
     * @return one of the bets
     */
    public Object RandomBet(){
        int rnd = new java.util.Random().nextInt(possibleBets.length);
        return possibleBets[rnd];
    }
}
