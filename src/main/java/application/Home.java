package application;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Home {

	public static ArrayList <String> files = new ArrayList<String>();

	void displayHomeScreen()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("#                       \n"
				+ "#   _____               \n"
				+ "#  |  |  |___ _____ ___ \n"
				+ "#  |     | . |     | -_|\n"
				+ "#  |__|__|___|_|_|_|___|\n"
				+ "#                       ");
		System.out.println();
		System.out.println("Please select any of the oprtion");
		System.out.println("1. Files");
		System.out.println("2. File Operations");
		System.out.println("3. Exit");
	
		int option = scanner.nextInt();
		
		launchInitialOptionSelection(scanner, option);
	}
	
	private void launchInitialOptionSelection(Scanner scanner, int option) {
		switch (option)
		{
		case 1:
		{

			HeapSorting sorting = new HeapSorting();
			ArrayList<String> sortedFiles = sorting.sortArray(files);
			if (sortedFiles.size() == 0) {
				System.out.println("No Files available please add some files");
			}
			else {
				displayFiles(sortedFiles);
			}

		}

			break;
				
		case 2:
		{
			
		}
			break;
		case 3:
		{
				
		}
			break;
		
		default:
			System.out.println("Wrong option selected.");
			displayHomeScreen();
			break;
		}
	}
	
	void displayFiles(ArrayList<String> sortedList)
	{
		for (int i=0; i < sortedList.size(); i++) {
			String fileString = sortedList.get(i);
			System.out.println(+i+"- "+fileString);
		}
	}

}

class FileList{
	
}
