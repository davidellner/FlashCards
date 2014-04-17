/**
 * 
 * @author Dan Dave Sean
 *
 */
 
public class Card {
	
	//Class variables
	private int cardID, attempts, correct, userID;
	private String question, answer;
	
	/**
	 * Constructor to create new Card
	 * @param question
	 * @param answer
	 */
	public Card(String question, String answer){
		//Create new card
		//Generate cardID
		//Add to database
	}
	
	/**
	 * Constructor to lookup existing Card
	 * @param cardID
	 */
	public Card(int cardID){
		//Lookup Card data from database using cardID
		//Update associated class variables
	}
	
	/**
	 * Track User's attempts, update corresponding class variables and database values
	 * @param answer
	 * @return
	 */
	public int createAttempt(String answer){
		//Read in submitted answer
		//Check if answer.equalsIgnoreCase(this.answer)
		//Increment this.attempts and this.correct
		//Update database values in db.card and db.user_score
		//Return result as int code
		return -1;
	}
	
	/**
	 * Pretty self-explanatory
	 * @return
	 */
	public int getCardID(){
		return this.cardID;
	}
}
