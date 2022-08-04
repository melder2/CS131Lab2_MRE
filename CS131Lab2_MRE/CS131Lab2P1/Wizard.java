/**
 * 
 * @author Michael Elder
 * Programming Lab 2
 *	The wizard class implements the Lockable interface which makes setKey, lock, unlock, isLocked methods have to be declared within the class.
 */
public class Wizard implements Lockable{
	/** 
	 * Creating name, health, key, and locked variables
	 */
	private String name;
	private int health;
	private int key;
	boolean locked;
	/** 
	 * Empty argument constructor and sets key = 0 and locked = false
	 */
	public Wizard() {
		key = 0;
		locked = false;
	}//end empty argument constructor
	/** 
	 * Preferred constructor with parameter name
	 */
	public Wizard(String name) {
		this.name = name;
	}//end preferred constructor
	/** 
	 * takeDamage method checks if the object isn't locked it will lose health.
	 */
	public void takeDamage(int power) {
		 if(!isLocked())
			 this.health = (this.health - power);
	}//takeDamage method
	/** 
	 * Getter for name
	 */
	public String getName() {
		return name;
	}//end getName
	/** 
	 * Setter for name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	/** 
	 * Getter for health
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	/** 
	 * Setter for health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	/** 
	 * Getter for key
	 */
	public int getKey() {
		return key;
	}//end getKey
	/** 
	 * Setter for key
	 */
	public void setKey(int key) {
		if(this.key == 0 && key > 0)
			this.key = key;
	}//end setKey
	/** 
	 * isLocked method
	 */
	public boolean isLocked() {
		return locked;
	}//end isLocked method
	/** 
	 * lock method 
	 */
	public void lock(int key) {
		if (this.key == key)
			this.locked = true;
	}//end lock method
	/** 
	 * Unlock method
	 */
	public void unlock(int key) {
		if (this.key == key)
			this.locked = false;
	}//end unlock method
}//end class
