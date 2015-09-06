import java.util.Random;

// Had help from website: http://www.javapractices.com/topic/TopicAction.do?Id=62
public class Randomnum {
  
  public static void main(String [] args){

    
 
    Random randomnumber = new Random();
    for (int i = 1; i<= 10; ++i){
      String month = null;
      int randomInt = randomnumber.nextInt(12);
      if (randomInt == 1)
    	  month = "January";
      else if (randomInt == 2)
          month = "February"; 
      else  if (randomInt == 3)
    	  month = "March";
      else  if (randomInt == 4)
    	  month = "April";
      else  if (randomInt == 5)
    	  month = "May";
      else   if (randomInt == 6)
    	  month = "June";
      else   if (randomInt == 7)
    	  month = "July";
      else  if (randomInt == 8)
    	  month = "August";
      else  if (randomInt == 9)
    	  month = "September";
      else  if (randomInt == 10)
    	  month = "October";
      else  if (randomInt == 11)
    	  month = "November";
      else  if (randomInt == 12)
    	  month = "December";
      System.out.println(month);
    	}
    }
}
