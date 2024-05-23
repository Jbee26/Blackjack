public class Casino {

    public static void main(String[] args) {
        Casino c = new Casino();
    }

    public Cards[] deck;


    public Casino() {
        System.out.println("GAMEON");
        deck = new Cards[52];
    int counter = 0;
    for(int p = 1; p <= 4; p++) {
        for (int i = 1; i <= 13; i++) {
            Cards c = new Cards(i, p);

            deck[counter] = c;
            counter++;

            ///deck[i - 1].Info();

        }


        }




    shuffle();


    printDeck();
    deal();







    }

    public void shuffle() {

    for (int x=0 ; x<= 51; x++) {
        Cards temp = deck[x];
        int r = (int) (Math.random() * 52);
        deck[0] = deck[r];
        deck[r] = temp;
    }

    }

    public void deal() {

    }

    public void printDeck() {
        for (int i = 0; i < 52; i++){
           deck[i].Info();



        }

    }
}
