// Java0802.java
// CardDeck Case Study #02
// Variables, called attributes or data fields, are added to the <CardDeck> class.


public class Java0802
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 02\n");
		System.out.println();
		CardDeck d = new CardDeck();
		System.out.println();
	}
}


class CardDeck
{
	String cardGame;	// name of the card game
	int numDecks;		// number of decks in a game
	int numplayers;		// number of players in a game
	int cardsLeft;		// number of cards left in the deck(s)
}

