import java.util.Scanner;

// Had help from website: http://www.javapractices.com/topic/TopicAction.do?Id=62
public class TriangleCalc {
  
  public static void main(String [] args){
	  int A1, A2, B1, B2, C1, C2; // int variables for coordinates
	  double side1, side2, side3; // double variables to calculate the sides
	 
      System.out.println("Enter 2D points A, B and C" );
      Scanner input = new Scanner(System.in);
      System.out.print("Coordinate A1 " );
      A1 = input.nextInt();
      System.out.print("Coordinate A2 " );
  	A2 = input.nextInt();
  	System.out.print("Coordinate B1 " );
  	B1 = input.nextInt();
  	System.out.print("Coordinate B2 " );
  	B2 = input.nextInt();
  	System.out.print("Coordinate C1 " );
  	C1 = input.nextInt();
  	System.out.print("Coordinate C2 " );
  	C2 = input.nextInt();
  	side1 = Math.sqrt((A2-A1)^2+(B2-B1)^2);
  	side2 = Math.sqrt((B2-B1)^2+(C2-C1)^2);
  	side3 = Math.sqrt((C2-C1)^2+(A2-A1)^2);
  	System.out.println("Side 1 of triangle: " + side1);
  	System.out.println("Side 2 of triangle: " + side2);
  	System.out.println("Side 3 of triangle: " + side3);
  	if (side1 + side2  > side3 || side2 + side3  > side1 || side1 + side3  > side2)
  		System.out.println("Coodinates entered is a valid triangle" );
  	else
  		System.out.println("Coodinates entered is not a valid triangle" );
  		
  	
    	}
    }

