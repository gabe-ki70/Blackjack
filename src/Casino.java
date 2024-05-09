public class Casino {

    public Card[] deck;

    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Casino(){
        System.out.println("Welcome to Gabe's Casino");
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
}
