// Java0803.java
// CardDeck Case Study #03
// <CardDeck> variables are accessed directly by the <main> method.
// This program violates encapsulation, even though it compiles, and executes.
// This approach greatly compromises program reliability.


public class Java0803
{
	public static void main(String args[])
	{
		System.out.println("\nCard Deck Case Study 03\n");
		CardDeck d = new CardDeck();
		d.cardGame = "Poker";
		d.numDecks = 1;
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
	String cardGame;
	int numDecks;
	int numPlayers;
	int cardsLeft;
}
