package application;
import java.util.Random;
class File {

	String fileNameString;
	String filePathString;
	int fileSize;
	
	File(String fileName, String filePath, int filesize)
	{
		this.fileNameString = fileName;
		this.filePathString = filePath;
		this.fileSize = filesize;
	}
	
	File(String fileName)
	{
		this.fileNameString = fileName;
		this.filePathString = fileName+".png";
		
		Random ran = new Random();
		int x = ran.nextInt(100);
		this.fileSize = x;
	}

}
