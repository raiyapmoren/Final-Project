/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class paintestimator {

    private static double ans4;
    
	public static void main (String args[]) 
	{ int sizeOfWall= 115;
	  int gallon= 1;
	  int hoursOfLabor= 8;
	  int laborCostPerHour= 18;
          
          
	  //Create Scanner and Decimal format
	  Scanner scan= new Scanner(System.in);
	  DecimalFormat df = new DecimalFormat(".00");
          
          //Questions for input from user
	 
          //Number of rooms to be painted
	  System.out.println(" Enter the number of rooms" + " that needs to be painted: ");
	  double numberOfRooms= scan.nextDouble();
	  
          //Amount of feet squared of wall space in each room
	  System.out.println("Enter the amount of wall space in each room ( calculate in square feet): ");
	  double sizeRoom = scan.nextDouble();
          
	 //Amount for pricer per gallon
	  System.out.println(" Enter the price of paint per gallon: ");
	  double priceOfPaint = scan.nextDouble();
	 
          //Calcualte how many of 115ft^2 is there (divide size of wall w/ roomsize * # of rooms
	  double roomCostUnit = (sizeRoom * numberOfRooms)/sizeOfWall;
	  
          //Call methods
          
          //Cal1 method
	  double numberOfGallons = cal1( sizeRoom, sizeOfWall);
	  System.out.println("The number of Gallons of paint needed is: " + df.format
	  (numberOfGallons));
          
	  //Cal2 method	  
	  double hoursRequired = cal2(hoursOfLabor, roomCostUnit);
	  System.out.println("The hours of labor required is: " + df.format(hoursRequired));
	  
          //Cal3 method
	  double ans3 = cal3(priceOfPaint, numberOfGallons);
	  System.out.println("The cost of the paint is: $" + df.format(ans3));
	  
          //Cal4 method
	  double ans4 = cal4(hoursRequired, laborCostPerHour);
	  System.out.println("The charges for labor is: $" + df.format(ans4));
	  
          //cal5 method
	  double ans5 = cal5(ans3, ans4);
	  System.out.println("The total cost of the paint job is: $" + df.format(ans5));
	}
        
        //Calculations
	
    public static double cal1( double roomCostUnit, double sizeOfWall)
    { 
       double result;
    
      result =  ( roomCostUnit / sizeOfWall ) * 1;
      return result;
     }
     
     public static double cal2(double roomCostUnit,double hoursOfLabor)
     {
       double result;
		 
	 result = ( roomCostUnit / 115 ) * 8;
	 return result;
		 
	 }
	 
	 public static double cal3(double priceOfPaint,
	 double numberOfGallons)
	 {
	 double result;
		 
	 result = numberOfGallons * priceOfPaint;
	 return result;
		 
	 }
	 
	 public static double cal4( double hoursRequired, 
	 double laborCostPerHour)
	 {
	 double result;
		 
	result = hoursRequired * laborCostPerHour;
	return result;
		 
	 }
	 public static double cal5 ( double ans3, double ans4){
             double result;
             result = ans3 + ans4;
             return result;
             
         }
	

}

