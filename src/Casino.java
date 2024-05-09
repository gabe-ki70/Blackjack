public class Casino {

    public Card[] deck;

    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Casino(){
        System.out.println("Welcome to Gabe's Casino");
        makeDeck();
        shuffle();
        printDeck();
    }

    public void makeDeck(){
        deck = new Card[52];
        int count = 0;
        for(int t = 0; t < 13; t++){
            for(int s = 0; s < 4; s++) {
                deck[count] = new Card(t, s);
                deck[count].print();
                count++;
            }
        }
    }

    public void shuffle(){
        //for loop
        for(int x = 0; x < 52; x++){
            int randomIndex = (int)(Math.random()* 52);
            Card randomCard = deck[randomIndex];
            Card temp = deck[x];
            deck[x] = randomCard;
            deck[randomIndex] = temp;
            //grab random card and swap with the current index(x)
        }

    }

    public void printDeck(){
        for(int i = 0; i < deck.length; i++){
            deck[i].print();
        }
    }
}
