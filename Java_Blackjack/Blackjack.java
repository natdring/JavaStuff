import java.util.*;
public class Blackjack{

	Cards[] deck;
	int numInDeck;
	static int aceCount = 0;

	public Blackjack(){
		deck = new Cards[52];
		int count = 0;
		for(int i=1; i<5; i++){
			for(int j=1; j<14; j++){
				deck[count] = new Cards(i,j);
				count++;
			}
		}
		numInDeck = deck.length;
	}

	public Cards drawCard(){
		Random r = new Random();
		int n = r.nextInt(numInDeck);
		Cards card = deck[n];
		Cards temp = deck[numInDeck-1];
		deck[n] = temp;
		removeCard();
		return card;
	}

	public int ifAce(){

		//if deck[numInDeck]

		return aceCount++;
	}

	public void removeCard(){
		Cards[] upDeck = new Cards[numInDeck-1];
		for(int i=0; i<numInDeck-1; i++){
			upDeck[i]=deck[i];
		}
		deck = upDeck;
		numInDeck = numInDeck-1;
	}

	
}