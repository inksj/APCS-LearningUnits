// Java0804.java
// Carddeck Case Study #04
// All the variables in the <CardDeck> class are now declared as private access.
// This prevents improper, public access to the data variables.


public class Java0804
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 04\n");
		CardDeck d = new CardDeck();
		d.cardGame = "Poker";
		d.numDecks = 4;
		d.numPlayers = 5;
		d.cardsLeft = 208;
		System.out.println("Name of Card Game:    " + d.cardGame);
		System.out.println("Number of Decks:      " + d.numDecks);
		System.out.println("Number of Players:    " + d.numPlayers);
		System.out.println("Number of Cards Left: " + d.cardsLeft);
		System.out.println();
	}
}


class CardDeck
{
	private String cardGame;
	private int numDecks;
	private int numPlayers;
	private int cardsLeft;
}
