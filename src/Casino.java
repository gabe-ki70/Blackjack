import java.util.Scanner;
public class Casino {

    public Card[] deck;
    public int numDealtCards;
    public boolean isHit;
    public Player p;
    public Player dealer;
    public static void main(String[] args) {
        Casino c = new Casino();
    }


    public Casino() {
        System.out.println("welcome to the casino");
        makeDeck();
        shuffleDeck();
        printDeck();



        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username:");
        String userName = scan.nextLine();
        System.out.println(userName);
        p = new Player(userName);

        dealer = new Player("dealer");
        dealer.isPlayer = false;

        deal();

        p.print();

        dealer.print();

System.out.println("");
System.out.println("Do you want to hit or stand?");
String decision = scan.nextLine();
System.out.println(decision);
        boolean isHit;
if(decision.equals("hit")){
    isHit = true;
    System.out.println("You decided to hit");
}
else{
    isHit = false;
    System.out.println("You decided to stand");
}

if(isHit){
    //take a card from the deck add it to hand
    //use add card to do this
    //update value
    p.addCard(deck[numDealtCards++]);
    numDealtCards++;
    p.print();
}
else{
    //dealer has to play
    //dealer hits until 17 or greater
        //useu add card to do this
}



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

            Card temp = deck[x];
            deck[x]=randomCard;
            deck[randomIndex] = temp;
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

        dealer.addCard(deck[2]);
        dealer.addCard(deck[3]);
        numDealtCards = 4;
    }

}