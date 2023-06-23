package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;


public class FileOperations {

	void displayFileOperationScreen()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("#                                           \n"
				+ "#   _____                 _   _             \n"
				+ "#  |     |___ ___ ___ ___| |_|_|___ ___ ___ \n"
				+ "#  |  |  | . | -_|  _| .'|  _| | . |   |_ -|\n"
				+ "#  |_____|  _|___|_| |__,|_| |_|___|_|_|___|\n"
				+ "#        |_|                                ");
		System.out.println();
		System.out.println("Please select any of the operation");
		System.out.println("1. Add Files");
		System.out.println("2. Delete File");
		System.out.println("3. Search File");
		System.out.println("4. Go Back");
		
		if (scanner.hasNextInt()) {
			int option = scanner.nextInt();
			launchInitialOptionSelection(scanner, option);
		}
		else {
			System.out.println("Invalid Entry.");
			displayFileOperationScreen();
		}

	}
	
	private void launchInitialOptionSelection(Scanner scanner, int option) {
		switch (option)
		{
		case 1:
		{
			//Add File

			addFile(scanner);

		}

			break;
				
		case 2:
		{
			//Delete File
			
			deleteFileOptions();

			

		}
			break;
		case 3:
		{
			// Search File
			
			System.out.println("Please search the file name.");
			String searcText = scanner.next();
			searchFile(searcText);
		}
			break;
			
		case 4:
		{
			// Go Back
			
			Home home = new Home();
			home.displayHomeScreen();
		}
			break;
		
		default:
			System.out.println("Wrong option selected.");
			displayFileOperationScreen();
			break;
		}
	}

	private void addFile(Scanner scanner) {
		System.out.println("Please Enter the file name.");

		String fileName = scanner.next();

		File file = new File(fileName);
		Home.files.add(file);

		displayFileOperationScreen();
		scanner.close();
	}
	
	void searchFile(String searchText)
	{
		HeapSorting sorting = new HeapSorting();
		ArrayList<File> sortedFiles = sorting.sortArray(Home.files);
		System.out.println("Full List == "+sortedFiles);

		List<File> searchedFiles = sortedFiles.stream()
			    .filter(file -> file.fileNameString.contains(searchText)).collect(Collectors.toList());
		System.out.println("Filtered == "+searchedFiles);

	}
	
	private List<File> Arrays(ArrayList<File> sortedFiles) {
		// TODO Auto-generated method stub
		return null;
	}

	void deleteFileOptions()
	{
		HeapSorting sorting = new HeapSorting();
		ArrayList<File> sortedFiles = sorting.sortArray(Home.files);
		if (sortedFiles.size() == 0) {
			System.out.println("No Files available please add some files");
			displayFileOperationScreen();
		}
		else {
			displayFiles(sortedFiles);
		}
	}
	
	void displayFiles(ArrayList<File> sortedList)
	{
		displaySortedFiles(sortedList);
		
		Scanner scannerDelete = new Scanner(System.in);
		int option = scannerDelete.nextInt();
		
		if (option > 0 && option < sortedList.size()) {
			Home.files.remove((option -1));
			System.out.println("Successfully Deleted the file.");
			displayFileOperationScreen();

		}
		else {
			System.out.println("Invalid input, please try again.");
			displaySortedFiles(sortedList);
		}
		

	}

	private void displaySortedFiles(ArrayList<File> sortedList) {
		System.out.println("Please enter the file number to be deleted from the list.");
		for (int i=0; i < sortedList.size(); i++) {
			String fileString = sortedList.get(i).fileNameString;
			System.out.println(+(i+1)+". "+fileString);
		}
	}
}
