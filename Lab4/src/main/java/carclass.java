/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class carclass {
    public static void main( String [ ] args ) {
        Car car1 = new Car( 2016, " Honda" );
        
        System.out.println( "Accelerating...");
        for( int seconds = 1; seconds <=5; seconds++) {
            car1.accelerate();
            System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() + " km/h" );
            
        }
         
        System.out.println( "\nBraking...");
        for( int seconds = 1; seconds <=5; seconds++) {
            car1.brake();
            System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() + " km/h" );
            
        }
        
    }
    
}
