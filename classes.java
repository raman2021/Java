import java.util.Random;
 
public class classes {
    public boolean winner;
    int Sides;
    private int value;
    private final int MAX_ROLLS = 10;
    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.
    private int myRollCount;   // # times rolled
    private int mySides;       // # sides
    private Random myRandGen;  // the random number generator
    private int MAX = 6;  // maximum face value
 
    public Die() {
        roll();
        winner();
    }
 
    public Die(int value) {
        MAX = value;
    }
 
    public int roll() {
        System.out.println("Dice 1          Dice 2");
        for (int i = 1; i <= MAX_ROLLS; i++) {
            int q, p;
            q = (int) (MAX * Math.random() + 1);
            p = (int) (MAX * Math.random() + 1);
            System.out.println("  " + q + "               " + p);
        }
        return 0;
    }
 
    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }
 
    public void setDie1(int die1) {
        this.die1 = die1;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public void setSides(int sides) {
        Sides = sides;
    }
 
    public int getSides() {
        return Sides;
    }
 
    public void setMySides(int mySides) {
        this.mySides = mySides;
    }
 
    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }
 
    public void setDie2(int die2) {
        this.die2 = die2;
    }
    public void winner() {
        int computerWins = 0, computerRoll = 0;
        int userWins = 0, userRoll = 0;
        int tiedGames = 0;
        if(computerWins >userWins) {
            System.out.println("You got beat by a computer!");
        } else {
            if (computerWins < userWins) {
                System.out.println("You beat the computer!");
            } else {
                System.out.println("The game has ended in a tie!");
            }
        }
    }
}
