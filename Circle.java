// I had help from textbook and I got the idea to use the distance formula from http://stackoverflow.com/questions/9486520/finding-if-a-circle-is-inside-another-circle

import java.util.Scanner;
public class Circle
{ 
		  public static void main(String[] args) 
		  {
				double radius1, radius2;
				double circle1a, circle1b, circle2a, circle2b;
				double distance1a;
				System.out.println ("Enter coordinates for Circle 1 followed by the radius");
				while (System.in != null )
				{
		        	
		        	System.out.print ("First coordinate: ");
		        	Scanner input = new Scanner(System.in);
		        	circle1a= input.nextDouble();
		        	System.out.print ("Second coordinate: ");
		        	input = new Scanner(System.in);
		        	circle1b= input.nextDouble();
		        	System.out.print ("Radius for Circle 1: ");
		        	input = new Scanner(System.in);
		        	radius1= input.nextDouble();
		        	System.out.println ("Enter coordinates for Circle 2 followed by the radius");
		        	System.out.print ("First coordinate: ");
		        	input = new Scanner(System.in);
		        	circle2a= input.nextDouble();
		        	System.out.print ("Second coordinate: ");
		        	input = new Scanner(System.in);
		        	circle2b= input.nextDouble();
		        	System.out.print ("Radius for Circle 2: ");
		        	input = new Scanner(System.in);
		        	radius2= input.nextDouble();
		        	distance1a = Math.sqrt((circle1a-circle2a)*(circle1a-circle2a) + (circle1b-circle2b)*(circle1b-circle2b));
		        	
		        	if (distance1a > (radius1 + radius2))
		        		System.out.println ("Circles are not touching each other");
		        	else if (distance1a <= radius1 - radius2) 
		        		System.out.println ("Circles are within each other");
		        	else if (distance1a <= radius1 + radius2)
						System.out.println ("Circles are overlapping each other");
		        	else if (distance1a == radius1 + radius2)
		        		System.out.println ("Circles are touching each other");
		        	System.out.println (distance1a);
		  }
		  }
				
				
					
				
		  }

		  


			  
			
	 
	 
	   
	    
	

