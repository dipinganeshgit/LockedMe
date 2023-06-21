package application;

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
		this.filePathString = "";
		this.fileSize = 0;
	}

}
