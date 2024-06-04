import java.util.Objects;
import java.util.Scanner;
public class Casino {

    public Card[] deck;
    public boolean isHit;
    public int deckPosition;
    public Player p;
    public Player dealer;
    public static void main(String[] args) {
        Casino c = new Casino();
    }




    public Casino() {
        System.out.println("welcome to the casino");
        makeDeck();
        shuffleDeck();



        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username:");
        String userName = scan.nextLine();
        System.out.println(userName);
        p = new Player(userName);
        dealer = new Player("dealer");
        dealer.isPlayer = false;
        deal();

        dealer.print();

        p.print();





        playGame();
    }

    public void makeDeck() {
        deck = new Card[52];
        int count=0;
        //setting the suit
        for (int s=0; s<4; s++) {
            for (int t=0; t<13; t++) {
                deck[count] = new Card(s,t);
                count++;
            }
        }
    }
    public void shuffleDeck() {
        for (int x=0; x<52; x++) {
            int randomIndex = (int)(Math.random()*52);
            Card randomCard = deck[randomIndex];
            Card moreCards = deck[x];
            deck[x]=randomCard;
            deck[randomIndex] = moreCards;
        }
    }
    public void printDeck() {
        for (int i=0; i<52; i++) {
            deck[i].print();
        }
    }

    public void deal(){
        p.addCard(deck[0]);
        p.addCard(deck[1]);
       // dealCard(p);
        //dealCard(p);

        dealer.addCard(deck[2]);
        dealer.addCard(deck[3]);
        //dealCard(dealer);
        //dealCard(dealer);
        deckPosition = 4;
    }

    public void playGame() {
        String decision = "";
        while(!decision.equals("stand") && p.handValue <= 21) {
            System.out.println("hit or stand?");
            Scanner scan = new Scanner(System.in);
            p.decision = scan.nextLine();
            if (p.decision.equals("hit")) {
                hitP(p);
                if (p.handValue > 21) {
                    System.out.println("Bust!");
                    break;
                }
               // System.out.println("The Dealer has " + dealer.handValue + " points:");
            }
            if (p.decision.equals("stand") && dealer.handValue < 22) {
                System.out.println("stand");
                while (dealer.handValue < 17) {
                    hitD(dealer);
                }
                System.out.println("The Dealer has " + dealer.handValue + " points:");
                if (dealer.handValue > 21){
                    System.out.println("Dealer Busts!");
                    break;
                }
                if (p.handValue > 21) {
                    System.out.println("Bust!");
                    break;
                }
                if (p.handValue > dealer.handValue && p.handValue <= 21) {
                    System.out.println("You win!");
                    break;
                }
                if (p.handValue < dealer.handValue && p.handValue <= 21) {
                    System.out.println("Dealer wins!");
                    break;
                }
                if (p.handValue == 21) {
                    System.out.println("Blackjack! You win!");
                    break;
                }

            }
        }
        }


    public void hitP(Player player) {
        dealCard(p);
        p.print();
      //  playGame();
    }

    public void hitD(Player dealer){
        dealCard(dealer);
       // dealer.print();
    }
    public void dealCard(Player moreCards) {
        moreCards.addCard(deck[deckPosition]);
        deckPosition++;
    }

}