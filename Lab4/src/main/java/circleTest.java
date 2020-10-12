/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
import javax.swing.JOptionPane;

public class circleTest {
    public static void main( String [ ] args ) {
        
        String userInputString;
        double userRadius;
        String userOutputString;
        
    userInputString = JOptionPane.showInputDialog( "Please enther the circle's radius; " );
    userRadius = Double.parseDouble( userInputString );
    
    circle circle1 = new circle();
    
    circle1.setRadius( userRadius );
    
   userOutputString =  String.format( "Area: %.2f\nDiamter; %.2f\nCircumference: %.2f",circle1.getArea(), circle1.getDiameter(), circle1.getCircumference() ); 
    
    JOptionPane.showMessageDialog( null, userOutputString );
            
    System.exit( 0 );
}
}
