import java.util.*;
public class Game{

	public static void main(String[] args){
		Blackjack game = new Blackjack();
		Scanner ob = new Scanner(System.in);
		Cards[] deck = game.deck;
		Cards[] hand = deal(game);
		int handValue = 0;
		String userInput = "";
		boolean aceChanged=false;


		displayHand(hand);
		handValue=handValue(hand);
		if(handValue==22) addToVal(aceChanged);
		if(handValue==22) aceChanged=true;
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		if(handValue==21){
				System.out.println("Blackjack!");
				System.exit(0);
			}
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		} 
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}



		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
		displayHand(hand);
		handValue=handValue(hand);
		if(oneOrEleven(hand, hasAce(hand))) handValue+=addToVal(aceChanged);
		if(oneOrEleven(hand, hasAce(hand))) aceChanged=true;
		System.out.println("Hit? y/n");
		userInput=ob.nextLine();
		if((userInput.equals("y"))){
			hand=hit(hand, game);
			handValue=handValue(hand);
			if(handValue>21){
				displayHand(hand);
				System.out.println("You Lose");
				System.exit(0);
			} 
			if(handValue==21){
				displayHand(hand);
				System.out.println("Blackjack!");
				System.exit(0);
			}
		}
		if(userInput.equals("n")){
			System.out.println("Hand Value: "+handValue(hand));
			System.exit(0);
		}
	}

	

	public static int addToVal(boolean aceChanged){
		if(aceChanged) return 0;
		return -10;
	}

	public static void displayHand(Cards[] hand){
		for(int i=0; i<hand.length; i++){
			System.out.println("Card "+(i+1)+": "+hand[i]);
		}
		System.out.println("Hand Value: "+handValue(hand));
	}


	public static boolean aceToEleven(Cards[] hand, int handValue){
		if(oneOrEleven(hand, hasAce(hand))){
			for(int i=0; i<hand.length; i++){
				if((hand[i].getNum()).equals("Ace")){
					return true;
				}   
			}
		}
		return false;
	}

	public static boolean hasAce(Cards[] hand){

		for(int i=0; i<hand.length; i++){
			if((hand[i].getNum()).equals("Ace")) return true;
		}
		return false;
	}

	public static Cards[] deal(Blackjack deck){
		Cards[] hand = new Cards[2];
		hand[0] = deck.drawCard();
		hand[1] = deck.drawCard();
		return hand;
	}



	public static boolean oneOrEleven(Cards[] hand, boolean hasAce){
		if((handValue(hand)>21)&&(hasAce)){
			return true;
		}


		else return false;
	}

	public static int handValue(Cards[] hand){
		int val=0;

		for(int i=0; i<hand.length; i++){
			val += hand[i].value;
		}
		return val;
	}




	public static Cards[] hit(Cards[] hand, Blackjack deck){
		Cards[] newHand = new Cards[hand.length+1];
		for(int i=0; i<hand.length; i++){
			newHand[i]=hand[i];
		}
		newHand[newHand.length-1] = deck.drawCard();
		return newHand;
	}
}