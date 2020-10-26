/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class Arrays {
    
    public static double getTotal( double [ ] numbers ) { 
        double total = 0;
        
        for( int currentNumIndex = 0; currentNumIndex < numbers.length; currentNumIndex++ ) {
            total = total + numbers[ currentNumIndex ];
        }
    return total;
    
    }
    public static double getAverage( double [ ] numbers ) { 
        double numbersTotal = getTotal( numbers );
        int numberOfItemsInNumArray = numbers.length;
        double average = numbersTotal / numberOfItemsInNumArray;
        return average;
        
    }
    public static double getHighest( double [ ] numbers ) {
        double highestNumber = numbers[ 0 ];
        
        for( int currentNumIndex = 0; currentNumIndex < numbers.length; currentNumIndex++ ) {
            if( numbers[ currentNumIndex ] > highestNumber ) {
                highestNumber = numbers[ currentNumIndex ];
                
            }
        }
        return highestNumber;
    }
    public static double getLowest( double [ ] numbers ) {
        double lowestNumber = numbers [ 0 ];
        
        for(int currentNumIndex = 0; currentNumIndex < numbers.length; currentNumIndex++ ) {
            if( numbers[ currentNumIndex ] < lowestNumber ) {
                lowestNumber = numbers[ currentNumIndex ];
            }
        }
        return lowestNumber;
    }
    public static void main( String [ ] args ) {
        double [ ] numbers = { 3.4, 3.6, 1.2, 4.5, 3.0};
        
        System.out.println( "Total; " + getTotal( numbers ) + "\n" +
                "Average: " + String.format("%.2f", getAverage( numbers ) ) + "\n" + 
                "Highest: " + getHighest( numbers ) + "\n" + 
                "Lowest: " + getLowest( numbers ) );
    }
    }
    


        
    
