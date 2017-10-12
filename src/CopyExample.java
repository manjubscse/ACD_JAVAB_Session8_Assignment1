//Program to copy the file
//Import Java class files for File operations
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
//Declaring Class 
public class CopyExample 
{
	//Main method of class
    public static void main(String[] args)
    {	
    //	Declaring objects for input stream and output string 
    	FileInputStream instream = null;
    	FileOutputStream outstream = null;
 
    	//Begin Try Block
    	try{
    		// Define the source files and destination file
    	    File infile =new File("E:\\JAVA\\eclipse-workspace\\CopyFile\\MyInputFile.txt");
    	    File outfile =new File("E:\\JAVA\\eclipse-workspace\\CopyFile\\MyOutputFile.txt");
 
    	    //Destination file
    	    outfile.createNewFile();
    	    
    	    //initialize the input stream and output stream
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    //Declare variable type byte
    	    byte[] buffer = new byte[1024];
 
    	    //Declare Variable type Int
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */   	    
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    //Display Message after file copy completed
    	    System.out.println("File copied successfully!!");
 
    	    
    	}
    	// Catch block to catch the exception if any issue occures
    	catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }
}