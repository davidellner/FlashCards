/**
 * 
 * @author Dan Dave Sean
 *
 */
public class User {
	
	//Class variables
	private int userID, totalAttempts, totalCorrect;
	private String userName, password;
	
	/**
	 * Constructor to create a new User
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password){
		//Create new User
		//Generate userID
		//Add to database
	}
	
	/**
	 * Constructor to lookup existing User
	 * @param userID
	 */
	public User(int userID){
		//Lookup User data from database using userID
		//Update associated class variables
	}
	
	/**
	 * Pretty self-explanatory
	 * @return
	 */
	public int getUserID(){
		return this.userID;
	}
}
