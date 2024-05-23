public class Cards {

    public int cardNum;


    public String suitName;

    public int suitNum;

    public String cardName;
    public int points;

    public Cards(int paramcardNum, int paramSuit){
        cardNum = paramcardNum;
        suitNum = paramSuit;
        if (suitNum == 1) {
            suitName = "Spades";
        }

        if (suitNum == 2) {
            suitName = "Hearts";
        }

        if (suitNum == 3) {
            suitName = "Clubs";
        }

        if (suitNum == 4) {
            suitName = "Diamonds";
        }



        if (cardNum == 1) {
            cardName = "ace";
        }

        if (cardNum == 2) {
            cardName = "two";
        }

        if (cardNum == 3) {
            cardName = "three";
        }

        if (cardNum == 4) {
            cardName = "four";
        }

        if (cardNum == 5) {
            cardName = "five";
        }

        if (cardNum == 6) {
            cardName = "six";
        }

        if (cardNum == 7) {
            cardName = "seven";
        }

        if (cardNum == 8) {
            cardName = "eight";
        }

        if (cardNum == 9) {
            cardName = "nine";
        }

        if (cardNum == 10) {
            cardName = "ten";
        }

        if (cardNum == 11) {
            cardName = "Jack";
        }

        if (cardNum == 12) {
            cardName = "Queen";
        }

        if (cardNum == 13) {
            cardName = "King";
        }





    }

    public void Info() {

            System.out.println("You have " + cardName + " of " + suitName);

    }
}
