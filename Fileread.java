// I had help from textbook and website http://www.cs.swarthmore.edu/~newhall/unixhelp/Java_files.html
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread 
{ 
		  public static void main(String[] args) throws FileNotFoundException 
		  {
			  if(args.length < 1) 
			  {
			        System.out.println("File not found");
				System.exit(1);
			  }
					 
				 Scanner reader = new Scanner(new FileInputStream(args[0]));

				 int x;
				while (reader.hasNext())
				{ 
				System.out.println(reader.nextInt());
				}
		  }
}

			  
			
	 
	 
	   
	    
	

