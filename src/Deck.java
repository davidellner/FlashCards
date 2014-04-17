import java.util.Vector;
/**
 * 
 * @author Dan Dave Sean
 *
 */
public class Deck {
	//Class variables
	private Vector<Card> deck;
	private int deckID, attempts, correct;
	private String deckName;
	
	/**
	 * Constructor to create a new Deck given a Vector<Card> object
	 * @param deck
	 */
	public Deck(Vector<Card> deck){
		this.deck=deck;
		//Generate deckID
		//Add to database
	}
	
	/**
	 * Constructor to lookup existing Deck
	 * @param deckID
	 */
	public Deck(int deckID){
		//Lookup Deck data from database using deckID
		//Update associated class variables
	}
	
	public Card nextCard(){
		//
	}

}
