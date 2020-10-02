/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
import java.util.Random;

public class evenOdd{
    
    public static boolean isEven( int Num ) {
        if( ( Num % 2 ) == 0 ) {
            return true;
        } else {
            return false;
        }
}
    
    public static void main( String [ ] args ) {
        Random random = new Random();
        int randomNum;
        int numEven = 0;
        int numOdd = 0;
        
        for( int origNum = 1; origNum <= 100; origNum++ ) {
           randomNum =  random.nextInt( 10 ) + 1;
           if( isEven( randomNum ) ) {
               numEven = numEven + 1;
           } else{
               numOdd = numOdd + 1;
               
           }
        }
        System.out.println( "There were " + numEven + " even numbers and " + numOdd + " odd numbers. ");
    }
}
    
   
