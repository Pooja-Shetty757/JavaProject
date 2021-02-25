package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
	    File file = new File("F:\\febjee");
	    try {
		    FileInputStream fis = new FileInputStream(file+"\\sample.txt");
		    FileOutputStream fisnew = new FileOutputStream(file+"\\copy.txt");
			int c;
			while((c= fis.read()) != -1)
			fisnew.write(c);
			System.out.print((char)c);
		    fis.close();
			fisnew.close();
			}
	          catch (IOException e) {
	        	  e.printStackTrace();
	        	  
	          }
	      
	}
	
}
	
		 
		
		
	    	  
