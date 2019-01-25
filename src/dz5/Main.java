package dz5;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		FileFilter ffilt = new FileFilterImplementation("pdf");
		File folderFrom = new File("folderFrom");
		File folderTo = new File("folderTo");
		try {
			FileOperation.copyFolder(folderFrom, folderTo, ffilt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}