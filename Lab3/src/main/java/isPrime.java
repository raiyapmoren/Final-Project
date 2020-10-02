/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class isPrime {
    
    public static boolean isPrime ( int userNum ) {
        int evenNum = 0;
        if( userNum < 1 ) {
            return false;
        }
        for( int origDiv = 1; origDiv <= userNum; origDiv++ ) {
            if ( userNum % origDiv == 0 ) {
                evenNum = evenNum + 1;
                if ( ( evenNum > 2 ) || ( userNum == 1 ) ) {
                    return false;
                    
                }
            }
        }
        return true;
    }
    public static void main( String [ ] args ) {
        System.out.println( isPrime ( -1 ) );
    }
}
