public class Cards{
	int suit; // 1 = Spades, 2 = Hearts, 3 = Clubs, 4 = Diamonds.
	int num; // 1 = Ace, 2 = 2, ... 10 = 10, 11 = Jack, 12 = Queen, 13 = King.
	int value; // Ace = 1 or 11, 2 = 2, ... 9 = 9, 10 = 10 = Jack = Queen = King.
	static int cardNum = 1;
	public Cards (int suit, int num){
		this.suit = suit;
		this.num = num;
		cardNum++;
		this.value =getValue();

	}

	public int getValue(){


		if(getNum().equals("Ace")){
			return 11;
		}
		if(getNum().equals("2")){
			return 2;
		}
		if(getNum().equals("3")){
			return 3;
		}
		if(getNum().equals("4")){
			return 4;
		}
		if(getNum().equals("5")){
			return 5;
		}
		if(getNum().equals("6")){
			return 6;
		}
		if(getNum().equals("7")){
			return 7;
		}
		if(getNum().equals("8")){
			return 8;
		}
		if(getNum().equals("9")){
			return 9;
		}
		if((getNum().equals("10"))||(getNum().equals("Jack")||(getNum().equals("Queen"))||(getNum().equals("King")))){


			return 10;
		}else return 505;

	}

	
	public String getSuit(){
		if(suit == 1) return "Spades";
		else if(suit == 2) return "Hearts";
		else if(suit == 3) return "Clubs";
		else if(suit == 4) return "Diamonds";
		else return "ERROR";
	}
	
	public String getNum(){
		String s = "ERROR";
		if (num==1) s="Ace";
		else if((num<11)&(num!=1)) s=""+num;
		else if(num==11) s="Jack";
		else if(num==12) s="Queen";
		else if(num==13) s="King";
		return s;
		
	}
	
	public String toString(){
		return (getNum()+ " of " +getSuit());
	}
}