// Java0807.java
// CardDeck Case Study #07
// This <CardDeck> class uses a constructor to initialize variables
// during the instantiation of a new <CardDeck> object.
// This is an example of increasing reliability by an automatic constructor call.


public class Java0807
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 07\n");
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

	// Constructor
	public CardDeck()
	{
		cardGame = null;
		numDecks = 1;
		numPlayers = 1;
		cardsLeft = 52;
	}

	public String getGame()		   { return cardGame;   }
	public int getDecks()		   { return numDecks;   }
	public int getPlayers()		   { return numPlayers; }
	public int getCards()		   { return cardsLeft;  }

	public void setGame(String cG)	{ cardGame = cG;   	}
	public void setDecks(int nD)	   { numDecks = nD; }
	public void setPlayers(int nP)	 { numPlayers = nP; }
	public void setCards(int cL)	  { cardsLeft = cL; }

}

