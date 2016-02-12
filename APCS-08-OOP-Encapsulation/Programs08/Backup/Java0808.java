// Java0808.java
// CardDeck Case Study #08
// This program adds the <shuffleCards> method, which is a <private> helper method
// used by the <CardDeck> constructor.


public class Java0808
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 08\n");
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

	public CardDeck()
	{
		cardGame = "Poker";
		numDecks = 1;
		numPlayers = 4;
		cardsLeft = 52;
		shuffleCards();
	}

	private void shuffleCards()
	{
		System.out.println("Shuffling Cards");
	}


	public String getGame()		  { return cardGame;   }
	public int getDecks()		  { return numDecks;   }
	public int getPlayers()		  { return numPlayers; }
	public int getCards()		  { return cardsLeft;  }

	public void setGame(String cG)	{ cardGame = cG;   }
	public void setDecks(int nD)	{ numDecks = nD;   }
	public void setPlayers(int nP)	{ numPlayers = nP; }
	public void setCards(int cL)	{ cardsLeft = cL;  }

}

