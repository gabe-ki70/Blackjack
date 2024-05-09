public class Card {

    public String suit;
    public int cardvalue;
    public String type;

    public Card(int pType, int pSuit){
        if(pType == 0){
            type = "Ace";
            cardvalue = 11;
        }
        else if(pType == 1){
            type = "Two";
            cardvalue = 2;
        }
        else if(pType == 2){
            type = "Three";
            cardvalue = 3;
        }
        else if(pType == 3){
            type = "Four";
            cardvalue = 4;
        }
        else if(pType == 4){
            type = "Five";
            cardvalue = 5;
        }
        else if(pType == 5){
            type = "Six";
            cardvalue = 6;
        }
        else if(pType == 6){
            type = "Seven";
            cardvalue = 7;
        }
        else if(pType == 7){
            type = "Eight";
            cardvalue = 8;
        }
        else if(pType == 8){
            type = "Nine";
            cardvalue = 9;
        }
        else if(pType == 9){
            type = "Ten";
            cardvalue = 10;
        }
        else if(pType == 10){
            type = "Jack";
            cardvalue = 10;
        }
        else if(pType == 11){
            type = "Queen";
            cardvalue = 10;
        }
        else if(pType == 12){
            type = "King";
            cardvalue = 10;
        }

        if(pSuit == 0){
            suit = "Spades";
        }
        if(pSuit == 1){
            suit = "Hearts";
        }
        if(pSuit == 2){
            suit = "Diamonds";
        }
        if(pSuit == 3){
            suit = "Clubs";
        }

    }

    public void print(){
        System.out.println("The " + type + " of " + suit + " is worth " + cardvalue + " points.");
    }
}
