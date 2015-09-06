

import java.util.Scanner;
public class Pyramid
{ 
	 public static void floor(int x)
	 {
		 int space = x;
		 for(int i=1; i<=space; i++)
		 {
			 
			 	        for(int j=1; j<=space-i; j++)
			
			 	        System.out.println(" ");
			 	        for(int k=1; k<=2*i-1; k++)
			 	        {
			 	        System.out.print(k + " ");
			 	        for (int l = k; l > 0; i--)
			 	        {
			 	        	System.out.print(l + " ");
			 	        }
			 	        }
			 	        }
		 space--;
			 	        }
		
		 
		
		 
		 
	
		 
		 
	 
		
	 

		  public static void main(String[] args) 
		  {
				int level;
				System.out.println ("Enter the number of levels you want on your pyramid");
				Scanner input = new Scanner(System.in);
	        	level= input.nextInt();
				
		        	floor(level);
		        	
				
				
					
				
		  
		  }
}
		  


			  
			
	 
	 
	   
	    
	

