/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class circle{
    private double radius;
    private final double PI = 3.14159;
    
    public circle( double radiusGiven ) {
        radius = radiusGiven;
    }
    public circle() {
        radius = 0.0;
    }
    
    public void setRadius( double radiusGiven ){
        radius = radiusGiven;
    }
     public double getRadius() {
     return radius;
     }
     public double getArea() {
     return PI * radius * radius;
     }
     public double getDiameter() {
     return radius * 2;
     }
        public double getCircumference() {
     return 2 * PI * radius;
     }

    }
            
