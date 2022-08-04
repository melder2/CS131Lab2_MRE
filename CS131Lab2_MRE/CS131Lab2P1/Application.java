 /**
 * 
 * @author Michael Elder
 * Programming Lab 2
 *	The Application class creates two wizard objects and tests the various methods
 */

public class Application {

	public static void main(String[] args) {
		/**
		 * Creating two wizards
		 */
		Wizard wizard = new Wizard();
		Wizard wizard1 = new Wizard();
		//creating two different Wizard objects
			/**
			 * Using the setHealth, setKey, unlock, and takeDamage methods & printing wizard.getHealth
			 */
			wizard.setHealth(100);
			//setHealth to wizard = 100
			wizard.setKey(1);
			//setKey int to 1
			wizard.unlock(1);
			//unlocking the wizard
			wizard.takeDamage(5);
			//calling the takeDamage method by 5
				System.out.println("Wizard has " + wizard.getHealth() + " health.");
				//Printing out the wizard's health
			/**
			 * Using the lock and takeDamage methods & printing wizard.getHealth
			 */
			wizard.lock(1);
			//locking the wizard
			wizard.takeDamage(15);
			//attempting to call the takeDamage method
				System.out.println("Wizard has " + wizard.getHealth() + " health." + "\n");
				//Printing out the wizard's health
			/**
			 * Using the setHealth and takeDamage methods & printing wizard1.getHealth
			 */
			wizard1.setHealth(100);
			//setHealth to wizard1 = 100
			wizard1.takeDamage(50);
			//calling the takeDamage method by 50
				System.out.println("Wizard1 has " + wizard1.getHealth() + " health.");
				//Printing out wizard1's health
			/**
			 * Using the setKey, lock, and takeDamage methods & printing wizard1.getHealth
			 */
			wizard1.setKey(1);
			//setKey int to 1
			wizard1.lock(1);
			//locking the wizard1
			wizard1.takeDamage(5);
			//attempting to takeDamage by 5
				System.out.println("Wizard1 has " + wizard1.getHealth() + " health.");		
				//Printing out wizard1's health
			/**
			 * Using the unlock and takeDamage methods & printing getHealth, wizard.isLocked, and wizard1.isLocked
			 */
			wizard1.unlock(1);
			//unlocking wizard1
			wizard1.takeDamage(10);
			//calling the takeDamage method by 10
				System.out.println("Wizard1 has " + wizard1.getHealth() + " health." + "\n");		
				//Printing out wizard1's health
				System.out.println("The wizard is locked: " + wizard.isLocked());
				//Printing out if the key is locked for wizard
				System.out.println("The wizard1 is locked: " + wizard1.isLocked());
				//Printing out if the key is locked for wizard1
	}

}
