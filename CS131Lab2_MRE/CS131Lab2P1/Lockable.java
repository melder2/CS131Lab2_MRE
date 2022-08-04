/**
 * 
 * @author Michael Elder
 * Programming Lab 2
 *	The Lockable interface contains the setKey, lock, unlock, and isLocked methods where they were implemented in the Wizard class.
 */
public interface Lockable {
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
}
