import java.util.*;
public class CardsTest{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		System.out.println("What suit is your card?\n1 = Spades, 2 = Hearts, 3 = Clubs, 4 = Diamonds.");
		int s = ob.nextInt();
		System.out.println("What number is your card?\n1 = Ace, 2 = 2, ... 10 = 10, 11 = Jack, 12 = Queen, 13 = King.");
		int n = ob.nextInt();
		Cards test = new Cards(s, n);
		System.out.println(test);
	}
}