package application;
import java.util.*;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Welcome welcome = new Welcome();
		welcome.displayWelcomeString();
	}

	void displayWelcomeString()
	{

		System.out.println("#                                                                                   \n"
				+ "#   _ _ _     _                      _          __            _         _ _____     \n"
				+ "#  | | | |___| |___ ___ _____ ___   | |_ ___   |  |   ___ ___| |_ ___ _| |     |___ \n"
				+ "#  | | | | -_| |  _| . |     | -_|  |  _| . |  |  |__| . |  _| '_| -_| . | | | | -_|\n"
				+ "#  |_____|___|_|___|___|_|_|_|___|  |_| |___|  |_____|___|___|_,_|___|___|_|_|_|___|\n"
				+ "#                                                                                   ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Press Enter key 'H' to go to home screen");		
	
		loadScanner();

	}

	private void loadScanner() {
		Scanner scanner = new Scanner(System.in);
		String enterAction = scanner.next();
		moveToMainMenu(enterAction, scanner);
	}	
	
	private void moveToMainMenu(String action, Scanner scanner) {
		if (action.equals("H")) {
			
			Home home = new Home();
			home.displayHomeScreen();
		}
		else {
			System.out.println("Other pressed");
			scanner.reset();
			loadScanner();

		}
	}
}
