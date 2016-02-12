// Java0809.java
// CardDeck Case Study #09
// A second, overloaded constructor, method is added to the program.
// It is now possible to specify card deck details during instantiation.


public class Java0809
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 09\n");
		CardDeck d1 = new CardDeck();
		CardDeck d2 = new CardDeck("BlackJack",4,5);
		System.out.println();
		System.out.println("Name of Card Game:    " + d1.getGame());
		System.out.println("Number of Decks:      " + d1.getDecks());
		System.out.println("Number of Players:    " + d1.getPlayers());
		System.out.println("Number of Cards Left: " + d1.getCards());
		System.out.println();
		System.out.println("Name of Card Game:    " + d2.getGame());
		System.out.println("Number of Decks:      " + d2.getDecks());
		System.out.println("Number of Players:    " + d2.getPlayers());
		System.out.println("Number of Cards Left: " + d2.getCards());
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
		System.out.println("Default Constructor");
		cardGame = "Poker";
		numDecks = 1;
		numPlayers = 4;
		cardsLeft = 52;
		shuffleCards();
	}

	public CardDeck(String cG, int nD, int nP)
   	{
      	System.out.println("Overloaded Constructor");
      	cardGame = cG;
      	numDecks = nD;
      	numPlayers = nP;
      	cardsLeft = nD * 52;
      	shuffleCards();
   	}

	private void shuffleCards()
	{
		System.out.println("Shuffling Cards");
	}

	public String getGame()		   { return cardGame;   }
	public int getDecks()		   { return numDecks;   }
	public int getPlayers()		   { return numPlayers; }
	public int getCards()		   { return cardsLeft;  }

	public void setGame(String cG)	 { cardGame = cG;   }
	public void setDecks(int nD)	 { numDecks = nD;   }
	public void setPlayers(int nP)   { numPlayers = nP; }
	public void setCards(int cL)	 { cardsLeft = cL;  }
}

