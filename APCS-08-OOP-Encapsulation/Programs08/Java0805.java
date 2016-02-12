// Java0805.java
// CardDeck Case Study #05
// The <CardDeck> class now has four "get" methods to return
// the data values of <CardDeck> objects.
// Note that Java assigns initial values to object data.


public class Java0805
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 05\n");
		CardDeck d = new CardDeck();
		System.out.println("Name of Card Game:    " + d.getGame());
		System.out.println("Number of Decks:      " + d.getDecks());
		System.out.println("Number of Players:    " + d.getPlayers());
		System.out.println("Number of Cards Left: " + d.getCards());
		System.out.println();
	}
}


class CardDeck
{
	private String cardGame;
	private int numDecks;
	private int numPlayers;
	private int cardsLeft;

	public String getGame()
	{
		return cardGame;
	}

	public int getDecks()
	{
		return numDecks;
	}

	public int getPlayers()
	{
		return numPlayers;
	}

	public int getCards()
	{
		return cardsLeft;
	}
}

