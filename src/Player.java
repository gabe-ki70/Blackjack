import java.sql.SQLOutput;
import java.util.Arrays;

public class Player {
    public int handLength;

    public int handValue;
    public Card[] hand = new Card[2];
    public String name;
    public boolean isPlayer; //dealer vs. player - maybe make into a boolean
    public String decision;
    public int numCards;
    public Player(String pUserName) {
        name = pUserName;
        isPlayer = true;
        hand = new Card[2];
        numCards = 0;

    }

    public void print() {
        System.out.println("");
        if (isPlayer){
            System.out.println("You have " + handValue + " points:");
            for (int i=0; i<hand.length; i++) {
                hand[i].print();
            }
        } else {
            System.out.println("the dealer has " + hand[0].value + " points:");
            hand[0].print();
        }

    }

    public void addCard(Card c){
        if(numCards>=2) {
            Card[] moreCards = new Card[hand.length + 1];
            for (int i = 0; i < hand.length; i++) {
                moreCards[i] = hand[i];
            }
            hand = moreCards;
        }
        hand[numCards] = c;
        numCards = numCards+1;
        handValue += c.value;

    }

}