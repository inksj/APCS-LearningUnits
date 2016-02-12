// Java0806.java
// CardDeck Case Study #06
// The <CardDeck> class adds four "set" methods to alter
// the data attributes of <CardDeck> objects.


public class Java0806
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 06\n");
		CardDeck d = new CardDeck();
		d.setGame("Bridge");
		d.setDecks(1);
		d.setPlayers(4);
		d.setCards(52);
		System.out.println("Name of Card Game:    " + d.getGame());
		System.out.println("Number of Decks:      " + d.getDecks());
		System.out.println("Number of Players:    " + d.getPlayers());
		System.out.println("Number of Cards Left: " + d.getCards());
		System.out.println();
	}
}


class CardDeck
{
	// Data attributes
	private String cardGame;
	private int numDecks;
	private int numPlayers;
	private int cardsLeft;

	// Get return Methods
	public String getGame()		{ return cardGame; 	 }
	public int getDecks()		{ return numDecks;   }
	public int getPlayers()		{ return numPlayers; }
	public int getCards()		{ return cardsLeft;  }

	// Set void Methods
	public void setGame(String cG)
	{
		cardGame = cG;
	}

	public void setDecks(int nD)
	{
		numDecks = nD;
	}

	public void setPlayers(int nP)
	{
		numPlayers = nP;
	}

	public void setCards(int cL)
	{
		cardsLeft = cL;
	}
}

