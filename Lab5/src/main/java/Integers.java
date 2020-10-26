/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class Integers {
    
    public static int [ ] greatNumber( int [ ] integerArray, int number ) {
    int [ ] greatNumberReturned = new int [ integerArray.length ];
    int greatNumberReturnedIndex = 0;
    
    for( int index = 0; index < integerArray.length; index++ ) {
        if( integerArray[ index ] > number ) { 
            greatNumberReturned[ greatNumberReturnedIndex ] = integerArray[ index ];
            greatNumberReturnedIndex = greatNumberReturnedIndex + 1;    
        }
    }
        return greatNumberReturned;
    
}
public static void main( String [ ] args ) {
    int [ ] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int number = 3;
    int [ ] greatNumberReturned = greatNumber( integerArray, number );
    
    for( int index = 0; index < greatNumberReturned.length; index++ ) {
        if( greatNumberReturned[ index ] != 0 ){
    System.out.print( greatNumberReturned[ index ] + " " );
    
        }
     }
   }
}