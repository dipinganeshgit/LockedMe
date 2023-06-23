package application;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Home {

	public static ArrayList <File> files = new ArrayList<File>();

	void displayHomeScreen()
	{
		Scanner scanner = new Scanner(System.in);
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
			ArrayList<File> sortedFiles = sorting.sortArray(files);
			if (sortedFiles.size() == 0) {
				System.out.println();
				System.out.println();
				System.out.println("No Files available please add some files");
				displayHomeScreen();
			}
			else {
				displayFiles(sortedFiles, scanner);
			}

		}

			break;
				
		case 2:
		{

			FileOperations fileOperations = new FileOperations();
			fileOperations.displayFileOperationScreen();

		}
			break;
		case 3:
		{
			System.out.println("Thank you see you soon.");

			Welcome welcome = new Welcome();
			welcome.displayWelcomeString();
		}
			break;
		
		default:
			System.out.println("Wrong option selected.");
			displayHomeScreen();
			break;
		}
	}
	
	void displayFiles(ArrayList<File> sortedList, Scanner scanner)
	{
		System.out.println("These are the saved filenames.");

		for (int i=0; i < sortedList.size(); i++) {
			File fileObject = sortedList.get(i);
			System.out.println(+(i+1)+".  "+"Name: "+fileObject.fileNameString+"\n    "+"Size: "+fileObject.fileSize+"kb"+"\n    "+"Path: "+fileObject.filePathString);
		}
		
		System.out.println();
		System.out.println("Press 0 to go back.");
		
		if (scanner.hasNextInt()) {
			if (scanner.nextInt() == 0) {
				displayHomeScreen();
			}
		}


	}

}

